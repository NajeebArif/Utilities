/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narif.poc.testjavadocker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Najeeb
 */
public class TestApp {
    
    private static final int BASE = 16;
    public static void main(String[] args) {
        System.out.println("HELLO WORLD.");
//        String keyWord = "Hello World!!";
//        String keyWord = "हमारा";
        String keyWord = "我很高興跟你見面 [我很高兴跟你见面";
//        有没有叉子
// 我想去机场
//我很高興跟你見面 [我很高兴跟你见面
        String code = hexCode(keyWord);
        System.out.println(code);
    }
    
    public static String hexCode(String keyword){
        return keyword.codePoints().boxed()
                .map(num->{
                    int count = 0;
                    System.out.println("ITERATION "+count+", num: "+num);
                    List<String> hexNumString = new ArrayList<>();
                    while(num/BASE>0){
                        int q = num%BASE;
                        num/=BASE;
                        System.out.println("q and num after iteration num: q="+q+", num="+num+", iteration="+count++);
                        hexNumString.add(getTheHexRepForNum(q));
                    }
                    Collections.reverse(hexNumString);
                    hexNumString.add(0,getTheHexRepForNum(num));
                    String hexCode = hexNumString.stream().collect(Collectors.joining());
                    hexCode = fixTheHex(hexCode);
                    System.out.println("hex code for num("+num+"): "+hexCode);
                    hexCode = "&#x"+hexCode+";";
                    System.out.println("final hex code "+hexCode);
                    return hexCode;
                }).collect(Collectors.joining());
    }
    
    private static String getTheHexRepForNum(int num){
        if(num<10)
            return String.valueOf(num);
        else
            return new StringBuilder().appendCodePoint(65+(num-10)%6).toString();
    }
    
    private static String fixTheHex(String rep){
        switch(rep.length()){
            case 1:
                rep = "000"+rep;
                break;
            case 2:
                rep = "00"+rep;
                break;
            case 3:
                rep = "0"+rep;
                break;
            default:
                break;
        }
        return rep;
    }
}
