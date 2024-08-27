package com.cl.dao;

import com.cl.entity.XinwenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinwenxinxiView;


/**
 * 新闻信息
 * 
 * @author 
 * @email 
 * @date 2024-04-23 17:12:15
 */
public interface XinwenxinxiDao extends BaseMapper<XinwenxinxiEntity> {
	
	List<XinwenxinxiView> selectListView(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);

	List<XinwenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
	
	XinwenxinxiView selectView(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
	

}
