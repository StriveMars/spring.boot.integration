package cn.com.boot.learn.rest.server.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Service APP
 *
 *  @author ：Strive Mars
 *  @since  ：2021/1/12
 */
@RestController
public class ServiceApi {

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/service/api")
    public String demoApi(@RequestBody String str){
        return "API Service Port : " + port + "Request Success";
    }
}
