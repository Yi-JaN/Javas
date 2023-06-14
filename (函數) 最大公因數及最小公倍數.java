import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in); //在此地方建立三個正整數
        int x=scn.nextInt();           //建立一個int x 做三數的最大公因及最小公倍
        int y=scn.nextInt();           //建立一個int y 做三數的最大公因及最小公倍
        int z=scn.nextInt();           //建立一個int z 做三數的最大公因及最小公倍
        lcm(x,y,z);                    //之後取 x,y,z 丟給名叫lcm的函數名稱丟進去
    }
    public static void lcm(int x,int y,int z){  //之後建立public static void lcm (int x,int y,int ,z) <-意思是用public建立名
        int min=Math.min(Math.min(x,y),z);      //叫lcm的函數 那建立完之後()裡的東西就是你上方lcm(x,y,z)的int值，依序填下來就變
        int gcd1=1;                             //(int x,int y,int z){ //之後下方就可以開始打了!
        int gcd=0;
        for(int j=min;j>=1;j--){
            if(x%j==0 && y%j==0 && z%j==0){
                gcd1=j;
                break;
            }
        }
        for(int i=1;i<=x*y*z;i++){
            if(i%x==0 && i%y==0 && i%z==0){
                gcd=i;
                break;
            }
        }
        System.out.println("最大公因數="+gcd1);
        System.out.println("最小公倍數="+gcd);
    }
}
