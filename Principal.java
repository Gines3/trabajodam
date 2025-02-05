import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal{
public static void main(String[] args){
System.out.println("Hola Mundo");
mostrarFechaHora();
}
public static void mostrarfechahora() {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
System.out.println("Fecha y hora actual: " + sdf.format(new Date()));
}
}
