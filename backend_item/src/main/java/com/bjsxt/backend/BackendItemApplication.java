package com.bjsxt.backend;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * BackendItem服务启动类
 * @author wuge
 * @date 2020/3/27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableDistributedTransaction
public class BackendItemApplication {

    public static void main(String[] args){
        SpringApplication.run(BackendItemApplication.class, args);
    }
}
