class Main {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.1, 20.1));
    }

    public static int sum(int i, int j) {
        int sum;
        sum = i + j;
        return sum;
    }

    public static double sum(double i, double j) {
        double sum = 0;
        sum = (double) (i + j);
        return sum;
    }
}