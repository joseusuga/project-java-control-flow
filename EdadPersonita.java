import java.util.Scanner;

public class EdadPersonita {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt();

            if (edad < 18) {
                System.out.println("Eres menor de edad.");
            } else {
                System.out.println("Eres mayor de edad.");
            }
        }
    }
}

