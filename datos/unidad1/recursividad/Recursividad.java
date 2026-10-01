package datos.unidad1.recursividad;
import java.util.Scanner;

public class Recursividad {
 public static void saludo(int total, String nombre){
  if(total <= 0)//Condición base
     return;
  else{//Condición recurciva o repititiva
   System.out.println("Hola " + nombre);
   saludo(total-1, nombre);
  }
 }

 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);

  System.out.println("Dame tu nombre ");
  String nombre = scan.nextLine();
  saludo(10, nombre);
 }
}