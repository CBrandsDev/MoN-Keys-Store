import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private String name;
    private String cpf;
    private int password;
    
    public Client(String n, String c, int p) {
        name = n;
        cpf = c;
        password = p;
    }

    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public int getPassword() {
        return password;
    }

    Layout layout = new Layout();
    Scanner sc = new Scanner(System.in);
    List<Client> clients = new ArrayList<>();
    
    
    public void register() {
        layout.clean();
        String name = readName(sc);
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("|                      |");
        System.out.println("| Name: "+name+"                ");
        System.out.println("| CPF:                  ");
        System.out.println("| Password:             ");
        System.out.println("| (4 Digits)           |");
        System.out.println("|______________________|");
        String cpf = readCpf(sc);
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("|                      |");
        System.out.println("| Name: "+name+"                ");
        System.out.println("| CPF: "+cpf+"                  ");
        System.out.println("| Password:             ");
        System.out.println("| (4 Digits)           |");
        System.out.println("|______________________|");
        int password = readPassword(sc);
        
        clients.add(new Client(name, cpf, password));
        
    }
    
    public static String readName(Scanner sc) {
        Layout layout = new Layout();
        layout.register();
        String name;
        System.out.println("Type your name\n");
        name = sc.nextLine();
        layout.clean();
        return name;
    }

    public static String readCpf(Scanner sc) {
        Layout layout = new Layout();
        String cpf;
        System.out.println("Type your cpf\n");
        System.out.println("testse");
        cpf = sc.nextLine();
        layout.clean();
        return cpf;
    }

    public static int readPassword(Scanner sc) {
        Layout layout = new Layout();
        int password;
        System.out.println("Type your 4 digitis password\n");
        System.out.println("testse");
        password = sc.nextInt();
        layout.clean();
        return password;
    }
}