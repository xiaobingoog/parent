package com.mybatis.generator;

public interface BaseDao<T> {
    
    int insert(T record);
    
    int insertSelective(T record);
    
    int deleteByPrimaryKey(Integer id);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
