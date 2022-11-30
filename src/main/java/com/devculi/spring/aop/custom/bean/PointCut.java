/*
 * PointCut.java
 */
package com.devculi.spring.aop.custom.bean;

/**
 * @author devculi
 */
public interface PointCut
{
    String getName();

    int getModifiers();


    String[] getParameterNames();

    AspectType<?>[] getParameterTypes();

}
