package mengfw.spring.cloud.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengfw on 2017/7/31.
 */
@RestController
public class HelloController {
    @Value("${name}")
    private String name;
    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "hello " + name;
    }
}
