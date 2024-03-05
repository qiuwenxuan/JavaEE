public class Program {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface Inter1 {
    void lambdaTest();

    String toString();
}

interface Inter2 {

}

interface Inter3 {
    void lambdaTest();

    default void test() {
    }

    static void staticTest() {
    }
}

interface Inter4 extends Inter1 {

}