package com.cl.dao;

import com.cl.entity.QuxiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QuxiaoyuyueView;


/**
 * 取消预约
 * 
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
public interface QuxiaoyuyueDao extends BaseMapper<QuxiaoyuyueEntity> {
	
	List<QuxiaoyuyueView> selectListView(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);

	List<QuxiaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
	
	QuxiaoyuyueView selectView(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
	

}
