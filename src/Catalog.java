import java.util.Scanner;


public class Catalog {
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("type 1 to close");
        int test = sc.nextInt();
        if (test == 1) {
            System.exit(0);
        }
    }
}