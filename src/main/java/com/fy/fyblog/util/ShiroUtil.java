package com.fy.fyblog.util;

import com.fy.fyblog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author: fy
 * @create: 2022-05-16 20:35
 **/
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
