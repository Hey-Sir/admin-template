package com.wisdom.admin.utils;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;

/**
 * description:
 *  简单封装orika, 实现深度转换Bean<->Bean的Mapper.
 *  仅适用于普通的bean, 如果遇到性能瓶颈请使用传统的setter *
 * @author crm
 * @version 1.0
 * @date 2020/8/28
 */
public class OrikaMapper {

    public static final MapperFacade FACADE;

    static {
        final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        FACADE = mapperFactory.getMapperFacade();
    }

    private OrikaMapper() {
    }

    /**
     * 基于Dozer转换对象的类型.
     */
    public static <S, D> D map(S source, Class<D> destinationClass) {
        return FACADE.map(source, destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public static <S, D> List<D> mapList(Iterable<S> sourceList, Class<D> destinationClass) {
        return FACADE.mapAsList(sourceList, destinationClass);
    }

}
