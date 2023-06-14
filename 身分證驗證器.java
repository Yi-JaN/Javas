import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        char []charchar={'A','B','C','D','E','F','G','H','J','K',
        'L','M','N','P','Q','R','S','T','U','V','X','Y','W','Z','I','O'};  //陣列所以開頭第一個值一定為"0"
        byte []number={10,11,12,13,14,15,16,17,18,19,20,21,22,23
        ,24,25,26,27,28,29,30,31,32,33,34,35};                            //這行也是陣列所以開頭第一個值一定也是為"0"
        int chstr=new String(charchar).indexOf(str.substring(0,1)); //chstr"來源是new String(charchar)"所以用charchar去找你
        int x1=number[chstr]/10;                                    //indexOf相對應的str第一個字串參數值,找到一模一樣的值之後再
        int x2=number[chstr]%10;                                    //拉你的charchar找到的位置值拉去前面給chstr汰舊換新拿值,所
        int p=x1+(9*x2);                                            //以你的這行主軸是charchar,看來源就知道了!
        int k=8;
        for(int i=1;i<str.length();i++){
            p=p+k*(str.charAt(i)-'0');     //這裡是正向排列,所以就單i值得str單字串丟這裡轉成-'0'去*於k,在+前面目前的p值
            if(k>1){
                k--;
            }
        }
        if(p%10==0){
            System.out.println("CORRECT");
        }else {
            System.out.println("WRONG");
        }
    }
}
/*
題目: 身分證驗證器
問題描述可以看模3的說明欄
String str=scn.nextLine();這邊先輸入一個身分證的字串
char[]charchar={...}; 這邊是待會要取你所輸入的字串第一個值的英文字母
byte[]number={...}; 這邊用處是待會要把你所取的charchar與str第一個值做單字串英文字母做數字對比然後丟給int chstr的值!然後再number[chstr]
int chstr=new String(charchar).indexOf(str.substring(0,1)); "這邊是用chstr取你新的字串於charchar",然後用.indexOf方式取你的
來自str這個字串的substring<-(參數)(0,1)<-意思是代表主軸charchar因為是陣列,所以開頭一定為0,所以(0,1)就是代表取你str單字串的第一個單字串參數
值,然後charchar(主軸)再從自己陣列裡找str第一個單字串的參數一模一樣的值,找到之後去列他自己的位置值給int chstr(比方說str開頭是B,所以第一個單
字串參數值是"B",之後charchar從自己的陣列0開始找,找完之後是charchar是在"1"這位置找到你的str的B,"所以chstr就取1這個值")
int x1=number[chstr]/10 ,依照問題描述,把找到該值chstr的字串用number方式做對比,比方說chstr剛剛找到是B,那就number對應到11這個值,再用11/10
取給x1 ("剛丟進去是這樣->number[1]<-(chstr)/10") ,所以number對應1當然為"11"
int x2=number[chstr]%10 , 上述的道理是變成11%10取餘數給x2 ("剛丟進去是這樣number[1]<-(chstr)%10")所以number對應1當然為"11"
int p這行是依照題目敘述要求 把x1+(9*x2);
int k=8; 依照題目敘述要求 第一個值剛剛是x1+(9*x2)->給p,之後下一位就從8開始
for(int i=1;i<str.length();i++); 這行從1開始是因為剛剛0的部分經過上述描述已經取好,所以接著從1開始慢慢一個一個值丟下去+起來
然後每丟完一個值就從if這邊k>1的話就k--到k=1就不用再丟到if去減,之後讓迴圈跑完,p也算完
接著就往下把我算好的p做判斷就看看是不是了==0就是是 顯示"CORRECT" 不=0<-(!=0)就是不是 顯示"WRONG"

A:(1.)A123456789   (2.)C263567890        (3.)L163690274
     A:CORRECT       A:CORRECT             A:WRONG
 */
