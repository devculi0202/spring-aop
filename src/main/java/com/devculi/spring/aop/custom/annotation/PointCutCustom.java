/*
 * PointCutCustom.java
 */
package com.devculi.spring.aop.custom.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author devculi
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PointCutCustom
{
  String value() default "";

  String argNames() default "";

}
