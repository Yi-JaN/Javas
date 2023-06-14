import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        triange(n);
    }
    public static void triange(int h){
        int x=0;
        int y=1;
        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                y=y+x;
                System.out.print(y+" ");
                y++;
            }
            System.out.println();
            x++;
            y=1;
        }
    }
}
/*
此題 (函數)正三角形的數字矩陣!
triange(n) -> int h的原因是因為我把n轉成h然後把它也就是h解釋為正三角形的高!
for(int j=1;j<=h-i;j++){裡的System.out.print("  ")裡面空兩格的原因是因為空一格那他每一排的高度會歪
七扭八,所以說空兩格比較有正三角形的狀態,所以每一排一開始都先空兩個然後再放數字下去,以此類推!
A:
4
      1
    2 4 6
  3 6 9 12 15
4 8 12 16 20 24 28

 */
