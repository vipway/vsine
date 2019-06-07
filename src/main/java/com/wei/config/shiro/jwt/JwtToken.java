package com.wei.config.shiro.jwt;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * JwtToken
 * @author Jiawei.Mao
 * @date 2019/06/07 14:06
 */
public class JwtToken implements AuthenticationToken {
    /**
     * Token
     */
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
