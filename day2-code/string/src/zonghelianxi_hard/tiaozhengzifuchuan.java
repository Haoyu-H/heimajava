package zonghelianxi_hard;

public class tiaozhengzifuchuan {
    public static String roll(StringBuilder sb){
        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        A.append("abcde"); B.append("bcdea");
        if(roll(A).equals(B.toString())){
            System.out.println("True");

        }
        else
            System.out.println("False");

    }
}
