import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //輸入說明: 輸入一個3*3矩陣 2維陣列,矩陣內容,0代表圈 1代表X(叉)
        Scanner scn=new Scanner(System.in);  //注意: 每列數字之間均有空格隔開
       int[][]arr=new int[3][3]; //<-設一個int[][]arr 高給3個 值給3個 3*3矩陣(高3值3) <-有3個高跟3個值
       for (int i=0;i<3;i++){    //這for i當高,3*3矩陣(高3值3)
           for(int j=0;j<3;j++){ //這for j當值,3*3矩陣(高3值3)
               arr[i][j]=scn.nextInt(); //目前位於的arr[i][j]就取自己所輸入的正整數1個
           }                                      //  高 值
       }   //下方開始看這arr二維陣列是符合哪個if迴圈,然後就代表那if迴圈顯示True還是False True是有連線到OOXX False是沒有連線到OOXX
       if(arr[0][0]==arr[0][1] && arr[0][1]==arr[0][2] && arr[0][2]==arr[0][0]){ //高0值0到高0值2都一模一樣的值
           System.out.println("True");  //顯示為True
       }else if(arr[1][0]==arr[1][1] && arr[1][1]==arr[1][2] && arr[1][2]==arr[1][0]){ //高1值0到高1值2都一模一樣的值
           System.out.println("True"); //顯示為True
       }else if(arr[2][0]==arr[2][1] && arr[2][1]==arr[2][2] && arr[2][2]==arr[2][0]){  //高2值0到高2值2都一模一樣的值
           System.out.println("True"); //顯示為True
       }else if(arr[0][0]==arr[1][0] && arr[1][0]==arr[2][0] && arr[2][0]==arr[0][0]){  //高0值0到高2值0都一模一樣的值
           System.out.println("True");  //顯示為True
       }else if(arr[0][1]==arr[1][1] && arr[1][1]==arr[2][1] && arr[2][1]==arr[0][1]){  //高0值1到高2值1都一模一樣的值
           System.out.println("True");  //顯示為True
       }else if(arr[0][2]==arr[1][2] && arr[1][2]==arr[2][2] && arr[2][2]==arr[0][2]){  //高0值2到高2值2都一模一樣的值
           System.out.println("True"); //顯示為True
       }else if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2] && arr[2][2]==arr[0][0]){ //高0值0到高2值2斜線一模一樣的值
           System.out.println("True"); //顯示為True
       }else if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0] && arr[2][0]==arr[0][2]){ //高0值2到高2值0斜線一模一樣的值
           System.out.println("True"); //顯示為True
       }else {  //如果上述if迴圈的8種連線方式沒中任何一種,那就是來到這else 無條件進入,顯示False
           System.out.println("False");
       }
    }
}
/*
題目:圈圈叉叉 0是圈 1代表X(叉)
(1.)
1 0 1
0 0 1
1 0 0

A: True

(2.)
1 0 0
0 1 1
0 1 0

A: False
 */
