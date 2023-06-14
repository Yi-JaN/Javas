import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Double n=scn.nextDouble(); //輸入一個double值
        int m=scn.nextInt(); //輸入一個m值,待會要判斷小數點第m位,然後還要帶進for迴圈循環
        int sum=1; //sum意思是待會要拿來循環for迴圈,要拿來乘,然後拿sum的值去floor or round判斷
        for(int i=1;i<=m;i++){ //m帶進for迴圈,每循環1次sum乘10 1次
            sum=sum*10;
        }
        if (sum>=10){ //如果我的sum>=10就進去,為什麼要10呢? 因為10就是小數點第1位後面去掉不4捨五入,100就是第2位,以此類推
            System.out.println(Math.floor(n*sum)/sum);
        }else { //只要sum低於10就丟入else裡,並且顯示round,只留整數,小數點後面全部去掉,不4捨5入
            System.out.println(Math.round(n*10)/10); //所以這邊直接下*10/10就好,讓他只留整數
        }
    }
}
/*
題目:不四捨五入小數點第n位後面的值去掉
補充:Math.floor->floor是10的話保留到小數點第1位,100的話保留到小數點第2位,1000的話保留到小數點第3位,以此類推,然後不4捨五入
補充:Math.round->round是不管你上方10那個位置輸入什麼,10也好,100也好,反正都會包含小數點全部的值去掉,比方說10位置輸入1000,那就是小數點第3位包含
                第一 二 三位,全部小數點去掉,不4捨五入

輸入如下:
 (1.)3.14159 0    (2.)0.78 1    (3.)3.14159 4    (4.)2.657 2
   A:3              A:0.7         A:3.1415         A:2.65
 */
