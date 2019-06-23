package com.company;

public class Main {

    public static void main(String[] args) {
        hasSameLastDigit(122, 12, 320);
        hasSameLastDigit(132, 555, 443);
        hasSameLastDigit(4,100,50);
        hasSameLastDigit(903, 35, 253);
    }
    public static boolean hasSameLastDigit(int valueOne, int valueTwo, int valueThree) {
        String[] paramsArr = {valueOne+"", valueTwo+"", valueThree+""};
        String[] lastDigitArr = {"0" , "0", "0"};
        for(int i=0; i<paramsArr.length; i++){
            if( Integer.parseInt(paramsArr[i]) < 10 || Integer.parseInt(paramsArr[i]) > 1000){
                System.out.println("F - not in range");
                return false;
            }
            String[] splitValue = paramsArr[i].split("");
            String lastDigit = splitValue[splitValue.length - 1];
            lastDigitArr[i] = lastDigit;

        }

        for(int i=0; i<lastDigitArr.length; i++){
            String iDigit = lastDigitArr[i];
            for(int j=0; j<lastDigitArr.length; j++){
                String jDigit = lastDigitArr[j];
                if(iDigit.equals(jDigit) && j != i){
                    System.out.println("T - at least 2 parameters have the same last digit: " + jDigit + " and " + iDigit);
                    return true;
                }
            }
        }
        System.out.println("F");
        return false;

    }
}
