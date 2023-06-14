import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        lcm(n);
    }
    public static void lcm(int w){
        int x=0;
        int y=1;
        for(int i=1;i<=w;i++){
            for(int k=1;k<=w;k++){
                y=y+x;
                System.out.print(y+"  ");
                y++;
            }
            System.out.println();
            x++;
            y=1;
        }
        int x1=(w-1)-1; //這邊原本預定w-1但是括號後面又多下1個-1是因為for i這邊w-1 ,因為這個-1 所以使得我x1這邊括號後面多下1個-1
        int y1=1;
        for(int i=w-1;i>=1;i--){
            for(int k=1;k<=w;k++){
                y1=y1+x1;
                System.out.print(y1+"  ");
                y1++;
            }
            System.out.println();
            x1--;
            y1=1;
        }
    }
}
/*
題目:數字矩陣正反面(正方形)
A:
  3
  1 2 3
  2 4 6
  3 6 9
  2 4 6
  1 2 3
 */
