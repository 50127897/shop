package com.shop.mapper;

import com.shop.pojo.Comments;
import com.shop.pojo.CommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentsMapper {
    int countByExample(CommentsExample example);

    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(String cid);

    int insert(Comments record);

    int insertSelective(Comments record);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
    
    //根据商品ID查询所有评价的详细信息[带图片] 返回值:一个商品的所有评价的集合 2019-8-2
    List<Comments> selectCommentWithImageByPid(String pid);
}