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


import com.cl.dao.DiscussfuwuzhanDao;
import com.cl.entity.DiscussfuwuzhanEntity;
import com.cl.service.DiscussfuwuzhanService;
import com.cl.entity.view.DiscussfuwuzhanView;

@Service("discussfuwuzhanService")
public class DiscussfuwuzhanServiceImpl extends ServiceImpl<DiscussfuwuzhanDao, DiscussfuwuzhanEntity> implements DiscussfuwuzhanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuwuzhanEntity> page = this.selectPage(
                new Query<DiscussfuwuzhanEntity>(params).getPage(),
                new EntityWrapper<DiscussfuwuzhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuwuzhanEntity> wrapper) {
		  Page<DiscussfuwuzhanView> page =new Query<DiscussfuwuzhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussfuwuzhanView> selectListView(Wrapper<DiscussfuwuzhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuwuzhanView selectView(Wrapper<DiscussfuwuzhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
