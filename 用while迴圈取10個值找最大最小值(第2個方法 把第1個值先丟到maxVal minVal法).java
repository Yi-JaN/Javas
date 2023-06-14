import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int p=2;
        float v1=scn.nextFloat();
        float maxVal=v1;
        float minVal=v1;
        while (p<=10){
            v1=scn.nextFloat();
            if(v1>maxVal){
                maxVal=v1;
            }else if(v1<minVal){
                minVal=v1;
            }
            p++;
        }
        System.out.println("max= "+Math.floor(maxVal*10)/10);
        System.out.println("min= "+Math.floor(minVal*10)/10);
    }
}
/*
題目:用while迴圈取10個值得最大最小值(第2個方法)
說明請到自己題目裡->取10個值的最大最小值(第2個方法,用maxVal minVal法).java檔去看說明!
A: -30.2 0 89.5 100 61 -15.5 11.2 90 9 101
max= 101.0
min= -30.2
 */
