package com.cl.entity.view;

import com.cl.entity.FuwuzhanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 服务站预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-23 17:12:16
 */
@TableName("fuwuzhanyuyue")
public class FuwuzhanyuyueView  extends FuwuzhanyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwuzhanyuyueView(){
	}
 
 	public FuwuzhanyuyueView(FuwuzhanyuyueEntity fuwuzhanyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, fuwuzhanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
