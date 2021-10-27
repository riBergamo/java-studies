package com.company;

public class Aula8_3 {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resOne, resTwo, resThree;
        resOne = (x < y ^ y < z)?true:false;
        System.out.println(resOne);
        resTwo = (x < y || y < z)?true:false;
        System.out.println(resTwo);
        resThree = (x < y && y < z)?true:false;
        System.out.println(resThree);
        //^  - apenas um pode ser true para = true
        //|| - um ou outro
        //&& - os dois tem que ser true para = true
    }
}
