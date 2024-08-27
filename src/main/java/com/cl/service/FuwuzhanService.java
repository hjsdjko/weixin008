package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FuwuzhanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FuwuzhanView;


/**
 * 服务站
 *
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface FuwuzhanService extends IService<FuwuzhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuzhanView> selectListView(Wrapper<FuwuzhanEntity> wrapper);
   	
   	FuwuzhanView selectView(@Param("ew") Wrapper<FuwuzhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuzhanEntity> wrapper);
   	

}

