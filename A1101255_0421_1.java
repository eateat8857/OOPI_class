import java.util.*;
public class A1101255_0421_1 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("請輸入電子郵件：");
        str=sc.next();

        if(str.matches("[a-z]+[@]{1}[a-z]+.[a-z]+")){
            System.out.println(str);
        }else{
            System.out.println("電子郵件格式不正確");
        }
    }
}
