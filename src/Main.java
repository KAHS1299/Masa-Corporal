import java.util.Scanner;

public class Main {
        public static class IMCCalculadora {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Solicitar nombre, peso y estatura al usuario

                System.out.println("Ingrese su nombre:");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese su peso en kilogramos:");
                double peso = scanner.nextDouble();

                System.out.println("Ingrese su estatura en metros:");
                double estatura = scanner.nextDouble();

                Persona persona = new Persona(nombre, peso, estatura);

                persona.mostrarResultados();

                System.out.println(persona.toString());
            }
        }
}