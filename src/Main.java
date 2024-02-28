import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        for (int i = 0; i < index; i++) {
            array.add(scan.next());
        }
        for (String arr : array) {
            System.out.print(arr + "\s");
        }
    }

}