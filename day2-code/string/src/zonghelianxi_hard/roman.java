package zonghelianxi_hard;

import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("请输入一个只包含数字的字符串，长度小于等于9：");
            s = sc.nextLine();
            int flag = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                    flag = 0;
                }
                else{
                    flag = 1;
                }
            }
            if(flag==0&&s.length()<=9){
                break;
            }
//            System.out.println(flag);
//            else
//                break;
        }





        StringBuilder r = new StringBuilder();
        StringBuilder res = new StringBuilder();
        r.append(" ").append("Ⅰ").append("Ⅱ").append("Ⅲ").append("Ⅳ").append("Ⅴ").append("Ⅵ").append("Ⅶ")
                .append("Ⅷ").append("Ⅸ");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                res.append("");
            }
            else{
                int c = s.charAt(i)-'0';
                res.append(r.charAt(c));
            }
        }
        System.out.println(res.toString());


    }


}
