package com.lagou.service;

import com.lagou.domain.Role;

import java.util.List;

public interface RoleService {

    /*
    * 查找所有的角色
    * */
    public List<Role> findAllRole(Role role);
}
