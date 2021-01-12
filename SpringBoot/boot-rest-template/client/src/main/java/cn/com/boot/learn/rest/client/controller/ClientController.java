package cn.com.boot.learn.rest.client.controller;

import cn.com.boot.learn.rest.client.client.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/12
 */
@RestController
public class ClientController {

    @Autowired
    ServiceClient client;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/client/api")
    public String demoApi(String str){
        String ServiceResponse = client.demoApi(str);
        return "=== Client Port : " + port + "----> [" + ServiceResponse + "]";
    }
}
