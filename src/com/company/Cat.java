package com.company;
public class Cat{
    public Cat(double weight1, String name1, int age1, String color1) {
        /* как видно, мы создали новые переменные и указали их тип прямо в скобках, описывающих, какие именно переменные будут передаваться этой функции, когда мы будем её использовать. Обратите внимание, что именно значения этих переменных (например, name1) потом передаются полям класса (например, name)*/
        double weight = weight1;
        String name = name1;
        int age = age1;
        String color = color1;
    }

}
