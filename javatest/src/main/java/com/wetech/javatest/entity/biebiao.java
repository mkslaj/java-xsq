package com.wetech.javatest.entity;

import lombok.Data;

@Data
public class biebiao {
    private String id;//
    private String name;//番号
    private String plJisshiKomokuc;//実施項目
    private String plHyoukaKijunc; //評価基準
    private String plJisshiJikiNendoc;//実施時期年度
    private String plJisshiJikiNconsumer; //実施時期四半期
    private String cd;
    private String plkisesoji;//機械装置
    private String plDonyuNendo__c; //導入年度
    private String plDonyuJiki__c; //導入時期
    private boolean plKaigaiKounyu__c; //海外での購入有無
    private String plPrice__c; //単価
    private String plAmount__c ;//数量
    private String plTotalAmount__c; //合計金額
}
