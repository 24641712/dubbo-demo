package com.java1234.serviceimpl;

import com.java1234.service.DemoProviderService;

/**
 * Created by CCL on 2018/12/3 0003 上午 7:16
 *
 * @description:
 */
public class DemoProviderServiceImpl implements DemoProviderService {
    public String sayHello(String name) {

        return "服务001"+name;
    }
}
