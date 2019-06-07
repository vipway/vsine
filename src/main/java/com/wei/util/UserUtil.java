package com.wei.util;

import com.wei.exception.CustomException;
import com.wei.mapper.UserMapper;
import com.wei.model.UserDto;
import com.wei.model.common.Constant;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 获取当前登录用户工具类
 * @author Jiawei.Mao
 * @date 2019/3/15 11:45
 */
@Component
public class UserUtil {

    private final UserMapper userMapper;

    @Autowired
    public UserUtil(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 获取当前登录用户
     * @param
     * @return com.wei.model.UserDto
     * @author Jiawei.Mao
     * @date 2019/3/15 11:48
     */
    public UserDto getUser() {
        String token = SecurityUtils.getSubject().getPrincipal().toString();
        // 解密获得Account
        String account = JwtUtil.getClaim(token, Constant.ACCOUNT);
        UserDto userDto = new UserDto();
        userDto.setAccount(account);
        userDto = userMapper.selectOne(userDto);
        // 用户是否存在
        if (userDto == null) {
            throw new CustomException("该帐号不存在(The account does not exist.)");
        }
        return userDto;
    }

    /**
     * 获取当前登录用户Id
     * @param
     * @return com.wei.model.UserDto
     * @author Jiawei.Mao
     * @date 2019/3/15 11:48
     */
    public Integer getUserId() {
        return getUser().getId();
    }

    /**
     * 获取当前登录用户Token
     * @param
     * @return com.wei.model.UserDto
     * @author Jiawei.Mao
     * @date 2019/3/15 11:48
     */
    public String getToken() {
        return SecurityUtils.getSubject().getPrincipal().toString();
    }

    /**
     * 获取当前登录用户Account
     * @param
     * @return com.wei.model.UserDto
     * @author Jiawei.Mao
     * @date 2019/3/15 11:48
     */
    public String getAccount() {
        String token = SecurityUtils.getSubject().getPrincipal().toString();
        // 解密获得Account
        return JwtUtil.getClaim(token, Constant.ACCOUNT);
    }
}
