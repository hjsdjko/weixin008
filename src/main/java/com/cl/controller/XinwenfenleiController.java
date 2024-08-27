package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.XinwenfenleiEntity;
import com.cl.entity.view.XinwenfenleiView;

import com.cl.service.XinwenfenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 新闻分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-23 17:12:15
 */
@RestController
@RequestMapping("/xinwenfenlei")
public class XinwenfenleiController {
    @Autowired
    private XinwenfenleiService xinwenfenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinwenfenleiEntity xinwenfenlei,
		HttpServletRequest request){
        EntityWrapper<XinwenfenleiEntity> ew = new EntityWrapper<XinwenfenleiEntity>();

		PageUtils page = xinwenfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwenfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinwenfenleiEntity xinwenfenlei, 
		HttpServletRequest request){
        EntityWrapper<XinwenfenleiEntity> ew = new EntityWrapper<XinwenfenleiEntity>();

		PageUtils page = xinwenfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwenfenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinwenfenleiEntity xinwenfenlei){
       	EntityWrapper<XinwenfenleiEntity> ew = new EntityWrapper<XinwenfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinwenfenlei, "xinwenfenlei")); 
        return R.ok().put("data", xinwenfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinwenfenleiEntity xinwenfenlei){
        EntityWrapper< XinwenfenleiEntity> ew = new EntityWrapper< XinwenfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinwenfenlei, "xinwenfenlei")); 
		XinwenfenleiView xinwenfenleiView =  xinwenfenleiService.selectView(ew);
		return R.ok("查询新闻分类成功").put("data", xinwenfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinwenfenleiEntity xinwenfenlei = xinwenfenleiService.selectById(id);
		xinwenfenlei = xinwenfenleiService.selectView(new EntityWrapper<XinwenfenleiEntity>().eq("id", id));
        return R.ok().put("data", xinwenfenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinwenfenleiEntity xinwenfenlei = xinwenfenleiService.selectById(id);
		xinwenfenlei = xinwenfenleiService.selectView(new EntityWrapper<XinwenfenleiEntity>().eq("id", id));
        return R.ok().put("data", xinwenfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinwenfenleiEntity xinwenfenlei, HttpServletRequest request){
        if(xinwenfenleiService.selectCount(new EntityWrapper<XinwenfenleiEntity>().eq("xinwenfenlei", xinwenfenlei.getXinwenfenlei()))>0) {
            return R.error("新闻分类已存在");
        }
    	xinwenfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwenfenlei);
        xinwenfenleiService.insert(xinwenfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinwenfenleiEntity xinwenfenlei, HttpServletRequest request){
        if(xinwenfenleiService.selectCount(new EntityWrapper<XinwenfenleiEntity>().eq("xinwenfenlei", xinwenfenlei.getXinwenfenlei()))>0) {
            return R.error("新闻分类已存在");
        }
    	xinwenfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwenfenlei);
        xinwenfenleiService.insert(xinwenfenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinwenfenleiEntity xinwenfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinwenfenlei);
        xinwenfenleiService.updateById(xinwenfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinwenfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
