package com.shao.ray.system;

import com.shao.ray.base.BaseJunit;
import com.shao.ray.common.persistence.dao.UserMapper;
import com.shao.ray.modular.system.dao.UserMgrDao;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 用户测试
 *
 *
 * @date 2017-04-27 17:05
 */
public class UserTest extends BaseJunit {

    @Resource
    UserMgrDao userMgrDao;

    @Resource
    UserMapper userMapper;

    @Test
    public void userTest() throws Exception {

    }

}
