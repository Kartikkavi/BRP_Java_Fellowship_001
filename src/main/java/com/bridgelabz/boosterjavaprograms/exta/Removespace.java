package com.bridgelabz.boosterjavaprograms.exta;

import java.util.Scanner;

public class Removespace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println(name);


        char[] strArray= name.toCharArray();
        StringBuffer stringBuffer =new StringBuffer();
        for (int i =0;i<strArray.length;i++){
            if((strArray[i] !=' ') && (strArray[i]!='\t')){
                stringBuffer.append(strArray[i]);
            }
        }
        String removeSpace= stringBuffer.toString();
        System.out.println(removeSpace);
    }
}
