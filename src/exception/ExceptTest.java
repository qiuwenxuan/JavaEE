package exception;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/5 20:25
 * @Description: TODO:异常处理机制
 **/
public class ExceptTest {
    public static void main(String[] args) {
        try {
            exceptTest2();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

    public static void exceptTest1() throws CustomException {
        throw new CustomException("我喝酒了");
    }

    public static void exceptTest2() throws RuntimeException {
        try {
            exceptTest1();
        } catch (CustomException e) {
            RuntimeException exception = new RuntimeException(e);
            throw exception;
        }
    }

}

class CustomException extends Exception {
    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
