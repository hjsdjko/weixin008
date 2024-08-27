package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 服务站
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
@TableName("fuwuzhan")
public class FuwuzhanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FuwuzhanEntity() {
		
	}
	
	public FuwuzhanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 服务站名称
	 */
					
	private String fuwuzhanmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 服务时间
	 */
					
	private String fuwushijian;
	
	/**
	 * 服务站地址
	 */
					
	private String fuwuzhandizhi;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 可约人数
	 */
					
	private Integer keyuerenshu;
	
	/**
	 * 服务站详情
	 */
					
	private String fuwuzhanxiangqing;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：服务站名称
	 */
	public void setFuwuzhanmingcheng(String fuwuzhanmingcheng) {
		this.fuwuzhanmingcheng = fuwuzhanmingcheng;
	}
	/**
	 * 获取：服务站名称
	 */
	public String getFuwuzhanmingcheng() {
		return fuwuzhanmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：服务时间
	 */
	public void setFuwushijian(String fuwushijian) {
		this.fuwushijian = fuwushijian;
	}
	/**
	 * 获取：服务时间
	 */
	public String getFuwushijian() {
		return fuwushijian;
	}
	/**
	 * 设置：服务站地址
	 */
	public void setFuwuzhandizhi(String fuwuzhandizhi) {
		this.fuwuzhandizhi = fuwuzhandizhi;
	}
	/**
	 * 获取：服务站地址
	 */
	public String getFuwuzhandizhi() {
		return fuwuzhandizhi;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：可约人数
	 */
	public void setKeyuerenshu(Integer keyuerenshu) {
		this.keyuerenshu = keyuerenshu;
	}
	/**
	 * 获取：可约人数
	 */
	public Integer getKeyuerenshu() {
		return keyuerenshu;
	}
	/**
	 * 设置：服务站详情
	 */
	public void setFuwuzhanxiangqing(String fuwuzhanxiangqing) {
		this.fuwuzhanxiangqing = fuwuzhanxiangqing;
	}
	/**
	 * 获取：服务站详情
	 */
	public String getFuwuzhanxiangqing() {
		return fuwuzhanxiangqing;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
