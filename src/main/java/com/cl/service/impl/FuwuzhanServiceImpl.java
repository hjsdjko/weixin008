package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.FuwuzhanDao;
import com.cl.entity.FuwuzhanEntity;
import com.cl.service.FuwuzhanService;
import com.cl.entity.view.FuwuzhanView;

@Service("fuwuzhanService")
public class FuwuzhanServiceImpl extends ServiceImpl<FuwuzhanDao, FuwuzhanEntity> implements FuwuzhanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuzhanEntity> page = this.selectPage(
                new Query<FuwuzhanEntity>(params).getPage(),
                new EntityWrapper<FuwuzhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuzhanEntity> wrapper) {
		  Page<FuwuzhanView> page =new Query<FuwuzhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FuwuzhanView> selectListView(Wrapper<FuwuzhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuzhanView selectView(Wrapper<FuwuzhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
