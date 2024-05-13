import java.util.Scanner;

public class Code {
    Layout layout = new Layout();
    String name;
    String cpf;
    int password;
    Client client = new Client(name, cpf, password);
    Scanner sc = new Scanner(System.in);

    public void start() {
        layout.clean();
        layout.mainMenu();
        boolean loop = true;
        int option = 0;
        option = sc.nextInt();
        while (loop == true) {
            if(option == 1) {
                layout.clean();
                layout.register();
                client.register();
            } else if(option == 2) {
                layout.clean();
                // client.login();
            } else if(option == 3) {
                layout.clean();
                // catalog.print();
            } else if(option == 4) {
                layout.clean();
                layout.exit();
                System.exit(0);
            } else {
                layout.clean();
                layout.mainMenu();
            }
        }
    }
}