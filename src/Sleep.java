public interface Sleep {
    int COUNT_VALUE = 10;

    void sleep();

    static void staticSleep() {
        System.out.println("static sleep...");
    }
}


