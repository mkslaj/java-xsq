package com.wetech.javatest.Controller;

import com.wetech.javatest.entity.Queren;
import com.wetech.javatest.service.QuerenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins ="http://localhost:8081")
//フロントエンドドメイン
@Slf4j
@RestController
//クロスドメイン・アクセス
@RequestMapping("/apply")
//フロントエンドと同じで目次public
public class QuerenController {
    private QuerenService querenService;
    @Autowired
    //QuerenServiceのイメモ
    public QuerenController(QuerenService querenService) {
        this.querenService = querenService;
    }
    @PostMapping("/queren")
    public void saveQueren(@RequestBody Queren queren) {
    querenService.saveQueren(queren);
    }
}
