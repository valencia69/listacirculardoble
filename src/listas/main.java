package listas;

import java.util.Scanner;

public class main {
    public static  void  main(String[] args){
        Scanner teclado=new Scanner(System.in);
        lista listal=new lista();
       int opcion=0;
       do {
           System.out.println("eliga opcion");
           System.out.println("1.ingresar");
           System.out.println("2.mostrar");
           System.out.println("0.salir");
           opcion=teclado.nextInt();
           switch (opcion)
           {
               case 1:
                   System.out.println("ingrese un valor");
                   int dato=teclado.nextInt();
                   listal.ingresar(dato);
                   break;
               case 2:
                   System.out.println("mostrar lista");
                   listal.mostrar();
                   break;
           }

       }
       while(opcion!=3);

    }
}
