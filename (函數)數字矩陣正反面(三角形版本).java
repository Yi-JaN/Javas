import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        trangle(n);
    }
    public static void trangle(int n){
        int x=0;
        int y=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                y=y+x;
                System.out.print(y+" ");
                y++;
            }
            System.out.println();
            x++;
            y=1;
        }
        int x1=(n-1)-1; //這邊原本預定n-1 但是括號後面又減1是因為for i這邊n-1 因為這個-1,使得我x1這邊在多下1個-1
        int y1=1;
        for(int i=n-1;i>=1;i--){
            for (int k=1;k<=i;k++){
                y1=y1+x1;
                System.out.print(y1+" ");
                y1++;
            }
            System.out.println();
            x1--;
            y1=1;
        }
    }
}
/*
題目:(函數) 數字矩陣正反面(三角形版本)
A:
  5
   1
   2 4
   3 6 9
   4 8 12 16
   5 10 15 20 25
   4 8 12 16
   3 6 9
   2 4
   1
 */
