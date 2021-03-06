package com.heleeos.blog.mapper;

import com.heleeos.blog.bean.Manager;

public interface ManagerMapper {

    public int insert(Manager bean) throws Exception;
        
    public int update(Manager bean) throws Exception;

    public int updataState(Integer id, Byte state) throws Exception;
    
    public int updateLoginTime(Integer id) throws Exception;
    
    public Manager get(String username, String password) throws Exception;
}