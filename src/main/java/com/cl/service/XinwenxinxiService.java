package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XinwenxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinwenxinxiView;


/**
 * 新闻信息
 *
 * @author 
 * @email 
 * @date 2024-04-23 17:12:15
 */
public interface XinwenxinxiService extends IService<XinwenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenxinxiView> selectListView(Wrapper<XinwenxinxiEntity> wrapper);
   	
   	XinwenxinxiView selectView(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenxinxiEntity> wrapper);
   	

}

