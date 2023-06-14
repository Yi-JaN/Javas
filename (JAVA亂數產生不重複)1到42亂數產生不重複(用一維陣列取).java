import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //   Scanner scn=new Scanner(System.in);
        Random random=new Random(); //要用亂數產生,所以使用Random
        int[]data=new int[6]; //用一維陣列產生6個值
        for(int i=0;i<6;i++){ //陣列開頭第一個位置值為0,所以從0開始循環取6個值,每循環1次->i+1
            data[i]=random.nextInt(42)+1; //+1是一開始為0,所以+1就從1開始到42,所以依照目前data位置值[i]上亂數產生1到42
            for(int j=0;j<i;j++){ //for j角色是針對目前此i值前面的值做審查有沒有重複亂數值的工作
                if (data[j]==data[i]){ //如果目前的j值跟我目前的i值是一樣的話就進去,沒有就略過換下一個j值
                     data[i]=random.nextInt(42)+1; //進去後就針對目前此i值做重新亂數產生1~42的工作
                    if (data[j]==data[i]){ //產生完,在檢查一次看有沒有重複
                        data[i]=random.nextInt(42)+1; //如果又重複,就再次針對目前此i值做重新亂數產生1~42的工作
                    }
                }             //就這樣以此類推上述循環!
            }
        }
        for(int a=0;a<data.length;a++){ //for i ok之後,來到這邊先算我的data一維陣列長度,長度算完之後就是慢慢取data一維陣列上的值
            System.out.printf("%d\t",data[a]); //每循環一次取data目前位置值[a]的值,然後再\t
        }
        System.out.println(); //都列印完之後就換行
    }
}
/*
題目:(JAVA亂數產生不重複)1到42亂數產生不重複(用一維陣列取)
 */
