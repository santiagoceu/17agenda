package dominio;
import java.util.ArrayList;

public class Libreta{
	private ArrayList<Contacto> lista;
	public Libreta(){
		lista=new ArrayList<Contacto>();
	}
	public Libreta add(Contacto c){
		this.lista.add(c);
		return this;
	}
	public String toString(){
		String cadena="";
		for(Contacto c:lista)
			cadena+=c+"\n";
		return cadena;
	}
}
