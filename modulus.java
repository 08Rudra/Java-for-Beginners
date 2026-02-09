import java.util.Scanner;

public class modulus {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        System.out.println("Result (x % y): " + (x % y));

        sc.close();
    }
}

    

