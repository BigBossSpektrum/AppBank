import java.util.Scanner;

public class AppBank {

    public static void main(String[] args) {
        String nombre = "Jonathan Hernandez";
        String tipoDeCuenta = "Corriente";
        double saldo = 2599.99;
        int opcion = 0;

        System.out.println("*****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo);
        System.out.println("\n*****************************************");

        String menu = """
                \n*** Escriba el numero de la opcion deseada ***
                1 - Consutar saldo
                2 - Retriar
                3 - Depositar
                9 - Salir
                """;

        Scanner keyboard = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = keyboard.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Su saldo es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea Retirar?");
                    double valorRetirar = keyboard.nextDouble();
                    if (valorRetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= valorRetirar;
                        System.out.println("Su saldo actual es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea Depositar?");
                    double valorADepositar = keyboard.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 9:
                    System.out.println("Finalizando Sesion, Gracias por utilizar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opcion no valida, Intente de nuevo.");
            }
        }
    }
}
