import java.util.Scanner;


public class Catalog {
    Scanner sc = new Scanner(System.in);
    Layout layout = new Layout();
    
    public void start() {
        Code app = new Code();
        layout.catalogOptions();
        int menu = sc.nextInt();
        if (menu == 1) {
            layout.prices();
        } else if (menu == 2) {
            System.exit(0);
        } else if (menu == 3) {
            app.mainMenu();
        }
    }

    public void show() {
        Code app = new Code();
        layout.catalogBack();
        int menu = sc.nextInt();
        while(menu != 1) {
            layout.clean();
            layout.catalog();
            layout.catalogBack();
            menu = sc.nextInt();
        }
        app.mainMenu();
    }
}