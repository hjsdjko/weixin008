package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FuwuzhanyuyueEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FuwuzhanyuyueView;


/**
 * 服务站预约
 *
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface FuwuzhanyuyueService extends IService<FuwuzhanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuzhanyuyueView> selectListView(Wrapper<FuwuzhanyuyueEntity> wrapper);
   	
   	FuwuzhanyuyueView selectView(@Param("ew") Wrapper<FuwuzhanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuzhanyuyueEntity> wrapper);
   	

}

