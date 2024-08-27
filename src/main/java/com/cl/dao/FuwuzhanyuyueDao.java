package com.cl.dao;

import com.cl.entity.FuwuzhanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FuwuzhanyuyueView;


/**
 * 服务站预约
 * 
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface FuwuzhanyuyueDao extends BaseMapper<FuwuzhanyuyueEntity> {
	
	List<FuwuzhanyuyueView> selectListView(@Param("ew") Wrapper<FuwuzhanyuyueEntity> wrapper);

	List<FuwuzhanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuzhanyuyueEntity> wrapper);
	
	FuwuzhanyuyueView selectView(@Param("ew") Wrapper<FuwuzhanyuyueEntity> wrapper);
	

}
