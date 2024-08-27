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


import com.cl.dao.XinwenfenleiDao;
import com.cl.entity.XinwenfenleiEntity;
import com.cl.service.XinwenfenleiService;
import com.cl.entity.view.XinwenfenleiView;

@Service("xinwenfenleiService")
public class XinwenfenleiServiceImpl extends ServiceImpl<XinwenfenleiDao, XinwenfenleiEntity> implements XinwenfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenfenleiEntity> page = this.selectPage(
                new Query<XinwenfenleiEntity>(params).getPage(),
                new EntityWrapper<XinwenfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenfenleiEntity> wrapper) {
		  Page<XinwenfenleiView> page =new Query<XinwenfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XinwenfenleiView> selectListView(Wrapper<XinwenfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenfenleiView selectView(Wrapper<XinwenfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
