package com.cl.entity.view;

import com.cl.entity.FuwuzhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 服务站
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
@TableName("fuwuzhan")
public class FuwuzhanView  extends FuwuzhanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwuzhanView(){
	}
 
 	public FuwuzhanView(FuwuzhanEntity fuwuzhanEntity){
 	try {
			BeanUtils.copyProperties(this, fuwuzhanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
