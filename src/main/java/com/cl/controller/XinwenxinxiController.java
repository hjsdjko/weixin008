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

import com.cl.entity.XinwenxinxiEntity;
import com.cl.entity.view.XinwenxinxiView;

import com.cl.service.XinwenxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 新闻信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-23 17:12:15
 */
@RestController
@RequestMapping("/xinwenxinxi")
public class XinwenxinxiController {
    @Autowired
    private XinwenxinxiService xinwenxinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinwenxinxiEntity xinwenxinxi,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){
        EntityWrapper<XinwenxinxiEntity> ew = new EntityWrapper<XinwenxinxiEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);

		PageUtils page = xinwenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwenxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinwenxinxiEntity xinwenxinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date faburiqiend,
		HttpServletRequest request){
        EntityWrapper<XinwenxinxiEntity> ew = new EntityWrapper<XinwenxinxiEntity>();
                if(faburiqistart!=null) ew.ge("faburiqi", faburiqistart);
                if(faburiqiend!=null) ew.le("faburiqi", faburiqiend);

		PageUtils page = xinwenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwenxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinwenxinxiEntity xinwenxinxi){
       	EntityWrapper<XinwenxinxiEntity> ew = new EntityWrapper<XinwenxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinwenxinxi, "xinwenxinxi")); 
        return R.ok().put("data", xinwenxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinwenxinxiEntity xinwenxinxi){
        EntityWrapper< XinwenxinxiEntity> ew = new EntityWrapper< XinwenxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinwenxinxi, "xinwenxinxi")); 
		XinwenxinxiView xinwenxinxiView =  xinwenxinxiService.selectView(ew);
		return R.ok("查询新闻信息成功").put("data", xinwenxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinwenxinxiEntity xinwenxinxi = xinwenxinxiService.selectById(id);
		xinwenxinxi.setClicknum(xinwenxinxi.getClicknum()+1);
		xinwenxinxi.setClicktime(new Date());
		xinwenxinxiService.updateById(xinwenxinxi);
		xinwenxinxi = xinwenxinxiService.selectView(new EntityWrapper<XinwenxinxiEntity>().eq("id", id));
        return R.ok().put("data", xinwenxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinwenxinxiEntity xinwenxinxi = xinwenxinxiService.selectById(id);
		xinwenxinxi.setClicknum(xinwenxinxi.getClicknum()+1);
		xinwenxinxi.setClicktime(new Date());
		xinwenxinxiService.updateById(xinwenxinxi);
		xinwenxinxi = xinwenxinxiService.selectView(new EntityWrapper<XinwenxinxiEntity>().eq("id", id));
        return R.ok().put("data", xinwenxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinwenxinxiEntity xinwenxinxi, HttpServletRequest request){
    	xinwenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwenxinxi);
        xinwenxinxiService.insert(xinwenxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinwenxinxiEntity xinwenxinxi, HttpServletRequest request){
    	xinwenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwenxinxi);
        xinwenxinxiService.insert(xinwenxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinwenxinxiEntity xinwenxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinwenxinxi);
        xinwenxinxiService.updateById(xinwenxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinwenxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XinwenxinxiEntity xinwenxinxi, HttpServletRequest request,String pre){
        EntityWrapper<XinwenxinxiEntity> ew = new EntityWrapper<XinwenxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = xinwenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwenxinxi), params), params));
        return R.ok().put("data", page);
    }








}
