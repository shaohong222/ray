package com.shao.ray.biz;

import com.shao.ray.base.BaseJunit;
import com.shao.ray.modular.biz.service.ITestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 业务测试
 *
 *
 * @date 2017-06-23 23:12
 */
public class BizTest extends BaseJunit {

    @Autowired
    ITestService testService;

    @Test
    public void test() {
        //testService.testRay();

        testService.testBiz();

        //testService.testAll();
    }
}
