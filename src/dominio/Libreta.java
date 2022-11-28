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

	public void remove(int id) {
		for (Contacto c : this.lista) {
			if (c.getId()==id) {
				for (int i=id+1;i<=lista.size();i++)
					lista.get(i).setId(i-1);
			}
		}
	}
	public String toString(){
		String cadena="";
		for(Contacto c:lista)
			cadena+=c+"\n";
		return cadena;
	}
}
