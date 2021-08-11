package listas;

public class lista {

    nodo primero;
    nodo ultimo;
    public lista(){
        primero=null;
        ultimo=null;
    }
     public void ingresar(int x){
      nodo nuevo=new nodo();
      nuevo.datos=x;
              if(primero==null){
                  primero=nuevo;
                  primero.siguiente=primero;
                  primero.anterior=ultimo;
                  ultimo=nuevo;

              }
              else {
                  ultimo.siguiente=nuevo;
                  nuevo.siguiente=primero;
                  ultimo=nuevo;
                  primero.anterior=ultimo;
              }

    }
    public void mostrar(){
        nodo actual=new nodo();
        actual=primero;
        do {
            System.out.println(actual.datos);
            actual=actual.siguiente;
        }while (actual!=primero);
    }

}
