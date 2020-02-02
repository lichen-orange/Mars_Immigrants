package com.mars.marsimmigrants.mapper;

import com.mars.marsimmigrants.model.entity.NdNews;
import com.mars.marsimmigrants.model.entity.NdPrograms;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.mapper
 * @author杨帆
 * @date 2020/1/28 12:08 星期二
 */
@Mapper
public interface NdOptionsDao {
    //模糊查询
    List<NdNews> getNewsList(@Param("content") String content);

    List<NdPrograms> getProgramsList(@Param("content") String content);

    //修改用户密码
    int update(@Param("id") String id, @Param("updatePasd") String updatePasd);

    //上传项目
    int items(@Param("title") String title, @Param("content") String content, @Param("comment") String comment);

    //上传图片
    int img(@Param("programs_pic_address") String programs_pic_address);


}
