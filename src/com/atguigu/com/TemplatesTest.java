package com.atguigu.com;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author litao
 * @create 2020-06-05 4:34
 * @date 2020/6/5 - 4:34
 */
public class TemplatesTest {

    //模板6 prsf 生成 private static final
    private static final Customer cust = new Customer();

    //变形 psf
    public static final String CODE1 = "1";
    public static final int NUM = 1;

    //变形 psfi psfs
    public static final int NUM2 = 2;
    public static final String NATION = "china";



    //模板1 psvm
    public static void main(String[] args) {
        //模板2 sout soutp soutm soutv xxx.sout
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);

        int num1 = 10, num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println(num2);

        //模板3 fori
        for (int i = 0; i < 10; i++) {
        }

        String[] arr = {"韩梅", "Lilei"};
        for (int i = 0; i < arr.length; i++) {

        }
        //变形 iter
        for (String str : arr) {
            System.out.println(str);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

        //模板4 list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //list.for
        for (Object o : list) {

        }

        //变形list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //模板5 ifn
//        if (list == null) {
//
//        }
        //变形 inn
//        if (list != null) {
//
//        }
        //变形 xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }



    }

}
