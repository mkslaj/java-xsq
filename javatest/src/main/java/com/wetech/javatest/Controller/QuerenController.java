package com.wetech.javatest.Controller;

import com.wetech.javatest.service.QuerenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//跨域访问
@CrossOrigin(origins =" http://localhost:8081")
//跟前端同一个域名
@RequestMapping("/apply")
//跟前端同一个跟目录
public class QuerenController {
    private QuerenService quirenService;
    @Autowired
    public QuerenController(QuerenService querenService){}
}
