package packaging;

import lambda.functionalInterfaces.SingleReturnMutipleParameter;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/5 22:51
 * @Description: TODO:
 **/
public class Package {
    public static void main(String[] args) {
        String s = "100";
        int a = Integer.parseInt(s);
        int aa = Integer.valueOf(s);

        Integer aaa = Integer.parseInt(s);
        Integer aaaa = Integer.valueOf(s);

        int b = 10;
        String s2 = String.valueOf(b);
        String ss2 = Integer.toString(b);
        String sss2 = b + "";
    }

}
