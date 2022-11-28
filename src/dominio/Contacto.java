package dominio;
import java.io.Serializable;
public class Contacto implements Serializable {
	String nombre;
	String numeroDeTelefono;
	int id;
	public Contacto(String n, String t,int i){ // <nombre> <telefono>
		this.nombre=n;
		this.numeroDeTelefono=t;
		this.id=i;
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
	public int getId() {
		return this.id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String toString(){
		return "ID: " + this.id + " | Nombre: " + this.nombre + " | Telefono: " + this.numeroDeTelefono;
	}
}
