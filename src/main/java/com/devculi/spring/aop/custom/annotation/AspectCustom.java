/*
 * AspectCustom.java
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
@Target(ElementType.TYPE)
public @interface AspectCustom
{
   //specific default value value for annotation
   String value() default "";
}
