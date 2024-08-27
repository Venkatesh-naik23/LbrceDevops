package H2;
import java.util.Scanner;
public class Signup 
{
    private String username;
    private String password;
    private String email;
    public Signup(String username, String password, String email) 
    {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void displayUserInfo() 
    {
        System.out.println("User Signed Up Successfully!");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Signup signup = new Signup(username, password, email);
        signup.displayUserInfo();

        scanner.close();
    }
}