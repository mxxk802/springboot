package com.mxxk.designPattern.template.demo1;

/**
 * TemplateTest
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class TemplateTest {

    public static void main(String[] args) {

        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
