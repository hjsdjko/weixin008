package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussfuwuzhanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussfuwuzhanView;


/**
 * 服务站评论表
 *
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface DiscussfuwuzhanService extends IService<DiscussfuwuzhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuwuzhanView> selectListView(Wrapper<DiscussfuwuzhanEntity> wrapper);
   	
   	DiscussfuwuzhanView selectView(@Param("ew") Wrapper<DiscussfuwuzhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuwuzhanEntity> wrapper);
   	

}

