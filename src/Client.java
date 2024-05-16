import java.util.Scanner;

public class Client {
    private String name;
    private String cpf;
    private String password;

    Layout layout = new Layout();
    Scanner sc = new Scanner(System.in);
    
    
    public void register() {
        layout.clean();
        layout.register();
        System.out.println("Type your name:\n");
        regName();
        layout.clean();
        tableInfo();
        System.out.println("Type yor CPF:\n");
        regCpf();
        layout.clean();
        tableInfo();
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
            tableInfo();
            System.out.println("The password must contain exactly 4 digits");
            password = sc.nextLine();
        }
        while (!password.matches("\\d{4}")) {
            layout.clean();
            tableInfo();
            System.out.println("The password must contain only numbers");
            password = sc.nextLine();
        }
        layout.clean();
        tableInfo();
        System.out.println("Type your password again:");
        String scPass = sc.nextLine();
        while(!password.equals(scPass)) {
            layout.clean();
            tableInfo();
            System.out.println("Incorrect, type again:");
            scPass = sc.nextLine();
        }
        return password;
    }
   
    public void login() {
        Code app = new Code();

        if (name == null) {
            System.out.println("| You don't have a register\n| Do you want to register? [1 - yes | 2 - no]");
            int verify = sc.nextInt();
            sc.nextLine();
            if (verify == 1) {
                register();
            } else if (verify == 2) {
                app.mainMenu();
            }
        } else {
            layout.clean();
            layout.login();
            System.out.println("Name: ");
            String loginName = sc.nextLine();
            while (!loginName.equals(name)) {
                layout.clean();
                layout.login();
                System.out.println("Name incorrect, type again: ");
                loginName = sc.nextLine();
            }
            layout.clean();
            loginInfo();
            System.out.println("Password: ");
            String loginPass = sc.nextLine();
            while (!loginPass.equals(password)) {
                layout.clean();
                loginInfo();
                System.out.println("Password incorrect, type again: ");
                loginPass = sc.nextLine();
            }
            layout.clean();
            info();
            layout.catalog();
        }
    }
    
    public void tableInfo() {
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("|                      |");
        if (name == null) {
            System.out.println("| Name:                  "); 
        } else {
            System.out.println("| Name: "+name+"                 ");
        }
        if (cpf == null) {
            System.out.println("| CPF:                   ");
        } else {
            System.out.println("| CPF: "+cpf+"                  ");
        }
        if (password == null) {
            System.out.println("| Password:             ");
        } else {
            System.out.println("| Password:****         ");
        }
        System.out.println("|                      |");
        System.out.println("|______________________|");
    }

    public void loginInfo() {
        String[] lines = {
            "________________________",
            "|    MoN Keys Store    |",
            "| Name:"+name+"                |",
            "| Password:            |",
            "|                      |",
            "|                      |",
            "|______________________|"
        };
        System.out.println("________________________");
        System.out.println("|    MoN Keys Store    |");
        System.out.println("|                      |");
        System.out.println("| Name:"+name+"                |");
        System.out.println("| Password:            |");
        System.out.println("|                      |");
        System.out.println("|                      |");
        System.out.println("|______________________|");
    }

    public void info() {
        if(name == null) {
            System.out.println("________________________");
        } else {
            System.out.println("________________________");
            System.out.println("|    MoN Keys Store    |");
            System.out.println("| Welcome              |");
            System.out.println("| "+name+"                ");
            System.out.println("| "+cpf+"                  ");
            System.out.println("|----------------------|");
        }
    }
}