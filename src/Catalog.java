import java.util.Scanner;


public class Catalog {
    Scanner sc = new Scanner(System.in);
    Layout layout = new Layout();
    
    public void start() {
        Code app = new Code();
        layout.catalogOptions();
        int menu = sc.nextInt();
        if (menu == 1) {
            System.exit(0);
        } else if (menu == 2) {
            System.exit(0);
        } else if (menu == 3) {
            app.mainMenu();
        }
    }
}