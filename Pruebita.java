
package pruebita;

import java.util.Scanner; //Se importa para escribir en consola

public class Pruebita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//Aqui se crea la variable sc para guardar lo que se escriba en consola
        
        System.out.println("Ingrese Nombre:  ");
        String Nombre = sc.next();
        
        System.out.println("Ingrese Edad:   ");
        int Edad = sc.nextInt();
        
        System.out.println("Tu nombre es: " + Nombre);
        System.out.println("Tu edad es: " + Edad);
    }
}
