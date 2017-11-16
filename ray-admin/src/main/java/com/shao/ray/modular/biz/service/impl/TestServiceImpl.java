package com.shao.ray.modular.biz.service.impl;

import com.shao.ray.common.constant.DSEnum;
import com.shao.ray.common.persistence.dao.TestMapper;
import com.shao.ray.common.persistence.model.Test;
import com.shao.ray.core.mutidatasource.annotion.DataSource;
import com.shao.ray.modular.biz.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试服务
 *
 *
 * @date 2017-06-23 23:02
 */
@Service
public class TestServiceImpl implements ITestService {


    @Autowired
    TestMapper testMapper;

    @Override
    @DataSource(name = DSEnum.DATA_SOURCE_BIZ)
    public void testBiz() {
        Test test = testMapper.selectById(1);
        test.setId(22);
        test.insert();
    }


    @Override
    @DataSource(name = DSEnum.DATA_SOURCE_RAY)
    public void testRay() {
        Test test = testMapper.selectById(1);
        test.setId(33);
        test.insert();
    }

    @Override
    @Transactional
    public void testAll() {
        testBiz();
        testRay();
        //int i = 1 / 0;
    }

}
