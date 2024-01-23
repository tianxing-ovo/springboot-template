package com.ltx.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 如果有多个CommandLineRunner接口实现类,使用@Order指定执行顺序
 */
@Component
@Order(1)
public class StartupRunner implements CommandLineRunner {

    /**
     * 应用程序启动完成后(Spring容器初始化完成并开始运行后),主线程执行run()方法
     */
    @Override
    public void run(String... args) {
        System.out.println("spring boot start up");
    }
}
