package com.atguigu.com;

import java.util.HashMap;

/**
 * @author litao
 * @create 2020-06-06 0:10
 * @date 2020/6/6 - 0:10
 */
public class DebugTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);

        }
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("name", "张三");
        hashMap.put("age", 18);
        hashMap.put("school", "清华");
        hashMap.put("major", "计算机");

        Object age = hashMap.get("age");
        hashMap.remove("name");
        System.out.println(hashMap);

    }
}
