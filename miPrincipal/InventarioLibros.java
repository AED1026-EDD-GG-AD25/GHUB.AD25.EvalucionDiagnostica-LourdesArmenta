package miPrincipal;
public class InventarioLibros {
    Libro listaLibros[];
    int contador;
    //constructor
    public InventarioLibros(){
        listaLibros = new Libro[2];
        contador = 0;
    }
    //metodos
    public void agregar(Libro libro){
        if (contador>=listaLibros.length){
            //arreglo esta lleno
            //amplio el arreglo
            Libro []listaLibrosTemp = new Libro[listaLibros.length*2];
            //copio el arreglo original al temporal
            for(int i=0; i<listaLibros.length;i++){
                listaLibrosTemp[i]=listaLibros[i];
            }
            //regreso todo al arreglo original
            listaLibros = listaLibrosTemp;
        }
        listaLibros[contador++] = libro;
    }
    public void mostrar(){
        for (int i=00; i<contador;i++){
            System.out.println(listaLibros[i]);
        }

    }
    public Libro buscar(String autor){
        for(int i=0;i<contador;i++){
            if(listaLibros[i].getAutor().equalsIgnoreCase(autor))
               return listaLibros[i];
        }
       return null;

    }
    
}