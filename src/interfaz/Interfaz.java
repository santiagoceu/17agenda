package interfaz;
import dominio.*;
import java.util.Scanner;

public class Interfaz {
	public boolean procesarPeticion (String peticion, Libreta l){
		String [] p=peticion.split(" ");
		if (p[0].equals("add") && (p.length>1)) {
			
			l.add(new Contacto(p[1],p[2],l.size()));

		}	
		else if (p[0].equals("list"))
			System.out.print(l);
		else if (p[0].equals("help"))
			System.out.print("Introduzca una de las siguientes peticiones: \n add <nombre> <telefono> \nlist \nexit");
		else if (p[0].equals("remove") && (p.length>1))
			l.remove(Integer.parseInt(p[1]));
		else if (p[0].equals("exit"))
			return false;
		return true;
	}
	public String leerPeticion(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("> ");
		String cadena = sc.nextLine();
		return cadena;
	}
}
