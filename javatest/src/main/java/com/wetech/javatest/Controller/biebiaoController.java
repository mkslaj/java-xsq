package com.wetech.javatest.Controller;
import com.wetech.javatest.entity.biebiao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wetech.javatest.service.biebiaoService;
@CrossOrigin(origins ="http://localhost:8081")
//フロントエンドドメイン
@Slf4j
@RestController
//クロスドメイン・アクセス
@RequestMapping("/biebiao")
public class biebiaoController {
 private  biebiaoService biebiaoService;
 @Autowired
 public biebiaoController(biebiaoService biebiaoService){
     this.biebiaoService=biebiaoService;
 }
 @PostMapping("/quebiebiao")
    public void saveBiebiao(@RequestBody biebiao biebiao){
     biebiaoService.saveBiebiao(biebiao);
 }
}
