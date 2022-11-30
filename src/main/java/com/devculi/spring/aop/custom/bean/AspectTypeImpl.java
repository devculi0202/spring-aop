/*
 * AspectTypeImpl.java
 */
package com.devculi.spring.aop.custom.bean;

import java.lang.reflect.Constructor;

/**
 * @author ltduy
 */
public class AspectTypeImpl<T> implements AspectType<T>
{
    private Class<?> clazz;
    public AspectTypeImpl(Class<?> clazz) {
        this.clazz = clazz;
    }

    /**
     * @see com.devculi.spring.aop.custom.bean.AspectType#getName()
     */
    @Override
    public String getName()
    {
        return clazz.getName();
    }

    /**
     * @see com.devculi.spring.aop.custom.bean.AspectType#getPackage()
     */
    @Override
    public Package getPackage()
    {
        return clazz.getPackage();
    }

    /**
     * @see com.devculi.spring.aop.custom.bean.AspectType#getModifiers()
     */
    @Override
    public int getModifiers()
    {
        return clazz.getModifiers();
    }

    /**
     * @see com.devculi.spring.aop.custom.bean.AspectType#getJavaClass()
     */
    @Override
    public Class<T> getJavaClass()
    {
        return null;
    }

    /**
     * @see com.devculi.spring.aop.custom.bean.AspectType#getEnclosingConstructor()
     */
    @Override
    public Constructor getEnclosingConstructor()
    {
        return clazz.getEnclosingConstructor();
    }

}
