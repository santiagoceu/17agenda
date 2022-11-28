package aplicacion;
import java.io.*;
import dominio.*;
import interfaz.*;
public class Principal{
	public static void main(String [] args) {
		ObjectInputStream fi; // Fichero para leer
		ObjectOutputStream fo; // Fichero para escribir
		Libreta l;
		try {
			fi = new ObjectInputStream(new FileInputStream("agenda.txt"));
			l = (Libreta) fi.readObject();
			fi.close();
		} catch (Exception e) {
			l=new Libreta ();
		} 
		
		Interfaz IU=new Interfaz();
		String peticion;
		do {
			peticion=IU.leerPeticion();
		} while (IU.procesarPeticion(peticion,l));
		try {
			fo=new ObjectOutputStream(new FileOutputStream("agenda.txt"));
			fo.writeObject(l);
			fo.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.print("Error al crear el fichero");
		}
	}
}
