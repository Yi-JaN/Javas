import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();          //先設一個n值取看要取幾個值找最大與最小值
        int []arr=new int[n];         //把我設的n值丟給int[]arr,讓他可以產出n值,比方說我n設6,new int[6]這邊arr就有6次取值!
        news(arr,n);                  //設一個函數名稱為"news",news(arr,n)<-把可以產出幾個arr的值放進去,跟你輸入的n值放進去!
    }
    public static void news (int[]arrs,int x){  //這邊用一般函數void 把news丟進去! (arrs<->arr , x<->n)
        Scanner scn1=new Scanner(System.in);     //因為是要在這邊函數做的,所以這邊要設一個Scanner ,讓待會arrs取正整數時可以使用!
        for(int i=0;i<x;i++){                  //把我的x丟進for迴圈,迴圈跑幾次,裡面的arrs[i]=scn1.nextInt就跟著取幾次正整數
            arrs[i]=scn1.nextInt();
        }                                     //取完底標往下,這邊的for迴圈就完畢!
        int max=0;                            //之後找最大值,先設一個max ,max預設先用0代替
        int min=0;                            //之後也要找最小值,先設一個min ,min預設也先用0代替
        for(int j=0;j<arrs.length-(x-1);j++){       //之後我統一第一個值都放max跟min,(因為怕第一個值假設如果是最小,他放最大,就會錯誤)
            max=arrs[j];                         //因為待會我最大值先找,後續才是換丟最小值! 然後這for迴圈意思是只取"1"個值,所以把你取
            min=arrs[j];                        //到的arrs變arrs.length 然後length後面在-(x-1),這樣比如我arrs取6個值,length==6
        }                                      //arrs.length(6)-(x-1)<- 6-(6-1)=1 ,這樣這邊for迴圈就可以只Run一次,只取一個值
        for(int k=1;k<arrs.length;k++){        //這邊就是取剩下的arrs的值取最大或最小值
            if(arrs[k]>max){                   //然後我比如arrs取6個值,那arrs.length==6 ,然後k==1 ,從1開始取,那陣列開頭第一個值都
                max=arrs[k];                   //一定為0 ,所以1就是從第2個值開始取 , 取到迴圈跑完,之後每取一個值就丟到if判斷,以此類推
            }else if(arrs[k]<min){             //判斷到這迴圈跑完,最後的max跟min 就是我要的最大值與最小值
                min=arrs[k];
            }
        }
        System.out.println("max= "+max);     //經過上述由上至下循環最終的最大值列印出來
        System.out.println("min= "+min);     //經過上述由上至下循環最終的最小值列印出來
    }
}
/*
補充: 我也可以先在上方的void main 下for迴圈給arr拿n個數字正整數 讓他依照for迴圈取arr[]=scn.nextInt();,之後把arr取到的n個正整數值丟到
//void函數裡直接做!
題目: 設n值並且用int[]arr取該n值裡最大值與最小值
A:(1.) 6                     A:(2.) 8
-6 3 0 2 47 12                 71 0 2 -9 -15 100 80 1 9
max= 47                        max= 100
min= -6                        min= -15
 */
