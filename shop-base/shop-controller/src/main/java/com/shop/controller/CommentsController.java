package com.shop.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.shop.pojo.Comments;
import com.shop.pojo.ImageComment;
import com.shop.pojo.Product;
import com.shop.pojo.ProductSpec;
import com.shop.pojo.Users;
import com.shop.service.CommentService;
import com.shop.service.ImageCommentService;
import com.shop.service.OrderitemService;
import com.shop.service.ProductService;
import com.shop.service.StockBackStageService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: CommentsController
 * @author: snypxk
 * @Description: TODO
 * @date: 2019年8月12日
 * @Other:
 */
@Controller
@RequestMapping(value = "/Comments")
public class CommentsController {

	@Autowired
	private ProductService productService;

	@Autowired
	private CommentService commentService;

	@Autowired
	private ImageCommentService imageCommentService;

	@Autowired
	private StockBackStageService stockBackStageService;
	
	@Autowired
	private OrderitemService orderitemService;

	/**
	 * @Description: 进入评论界面
	 * @param model
	 * @param pid
	 * @param orderid
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/commentOnProduct")
	public String toCommentOnProduct(Model model, String pid, String oiId) {
		List<ProductSpec> specAndStoreList = stockBackStageService.getStockByPid(pid);
		Product productDetial = productService.queryPoductWithImageByPid(pid);
		productDetial.setSpecList(specAndStoreList);
		model.addAttribute("productDetial", productDetial);
		List<Product> productLike = productService.queryProductByLike();
		model.addAttribute("productLike", productLike);
		List<Comments> commentsList = commentService.queryCommentWithIMGByPid(pid);
		model.addAttribute("commentsList", commentsList);
		model.addAttribute("oiId", oiId);
		model.addAttribute("pid", pid);
		//System.out.println(pid);
		return "CommentsJSP/commentOnProduct";
	}

	/**
	 * @Description: 提交评论
	 * @param model
	 * @param orderid
	 * @param pid
	 * @param cdetail
	 * @param pictureFile
	 * @param request
	 * @return
	 * @throws Exception
	 * @return String
	 */
	@RequestMapping(value = "/summitComment", method = RequestMethod.POST)
	public String summitCommentOnProduct(Model model, String oiId, String pid, String cdetail,
			MultipartFile pictureFile, HttpServletRequest request) throws Exception {

		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		String userid = user.getUserid();

		Comments comment = new Comments();
		comment.setCid(UUIDUtil.get16UUID());
		System.out.println(pid);
		comment.setPid(pid);
		comment.setUserid(userid);
		comment.setCtime(new Date());
		comment.setCdetail(cdetail);
		commentService.insertComment(comment);

		//如果用户评论时有上传图片
		if (pictureFile!=null) {
			String newname = UUIDUtil.get16UUID();
			String oldName = pictureFile.getOriginalFilename();
			String sux = oldName.substring(oldName.lastIndexOf("."));
			File file = new File("/root/shopIMG/" + newname + sux);
			pictureFile.transferTo(file);

			ImageComment imageComment = new ImageComment();
			imageComment.setIcRoute(newname + sux);
			imageComment.setCid(comment.getCid());
			imageCommentService.insertImageComment(imageComment);
		}
		
		orderitemService.updateOrderItemCFByOiID(oiId);

		List<ProductSpec> specAndStoreList = stockBackStageService.getStockByPid(pid);
		Product productDetial = productService.queryPoductWithImageByPid(pid);
		productDetial.setSpecList(specAndStoreList);
		model.addAttribute("productDetial", productDetial);
		List<Product> productLike = productService.queryProductByLike();
		model.addAttribute("productLike", productLike);
		List<Comments> commentsList = commentService.queryCommentWithIMGByPid(pid);
		model.addAttribute("commentsList", commentsList);

		return "ProductJSP/product_detail";
	}
}