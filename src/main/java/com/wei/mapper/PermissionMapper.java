package com.wei.mapper;

import com.wei.model.PermissionDto;
import com.wei.model.RoleDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * PermissionMapper
 * @author Jiawei.Mao
 * @date 2019/06/07 14:42
 */
public interface PermissionMapper extends Mapper<PermissionDto> {
    /**
     * 根据Role查询Permission
     * @param roleDto
     * @return java.util.List<com.wei.model.PermissionDto>
     * @author Jiawei.Mao
     * @date 2019/06/07 11:30
     */
    List<PermissionDto> findPermissionByRole(RoleDto roleDto);
}