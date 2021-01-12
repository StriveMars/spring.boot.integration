package cn.com.boot.learn.rest.client.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/12
 */
@Service
public class ServiceClient {

    @Autowired
    RestTemplate restTemplate;

    private static String BASIC_URL ="http://localhost:9001";

    public String demoApi(String str) {
        return restTemplate.postForObject(BASIC_URL + "/service/api", str, String.class);
    }

}
