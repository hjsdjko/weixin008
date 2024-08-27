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


import com.cl.dao.DiscussxinwenxinxiDao;
import com.cl.entity.DiscussxinwenxinxiEntity;
import com.cl.service.DiscussxinwenxinxiService;
import com.cl.entity.view.DiscussxinwenxinxiView;

@Service("discussxinwenxinxiService")
public class DiscussxinwenxinxiServiceImpl extends ServiceImpl<DiscussxinwenxinxiDao, DiscussxinwenxinxiEntity> implements DiscussxinwenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinwenxinxiEntity> page = this.selectPage(
                new Query<DiscussxinwenxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxinwenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinwenxinxiEntity> wrapper) {
		  Page<DiscussxinwenxinxiView> page =new Query<DiscussxinwenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussxinwenxinxiView> selectListView(Wrapper<DiscussxinwenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinwenxinxiView selectView(Wrapper<DiscussxinwenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
