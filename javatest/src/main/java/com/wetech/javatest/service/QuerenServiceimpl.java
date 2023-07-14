package com.wetech.javatest.service;

import com.wetech.javatest.entity.Queren;
import com.wetech.javatest.mapper.QuerenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuerenServiceimpl implements QuerenService {
 private final QuerenMapper querenMapper;

 @Autowired
 public QuerenServiceimpl(QuerenMapper querenMapper) {
  this.querenMapper = querenMapper;
 }
 @Override
  public void saveQueren(Queren queren){
   querenMapper.insert(queren);
 }
}
