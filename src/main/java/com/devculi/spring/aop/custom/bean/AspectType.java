/*
 * AspectType.java
 */
package com.devculi.spring.aop.custom.bean;

import java.lang.reflect.Constructor;

/**
 * @author ltduy
 */
/* Aspect type include Aspect, Class, Interface, Annotation, Enum, or Array */
public interface AspectType<T>
{
    String getName();

    Package getPackage();

    int getModifiers();

    Class<T> getJavaClass();

    @SuppressWarnings("rawtypes")
    Constructor getEnclosingConstructor();
}
