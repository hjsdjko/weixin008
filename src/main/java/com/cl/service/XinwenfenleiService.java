package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XinwenfenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinwenfenleiView;


/**
 * 新闻分类
 *
 * @author 
 * @email 
 * @date 2024-04-23 17:12:15
 */
public interface XinwenfenleiService extends IService<XinwenfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenfenleiView> selectListView(Wrapper<XinwenfenleiEntity> wrapper);
   	
   	XinwenfenleiView selectView(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenfenleiEntity> wrapper);
   	

}

