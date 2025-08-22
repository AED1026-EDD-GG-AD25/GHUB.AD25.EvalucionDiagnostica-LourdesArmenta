package miPrincipal;
import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opc;
        do{
            menu();
            opc = entrada.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Hasta Luego");
                    
                    break;
                case 1:
                    break;
                case 2:
                   break;
                case 3:
                   break;
            
                default:
                    System.out.println("Opcion inválida intente de nuevo!");
                    break;
            }
        } while (opc != 0); 
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar");
        System.out.println("2. Buscar por Autor:");
        System.out.println("3. Mostrar Todos");
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("\tSelecciona la opción deseada:");
    }
}