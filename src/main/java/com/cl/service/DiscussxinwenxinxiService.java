package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussxinwenxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxinwenxinxiView;


/**
 * 新闻信息评论表
 *
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface DiscussxinwenxinxiService extends IService<DiscussxinwenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinwenxinxiView> selectListView(Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	
   	DiscussxinwenxinxiView selectView(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	

}

