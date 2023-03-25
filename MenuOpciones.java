import java.util.Scanner;

public class MenuOpciones{
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" ");
            System.out.println("*+MENU PRINCIPAL+*");
            System.out.println("Elija una opción:");
            System.out.println(" ");
            System.out.println("1. Helado de chocolate");
            System.out.println("2. Helado de vainilla");
            System.out.println("3. Helado de fresa");
            System.out.println("4. Helado napolitano");
            System.out.println("5. Seria todo, porfavor. ");
            System.out.println(" ");
            System.out.println("Voy a querer la opción . . . ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Has elegido helado de chocolate.");
                    System.out.println("¿Desea algo más?");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Has elegido helado de vainilla");
                    System.out.println("¿Desea algo más?");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("Has elegido helado de fresa");
                    System.out.println("¿Desea algo más?");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Has elegido helado napolitano");
                    System.out.println("¿Desea algo más?");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("¡Buen provecho! Que tenga un buen dia.");
                default:
                    System.out.println(" ");
                    System.out.println("Opción invalida");
                    break;
            }
        } while (opcion != 5);

        input.close();
    }
}
