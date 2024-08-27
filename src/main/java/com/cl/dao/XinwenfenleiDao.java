package com.cl.dao;

import com.cl.entity.XinwenfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinwenfenleiView;


/**
 * 新闻分类
 * 
 * @author 
 * @email 
 * @date 2024-04-23 17:12:15
 */
public interface XinwenfenleiDao extends BaseMapper<XinwenfenleiEntity> {
	
	List<XinwenfenleiView> selectListView(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);

	List<XinwenfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
	
	XinwenfenleiView selectView(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
	

}
