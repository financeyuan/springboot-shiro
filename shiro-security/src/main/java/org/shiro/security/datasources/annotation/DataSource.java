package org.shiro.security.datasources.annotation;

import java.lang.annotation.*;


/** 
* @author yuanpb
* @version 创建时间：2018年4月25日 上午10:50:01 
* 类说明：多数据源注解
*/ 
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
