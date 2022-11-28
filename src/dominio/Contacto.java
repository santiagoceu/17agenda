package dominio;
import java.io.Serializable;
public class Contacto implements Serializable {
	String nombre;
	String numeroDeTelefono;
	public Contacto(String n, String t){ // <nombre> <telefono>
		this.nombre=n;
		this.numeroDeTelefono=t;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}
	public String getNumeroDeTelefono() {
		return this.numeroDeTelefono;
	}
	public void setNumeroDeTelefono(String t) {
		this.numeroDeTelefono=t;
	}
	public String toString(){
		return "Nombre: " + this.nombre + "\nTelefono: " + this.numeroDeTelefono;
	}
}
