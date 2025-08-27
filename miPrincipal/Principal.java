package miPrincipal;
import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        String titulo,autor;
        int anio;
        int opc;
        InventarioLibros inventarioLibros = new InventarioLibros();

        do{
            menu();
            opc = entrada.nextInt();
            entrada.nextLine(); //limpiar el buffer del teclado
            switch (opc) {
                case 0:
                    System.out.println("Hasta Luego");
                    
                    break;
                case 1:
                    System.out.print("Proporciona Titulo:");
                    titulo = entrada.nextLine();
                    System.out.print("Proporciona Autor:");
                    autor = entrada.nextLine();
                    System.out.print("Proporciona Año de publicación:");
                    anio = entrada.nextInt();
                    Libro libro = new Libro(titulo,autor,anio);
                    inventarioLibros.agregar(libro);
                    System.out.println("Operación Exitosa, el libro se ha agregado");
                    break;
                case 2:
                    System.out.print("Proporciona Autor:");
                    autor = entrada.nextLine();
                    Libro[] librobuscado;
                    librobuscado = inventarioLibros.buscar(autor);
                    if(librobuscado != null){
                        for (int i = 0; i < librobuscado.length; i++) {
                            System.out.println("Libro Encontrado: "+librobuscado[i].toString());
                        }
                    }else{
                        System.out.println("Libro No encontrado!!!!");
                    }
                   break;
                case 3:
                    System.out.println("Listado de Libros:");
                    inventarioLibros.mostrar();
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