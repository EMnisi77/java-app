import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String surname = "";
        
        System.out.println("Hello World");

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter surname: ");
        surname = scanner.nextLine();

        System.out.println("Hello " + name + " " + surname);

        scanner.close();
    }
}