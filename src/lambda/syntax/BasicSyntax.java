package lambda.syntax;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/5 10:54
 * @Description: TODO:lambda基础语法
 **/
public class BasicSyntax {
    interface Caculate {
        int caculate(int a, int b);
    }

    public static void main(String[] args) {
        Caculate cl = new BasicSyntax()::caculate;
        int sum = cl.caculate(10, 20);
        System.out.println(sum);
    }

    private int caculate(int a, int b) {
        if (a > b) {
            return a - b;
        } else if (a < b) {
            return a + b;
        } else {
            return a + b;
        }
    }
}
