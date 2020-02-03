package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.mapper.NewsShowDao;
import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.model.vo.PageDto;
import com.mars.marsimmigrants.service.testService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service.impl
 * @date 2020/2/2 16:16 星期日
 */
@Service
public class testServiceImpl implements testService {
    @Resource
    private NewsShowDao td;
    @Override
    public int nd_newsCount() {
        return td.nd_newsCount();
    }

    @Override
    public PageDto<News> pdft(Integer pageNo, Integer pageSize) {
        //查询总数
        Integer total=td.nd_newsCount();
        //设置当前页码
        Integer offset=( pageNo - 1 ) *  pageSize;
        List<News> nnList=td.selectnNd_news(offset, pageSize);
        //创建PageDto
        PageDto<News>nnPageDto=new PageDto<>();
        nnPageDto.setTotal((long)total);
        nnPageDto.setPageNo(pageNo);
        nnPageDto.setPageSize(pageSize);
        nnPageDto.setPages(total%pageSize==1 ? total%pageSize : total%pageSize+1);
        nnPageDto.setData(nnList);



        return nnPageDto;
    }
}
