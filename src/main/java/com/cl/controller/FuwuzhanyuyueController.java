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

import com.cl.entity.FuwuzhanyuyueEntity;
import com.cl.entity.view.FuwuzhanyuyueView;

import com.cl.service.FuwuzhanyuyueService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 服务站预约
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
@RestController
@RequestMapping("/fuwuzhanyuyue")
public class FuwuzhanyuyueController {
    @Autowired
    private FuwuzhanyuyueService fuwuzhanyuyueService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwuzhanyuyueEntity fuwuzhanyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fuwuzhanyuyue.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FuwuzhanyuyueEntity> ew = new EntityWrapper<FuwuzhanyuyueEntity>();

		PageUtils page = fuwuzhanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuzhanyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwuzhanyuyueEntity fuwuzhanyuyue, 
		HttpServletRequest request){
        EntityWrapper<FuwuzhanyuyueEntity> ew = new EntityWrapper<FuwuzhanyuyueEntity>();

		PageUtils page = fuwuzhanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuzhanyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwuzhanyuyueEntity fuwuzhanyuyue){
       	EntityWrapper<FuwuzhanyuyueEntity> ew = new EntityWrapper<FuwuzhanyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwuzhanyuyue, "fuwuzhanyuyue")); 
        return R.ok().put("data", fuwuzhanyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwuzhanyuyueEntity fuwuzhanyuyue){
        EntityWrapper< FuwuzhanyuyueEntity> ew = new EntityWrapper< FuwuzhanyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwuzhanyuyue, "fuwuzhanyuyue")); 
		FuwuzhanyuyueView fuwuzhanyuyueView =  fuwuzhanyuyueService.selectView(ew);
		return R.ok("查询服务站预约成功").put("data", fuwuzhanyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwuzhanyuyueEntity fuwuzhanyuyue = fuwuzhanyuyueService.selectById(id);
		fuwuzhanyuyue = fuwuzhanyuyueService.selectView(new EntityWrapper<FuwuzhanyuyueEntity>().eq("id", id));
        return R.ok().put("data", fuwuzhanyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwuzhanyuyueEntity fuwuzhanyuyue = fuwuzhanyuyueService.selectById(id);
		fuwuzhanyuyue = fuwuzhanyuyueService.selectView(new EntityWrapper<FuwuzhanyuyueEntity>().eq("id", id));
        return R.ok().put("data", fuwuzhanyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwuzhanyuyueEntity fuwuzhanyuyue, HttpServletRequest request){
    	fuwuzhanyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwuzhanyuyue);
        fuwuzhanyuyueService.insert(fuwuzhanyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwuzhanyuyueEntity fuwuzhanyuyue, HttpServletRequest request){
    	fuwuzhanyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwuzhanyuyue);
        fuwuzhanyuyueService.insert(fuwuzhanyuyue);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuwuzhanyuyueEntity fuwuzhanyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwuzhanyuyue);
        fuwuzhanyuyueService.updateById(fuwuzhanyuyue);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwuzhanyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
