import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String surname = "";
        int age = 0;
		String uni = "";
        
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