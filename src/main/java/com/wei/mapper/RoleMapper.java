package com.wei.mapper;

import com.wei.model.RoleDto;
import com.wei.model.UserDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * RoleMapper
 * @author Jiawei.Mao
 * @date 2019/06/07 14:42
 */
public interface RoleMapper extends Mapper<RoleDto> {
    /**
     * 根据User查询Role
     * @param userDto
     * @return java.util.List<com.wei.model.RoleDto>
     * @author Jiawei.Mao
     * @date 2019/06/07 11:30
     */
    List<RoleDto> findRoleByUser(UserDto userDto);
}