package dominio;
import java.util.ArrayList;
import java.io.Serializable;
public class Libreta implements Serializable{
	private ArrayList<Contacto> lista;
	public Libreta(){
		lista=new ArrayList<Contacto>();
	}
	public Libreta add(Contacto c){
		this.lista.add(c);
		return this;
	}
	public int size() {
		return lista.size();
	}
	public String toString(){
		String cadena="";
		for(Contacto c:lista)
			cadena+=c+"\n";
		return cadena;
	}
}
