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
 * 用户
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-23 17:12:15
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghuEntity() {
		
	}
	
	public YonghuEntity(T t) {
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户密码
	 */
					
	private String yonghumima;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 住址
	 */
					
	private String zhuzhi;
	
	/**
	 * 户号
	 */
					
	private String huhao;
	
	/**
	 * 是否户主
	 */
					
	private String shifouhuzhu;
	
	/**
	 * 常驻人口
	 */
					
	private String changzhurenkou;
	
	/**
	 * 最高学历
	 */
					
	private String zuigaoxueli;
	
	/**
	 * 在读学校
	 */
					
	private String zaiduxuexiao;
	
	/**
	 * 特殊人群
	 */
					
	private String teshurenqun;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	
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
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户密码
	 */
	public void setYonghumima(String yonghumima) {
		this.yonghumima = yonghumima;
	}
	/**
	 * 获取：用户密码
	 */
	public String getYonghumima() {
		return yonghumima;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：住址
	 */
	public void setZhuzhi(String zhuzhi) {
		this.zhuzhi = zhuzhi;
	}
	/**
	 * 获取：住址
	 */
	public String getZhuzhi() {
		return zhuzhi;
	}
	/**
	 * 设置：户号
	 */
	public void setHuhao(String huhao) {
		this.huhao = huhao;
	}
	/**
	 * 获取：户号
	 */
	public String getHuhao() {
		return huhao;
	}
	/**
	 * 设置：是否户主
	 */
	public void setShifouhuzhu(String shifouhuzhu) {
		this.shifouhuzhu = shifouhuzhu;
	}
	/**
	 * 获取：是否户主
	 */
	public String getShifouhuzhu() {
		return shifouhuzhu;
	}
	/**
	 * 设置：常驻人口
	 */
	public void setChangzhurenkou(String changzhurenkou) {
		this.changzhurenkou = changzhurenkou;
	}
	/**
	 * 获取：常驻人口
	 */
	public String getChangzhurenkou() {
		return changzhurenkou;
	}
	/**
	 * 设置：最高学历
	 */
	public void setZuigaoxueli(String zuigaoxueli) {
		this.zuigaoxueli = zuigaoxueli;
	}
	/**
	 * 获取：最高学历
	 */
	public String getZuigaoxueli() {
		return zuigaoxueli;
	}
	/**
	 * 设置：在读学校
	 */
	public void setZaiduxuexiao(String zaiduxuexiao) {
		this.zaiduxuexiao = zaiduxuexiao;
	}
	/**
	 * 获取：在读学校
	 */
	public String getZaiduxuexiao() {
		return zaiduxuexiao;
	}
	/**
	 * 设置：特殊人群
	 */
	public void setTeshurenqun(String teshurenqun) {
		this.teshurenqun = teshurenqun;
	}
	/**
	 * 获取：特殊人群
	 */
	public String getTeshurenqun() {
		return teshurenqun;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}

}
