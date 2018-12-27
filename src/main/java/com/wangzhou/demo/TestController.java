package com.wangzhou.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IDEA
 * author:wangzhou
 * Data:2018/11/7
 * Time:11:16
 **/
@RestController
public class TestController {
    @GetMapping("/test")
    public  long test(){
        return 200;
    }
}
