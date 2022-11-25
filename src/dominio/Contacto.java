package dominio;
public class Contacto{
	String nombre;
	String telefono;
	public Contacto(String n, String t){
		nombre=n;
		telefono=t;
	}
	public String toString(){
		return "Nombre: " + nombre + "\nTelefono: " + telefono;
	}
}
