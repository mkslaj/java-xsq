package com.wetech.javatest.mapper;

import com.wetech.javatest.entity.biebiao;
import lombok.Value;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface biebiaoMapper  {
   @Insert("INSERT INTO biebiao("+
           "id,name,plJisshiKomokuc,plHyoukaKijunc, "+
           "plJisshiJikiNendoc,plJisshiJikiNconsumer,cd,plkisesoji,"+
           "plDonyuNendo__c,plDonyuJiki__c,plKaigaiKounyu__c ,"+
           "plPrice__c,plAmount__c,plTotalAmount__c) "+
           "VALUES ("+
           "#{id},#{name},#{plJisshiKomokuc),#{plHyoukaKijunc}"+
           "#{plJisshiJikiNendoc}, #{plJisshiJikiNconsumer},#{cd},#{plkisesoji}" +
           " #{plDonyuNendo__c}, #{plDonyuJiki__c}, #{plKaigaiKounyu__c}"+
           " #{plPrice}, #{plAmount}, #{plTotalAmount})")
    void insert(biebiao biebiao);
}
