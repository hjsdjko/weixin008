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


import com.cl.dao.FuwuzhanyuyueDao;
import com.cl.entity.FuwuzhanyuyueEntity;
import com.cl.service.FuwuzhanyuyueService;
import com.cl.entity.view.FuwuzhanyuyueView;

@Service("fuwuzhanyuyueService")
public class FuwuzhanyuyueServiceImpl extends ServiceImpl<FuwuzhanyuyueDao, FuwuzhanyuyueEntity> implements FuwuzhanyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuzhanyuyueEntity> page = this.selectPage(
                new Query<FuwuzhanyuyueEntity>(params).getPage(),
                new EntityWrapper<FuwuzhanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuzhanyuyueEntity> wrapper) {
		  Page<FuwuzhanyuyueView> page =new Query<FuwuzhanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FuwuzhanyuyueView> selectListView(Wrapper<FuwuzhanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuzhanyuyueView selectView(Wrapper<FuwuzhanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
