package com.wetech.javatest.entity;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Queren {
    private Integer id;//primer key
    private Date now;//申請情報登録日
    private String aPLShinseisyaName;//画面入力した名前
    private String aPLAddressYubinNo3;//郵便番号（3桁）
    private String aPLAddressYubinNo4;//郵便番号（4桁）
    private String aPLAddressTodofuken;//都道府県
    private String aPLAddressShikuchoson;//市区町村
    private String aPLAddressBanchi;//字・番地等
    private String aPLAddressTodofukenKana ;//都道府県カナ
    private String aPLAddressShikuchosonKana;//市区町村カナ
    private String aPLAddressBanchiKana;//字・番地等カナ
    private String aPLAddressManshon;//マンション名等
    private String aPLDaihyoshaYakushoku;//代表者の役職
    private String aPLDaihyoshaName;//代表者の氏名
    private String aPLHojinNo;//法人番号
    private String aPLTantoshaName;//担当者の氏名
    private String aPLCSTEL;//電話番号
    private String aPLCSFAX;//FAX番号
    private String aPLCSTantoshaMail;//担当者メールアドレス
    private String aPLCSKakuninyoMail;//確認用メールアドレス
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public String getaPLShinseisyaName() {
        return aPLShinseisyaName;
    }

    public void setaPLShinseisyaName(String aPLShinseisyaName) {
        this.aPLShinseisyaName = aPLShinseisyaName;
    }

    public String getaPLAddressYubinNo3() {
        return aPLAddressYubinNo3;
    }

    public void setaPLAddressYubinNo3(String aPLAddressYubinNo3) {
        this.aPLAddressYubinNo3 = aPLAddressYubinNo3;
    }

    public String getaPLAddressYubinNo4() {
        return aPLAddressYubinNo4;
    }

    public void setaPLAddressYubinNo4(String aPLAddressYubinNo4) {
        this.aPLAddressYubinNo4 = aPLAddressYubinNo4;
    }

    public String getaPLAddressTodofuken() {
        return aPLAddressTodofuken;
    }

    public void setaPLAddressTodofuken(String aPLAddressTodofuken) {
        this.aPLAddressTodofuken = aPLAddressTodofuken;
    }

    public String getaPLAddressShikuchoson() {
        return aPLAddressShikuchoson;
    }

    public void setaPLAddressShikuchoson(String aPLAddressShikuchoson) {
        this.aPLAddressShikuchoson = aPLAddressShikuchoson;
    }

    public String getaPLAddressBanchi() {
        return aPLAddressBanchi;
    }

    public void setaPLAddressBanchi(String aPLAddressBanchi) {
        this.aPLAddressBanchi = aPLAddressBanchi;
    }

    public String getaPLAddressTodofukenKana() {
        return aPLAddressTodofukenKana;
    }

    public void setaPLAddressTodofukenKana(String aPLAddressTodofukenKana) {
        this.aPLAddressTodofukenKana = aPLAddressTodofukenKana;
    }

    public String getaPLAddressShikuchosonKana() {
        return aPLAddressShikuchosonKana;
    }

    public void setaPLAddressShikuchosonKana(String aPLAddressShikuchosonKana) {
        this.aPLAddressShikuchosonKana = aPLAddressShikuchosonKana;
    }

    public String getaPLAddressBanchiKana() {
        return aPLAddressBanchiKana;
    }

    public void setaPLAddressBanchiKana(String aPLAddressBanchiKana) {
        this.aPLAddressBanchiKana = aPLAddressBanchiKana;
    }

    public String getaPLAddressManshon() {
        return aPLAddressManshon;
    }

    public void setaPLAddressManshon(String aPLAddressManshon) {
        this.aPLAddressManshon = aPLAddressManshon;
    }

    public String getaPLDaihyoshaYakushoku() {
        return aPLDaihyoshaYakushoku;
    }

    public void setaPLDaihyoshaYakushoku(String aPLDaihyoshaYakushoku) {
        this.aPLDaihyoshaYakushoku = aPLDaihyoshaYakushoku;
    }

    public String getaPLDaihyoshaName() {
        return aPLDaihyoshaName;
    }

    public void setaPLDaihyoshaName(String aPLDaihyoshaName) {
        this.aPLDaihyoshaName = aPLDaihyoshaName;
    }

    public String getaPLHojinNo() {
        return aPLHojinNo;
    }

    public void setaPLHojinNo(String aPLHojinNo) {
        this.aPLHojinNo = aPLHojinNo;
    }

    public String getaPLTantoshaName() {
        return aPLTantoshaName;
    }

    public void setaPLTantoshaName(String aPLTantoshaName) {
        this.aPLTantoshaName = aPLTantoshaName;
    }

    public String getaPLCSTEL() {
        return aPLCSTEL;
    }

    public void setaPLCSTEL(String aPLCSTEL) {
        this.aPLCSTEL = aPLCSTEL;
    }

    public String getaPLCSFAX() {
        return aPLCSFAX;
    }

    public void setaPLCSFAX(String aPLCSFAX) {
        this.aPLCSFAX = aPLCSFAX;
    }

    public String getaPLCSTantoshaMail() {
        return aPLCSTantoshaMail;
    }

    public void setaPLCSTantoshaMail(String aPLCSTantoshaMail) {
        this.aPLCSTantoshaMail = aPLCSTantoshaMail;
    }

    public String getaPLCSKakuninyoMail() {
        return aPLCSKakuninyoMail;
    }

    public void setaPLCSKakuninyoMail(String aPLCSKakuninyoMail) {
        this.aPLCSKakuninyoMail = aPLCSKakuninyoMail;
    }


}
