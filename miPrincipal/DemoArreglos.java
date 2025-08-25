package miPrincipal;
public class DemoArreglos {
    public static void main(String[] args) {
        //Arreglos de enteros
        int []numeros; //declaro el arrglo
        numeros = new int[10]; //creo los elementos del arreglo
        short  [] arregloShort;
        arregloShort = new short[3];

        float arregloFloat[] ;
        arregloFloat = new float[2];

        String []cadenas = new String[8];

        Libro listaLibros[];
        listaLibros = new Libro[4];

        //imprimier el arreglo de Números
        System.out.println("Imprime arreglo de enteros");
        for(int i=0;i<10;i++){
            System.out.println("Posicion: "+i+":"+numeros[i]);
        }

        System.out.println("Imprimer arreglo de esteros cortos");
        //imprimir el arreglo de short
        for(int i=0;i<arregloShort.length;i++){
            System.out.println("Posicion: "+i+":"+arregloShort[i]);
        }

        System.out.println("Imprimer arreglo de reales:");
        arregloFloat[0]=3.1416F;
        for(int i=0;i<arregloFloat.length;i++){
            System.out.println("Posicion: "+i+":"+arregloFloat[i]);
        }

        System.out.println("Imprimo un arreglo de cadenas:");
        cadenas[5]="Esto es una cadena";
        for(int i=0;i<cadenas.length;i++){
            System.out.println("Posicion: "+i+":"+cadenas[i]);
        }

        //crear los libros que voy agregar a la lista
        Libro libro = new Libro("Cien Años de Soledad","Gabriel Garcia Marquez",1980);
        Libro libro2 = new Libro();
        listaLibros[0]= libro;
        listaLibros[1]=libro2;
        listaLibros[2]= new Libro("La Rebelion de la Granje","Orson Well",1940);
        listaLibros[3]= new Libro();


        System.out.println("Imprimo el arreglo de Libros:");
        for(int i=0;i<listaLibros.length;i++){
            System.out.println("Posicion: "+i+": "+listaLibros[i]);
            System.out.println(listaLibros[i].getAutor());
        }

        
    }

}
