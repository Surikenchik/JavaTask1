package com.softserveinc.edu;

public class App {
    public static void main(String[] args) {
        String res = fibonacci(10);
        System.out.println(res);
    }

    static String fibonacci(int countOfIterations){
        String result = "";
        int previous = 1, current = 1;
        int next;
        result += previous+" "+current+" ";
        for(int i = 0; i < countOfIterations; i++){
            next = previous + current;
            result += next+" ";
            previous = current;
            current = next;
        }
        return result;
    }
}
