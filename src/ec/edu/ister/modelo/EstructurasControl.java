package ec.edu.ister.modelo;

import java.util.Scanner;

/**
 * @Estructura de datos
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class EstructurasControl {
    public static void lazosCondicionales(){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un número");
        int nota =input.nextInt();
        switch(nota){
            case 10:{
                int i=1,j=2;
                int x = ++i+j++;
                System.out.printf("i=%d,j=%d,x=%d",i,j,x);
                break;}
            case 11:{
                 int i=1,j=2;
                int x = ++i+j++;
                System.out.printf("i=%d,j=%d,x=%d",i,j,x);
                break;}
            default:
                System.out.println("no se ingreso correctamente");
                break;
        }
    }
            

}
