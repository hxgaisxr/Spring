package com.hxg.java;

import java.util.HashMap;

/**
 * @author huxiaoguang
 * @date 2021/5/12 - 21:53
 */
public class DebugTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }


        HashMap<String, String> map = new HashMap<>();
        map.put("name", "hxg");
        map.put("age", "24");
        map.put("school", "huanon");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("school");
        System.out.println(map);

    }

}
