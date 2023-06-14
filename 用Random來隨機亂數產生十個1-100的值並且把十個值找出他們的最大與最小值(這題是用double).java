import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //   Scanner scn=new Scanner(System.in);
        Random scn1=new Random();
        double v1;                        //這邊我這次用double來當浮點數,小數點!
        double maxVal=Double.MIN_VALUE;              //然後設一個double的最大值
        double minVal=Double.MAX_VALUE;              //跟設一個double的最小值  ,待會要取最大最小值!
        for(int i=0;i<10;i++){
            v1=Math.random()*100+1;        //小數版的隨機亂數,跟int方式不太一樣!我是要取一個v1 1-100,所以0+1=1,所以1為開頭取100個值!
            System.out.print(Math.floor(v1*100)/100+" "); //取完往下先丟到Math.floor這邊,為了方便列印出來你亂數出來的值,我統一
            if(v1>maxVal){                                //都用小數點第2位後面的值直接去掉,只留到小數點第2位不四捨五入!這樣也比較方
                maxVal=v1;                                //便看!(然後因為是列在print並不會影響到你v1亂數產生的本值)
            }else if(v1<minVal){
                minVal=v1;
            }
        }
        System.out.println();
        System.out.println("max= "+Math.floor(maxVal*100)/100);
        System.out.println("min= "+Math.floor(minVal*100)/100);
    }
}
/*
題目:用Random產生隨機亂數10個值然後找到這些值的最大與最小值(此題我用double)

A:(這邊我列兩組出來)
(1.) 17.4 84.01 80.33 72.72 3.67 9.34 2.16 7.4 46.96 31.4 (2.) 75.17 58.9 35.48 97.15 62.24 99.99 67.59 63.07 7.9 70.89
 max= 84.01                                                    max= 99.99
 min= 2.16                                                     min= 7.9
 */
