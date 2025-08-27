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
    public Libro[] buscar(String autor){
        Libro[] librosEncontrados = new Libro[2];
        for(int i=0;i<contador;i++){
            if(listaLibros[i].getAutor().equalsIgnoreCase(autor)) {
               if (i >= librosEncontrados.length) {
                    Libro[] listaLibrosTemp = new Libro[librosEncontrados.length*2];
                    for (int x = 0; x < librosEncontrados.length; x++) {
                        listaLibrosTemp[x] = librosEncontrados[x];
                    }
               }
               librosEncontrados[i] = listaLibros[i];
            }
        }
       return librosEncontrados;

    }
    
}