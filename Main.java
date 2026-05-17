import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String surname = "";
        int age = 0;
		String uni = "";
        String username = "";
        int pin = 7923;
        int entry;

        System.out.print("Username: ");
        username = scanner.nextLine();

        while(true) {

            System.out.println("PIN: ");
            entry = scanner.nextInt();
            scanner.nextLine();

            if(entry == pin) {
                System.out.println("Access Granted.");
                break;
            } else {
                System.out.println("Access denied");
            }

        }
        
        System.out.println("Hello World");

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter surname: ");
        surname = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
		
		System.out.println("University: ");
		uni = scanner.nextLine();

        System.out.println("Hello " + name + " " + surname);
        System.out.println("Age " + age);

        scanner.close();
    }
}