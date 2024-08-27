package com.cl.dao;

import com.cl.entity.DiscussxinwenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxinwenxinxiView;


/**
 * 新闻信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface DiscussxinwenxinxiDao extends BaseMapper<DiscussxinwenxinxiEntity> {
	
	List<DiscussxinwenxinxiView> selectListView(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);

	List<DiscussxinwenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
	
	DiscussxinwenxinxiView selectView(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
	

}
