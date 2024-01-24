package com.sbs.exam.sb_app_2022_10_13.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //주석 특징이 new 객체 생성을 안하고 객체를 만들 수 있음
public class UsrHomeController { //일반 사용자가 이용하는 컨트롤러
 private int count;

 public  UsrHomeController(){
  count = -1;
 }

 @RequestMapping("/usr/home/getCount")
 @ResponseBody
 public int getCount(){
  return count;
 }

 @RequestMapping("/usr/home/doSetCount")
 @ResponseBody
 public String doSetCount(int count){
  this.count = count;
  return "count의 값이" + this.count + "으로 초기화 되었습니다.";
 }
}