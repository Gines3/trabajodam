import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
	public static void main(String[] args) {
    	System.out.println("Hola Mundo");
    	mostrarFechaHora();
   	 
    	Scanner scanner = new Scanner(System.in);
   	 
    	System.out.print("¿Cuántos usuarios quieres ingresar? ");
    	int cantidad = scanner.nextInt();
    	scanner.nextLine();  // Limpiar el buffer del scanner
   	 
    	Usuario[] usuarios = crearUsuarios(cantidad, scanner);

    	for (Usuario usuario : usuarios) {
        	System.out.println("Nombre: " + usuario.nombre + ", Apellidos: " + usuario.apellidos + ", Email: " + usuario.email);
    	}
	}

	public static void mostrarFechaHora() {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	System.out.println("Fecha y hora actual: " + sdf.format(new Date()));
	}

	public static Usuario[] crearUsuarios(int cantidad, Scanner scanner) {
    	Usuario[] usuarios = new Usuario[cantidad];
    	for (int i = 0; i < cantidad; i++) {
        	System.out.print("Nombre del usuario " + (i+1) + ": ");
        	String nombre = scanner.nextLine();
        	System.out.print("Apellidos del usuario " + (i+1) + ": ");
        	String apellidos = scanner.nextLine();
        	System.out.print("Email del usuario " + (i+1) + ": ");
        	String email = scanner.nextLine();
        	usuarios[i] = new Usuario(nombre, apellidos, email);
    	}
    	return usuarios;
	}
}


