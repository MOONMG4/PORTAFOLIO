package datos.unidad1.genericos;

public class Libro extends Producto<Integer>{

  public Libro(String nombre, double precio, Integer paguinas){
   super(nombre,precio,paguinas);
 }
 public void mostrarDetalles(){
  String datos = "Nomre " + super.nombre + "\nPrecio: " + super.precio + "\nPáguinas " + super.getExtra();

  System.out.println(datos);
 }
}