package com.iop.cache.annotation;

import com.iop.cache.utils.KeyGenerators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 缓存更新
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CachePut {

    /**
     * 缓存名称
     * @return
     */
    String[] cacheNames() default {};

    /**
     * 缓存生命周期(单位：秒）
     * @return
     */
    long TTL() default 0;

    /**
     * 缓存key（唯一性）
     * @return
     */
    String keyExpression();

    /**
     * 是否异步
     * @return
     */
    boolean isAsync() default false;

    /**
     * 缓存KEY生成器
     * @return
     */
    KeyGenerators keyGenerator() default KeyGenerators.SHA;

}
