package com.cl.dao;

import com.cl.entity.FuwuzhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FuwuzhanView;


/**
 * 服务站
 * 
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface FuwuzhanDao extends BaseMapper<FuwuzhanEntity> {
	
	List<FuwuzhanView> selectListView(@Param("ew") Wrapper<FuwuzhanEntity> wrapper);

	List<FuwuzhanView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuzhanEntity> wrapper);
	
	FuwuzhanView selectView(@Param("ew") Wrapper<FuwuzhanEntity> wrapper);
	

}
