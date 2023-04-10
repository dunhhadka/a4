package com.example.demo.test.B2;

public class Runner {
    public static void main(String[] args) {
        char[] na= {'u', 'o', 'a', 'e', 'i'};
        String input="java developer";
        for(int i=input.length()-1;i>=0;i--){
            char c=input.charAt(i);
            boolean check=true;
            for(int j=0;j<=4;j++){
                if(c==na[j]){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.print(c);
            }
            else{
                System.out.print((char) ((int)c-32));
            }
        }
    }
}
