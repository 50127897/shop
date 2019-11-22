package com.shop.mapper;

import com.shop.pojo.ImageComment;
import com.shop.pojo.ImageCommentExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageCommentMapper {
    int countByExample(ImageCommentExample example);

    int deleteByExample(ImageCommentExample example);

    int deleteByPrimaryKey(BigDecimal ipId);

    int insert(ImageComment record);

    int insertSelective(ImageComment record);

    List<ImageComment> selectByExample(ImageCommentExample example);

    ImageComment selectByPrimaryKey(BigDecimal ipId);

    int updateByExampleSelective(@Param("record") ImageComment record, @Param("example") ImageCommentExample example);

    int updateByExample(@Param("record") ImageComment record, @Param("example") ImageCommentExample example);

    int updateByPrimaryKeySelective(ImageComment record);

    int updateByPrimaryKey(ImageComment record);
}