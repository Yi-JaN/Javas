import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float v1;
        float maxVal=Float.MIN_VALUE;
        float minVal=Float.MAX_VALUE;
        int p=1;
        while (p<=10){
            v1=scn.nextFloat();
            if(v1>maxVal){
                maxVal=v1;
            }else if(v1<minVal){
                minVal=v1;
            }
            p++;
        }
        System.out.println("max= "+Math.round(maxVal*10)/10);
        System.out.println("min= "+Math.round(minVal*10)/10);
    }
}
/*
題目:用while迴圈找最大最小值(取10個值)
A:(輸出為println一般列印大跟小)
1. -6 0 15.2 -15.2 100 89.6 10 8 -11 1 -16.2
max= 100.0
min= -15.2
A:(輸出為println然後用Math.round(大跟小都要))
2. -6 0 15.2 -15.2 100 89.6 10 8 -11 1 -16.2
max= 100
min= -15

 */
