package com.fy.fyblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author: fy
 * @create: 2022-05-16 17:33
 **/
public class JwtToken implements AuthenticationToken {
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
