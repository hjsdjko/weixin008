package com.cl.dao;

import com.cl.entity.DiscussfuwuzhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussfuwuzhanView;


/**
 * 服务站评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface DiscussfuwuzhanDao extends BaseMapper<DiscussfuwuzhanEntity> {
	
	List<DiscussfuwuzhanView> selectListView(@Param("ew") Wrapper<DiscussfuwuzhanEntity> wrapper);

	List<DiscussfuwuzhanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuwuzhanEntity> wrapper);
	
	DiscussfuwuzhanView selectView(@Param("ew") Wrapper<DiscussfuwuzhanEntity> wrapper);
	

}
