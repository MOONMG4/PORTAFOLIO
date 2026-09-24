package datos.unidad1.recursividad;

public class Recursividad {
 public static void saludo(int total){
  if(total <= 0)//Condición base
     return;
  else{//Condición recurciva o repititiva
   System.out.println("Hola");
   saludo(total-1);
  }
 }

 public static void main(String[] args){
  saludo(10);
 }
}