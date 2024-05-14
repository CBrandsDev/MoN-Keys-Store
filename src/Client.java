import java.util.Scanner;

public class Client {
    private String name;
    private String cpf;
    private String password;

    Layout layout = new Layout();
    Code app = new Code();
    Scanner sc = new Scanner(System.in);

    public void register() {
        layout.clean();
        layout.register();
        System.out.println("Type your name:\n");
        regName();
        layout.clean();
        tableName();
        System.out.println("Type yor CPF:\n");
        regCpf();
        layout.clean();
        tableCpf();
        System.out.println("Type yor 4 digits password:\n");
        regPass();
    }

    public String regName() {
        name = sc.nextLine();
        return name;
    }
    public String regCpf() {
        cpf = sc.nextLine();
        return cpf;
    }
    public String regPass() {
        password = sc.nextLine();
        while (password.length() != 4) {
            layout.clean();
            tableCpf();
            System.out.println("The password must contain exactly 4 digits");
            password = sc.nextLine();
        }
        while (!password.matches("\\d{4}")) {
            layout.clean();
            tableCpf();
            System.out.println("The password must contain only numbers");
            password = sc.nextLine();
        }
        layout.clean();
        tablePass();
        System.out.println("Type your password again:");
        String scPass = sc.nextLine();
        while(!password.equals(scPass)) {
            layout.clean();
            tablePass();
            System.out.println("Incorrect, type again:");
            scPass = sc.nextLine();
        }
        return password;
    }
    public void tableName() {
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("|                      |");
        System.out.println("| Name: "+name+"                 ");
        System.out.println("| CPF:                  ");
        System.out.println("| Password:             ");
        System.out.println("|                      |");
        System.out.println("|______________________|");
    }
    public void tableCpf() {
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("|                      |");
        System.out.println("| Name: "+name+"                 ");
        System.out.println("| CPF: "+cpf+"                  ");
        System.out.println("| Password:             ");
        System.out.println("|                      |");
        System.out.println("|______________________|");
    }
    public void tablePass() {
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("|                      |");
        System.out.println("| Name: "+name+"                 ");
        System.out.println("| CPF: "+cpf+"                  ");
        System.out.println("| Password:****         ");
        System.out.println("|                      |");
        System.out.println("|______________________|");
    }

    public void login() {
        if (name == null) {
            System.out.println("You don't have a register\n Do you want to register? [1 - yes | 2 - no]");
            int verify = sc.nextInt();
            if (verify == 1) {
                register();
            } else if (verify == 2) {
                app.mainMenu();
            }
        }
    }

    public void info() {
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("| Welcome              |");
        System.out.println("| "+name+"                ");
        System.out.println("| "+cpf+"                  ");
        System.out.println("|______________________|");
    }
    

}