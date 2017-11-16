package com.shao.ray.modular.system.service;

/**
 * 字典服务
 *
 *
 * @date 2017-04-27 17:00
 */
public interface IDictService {

    /**
     * 添加字典
     *
     *
     * @Date 2017/4/27 17:01
     */
    void addDict(String dictName, String dictValues);

    /**
     * 编辑字典
     *
     *
     * @Date 2017/4/28 11:01
     */
    void editDict(Integer dictId, String dictName, String dicts);

    /**
     * 删除字典
     *
     *
     * @Date 2017/4/28 11:39
     */
    void delteDict(Integer dictId);

}
