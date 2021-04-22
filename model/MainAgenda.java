import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {

        Contacto contacto = new Contacto("Pepe", "Gonzalez");
        Telefono telefono = new Telefono(54, 2226, 203658);

        Contacto contacto2 = new Contacto("Tincho", "Gonzalez");
        Telefono telefono2 = new Telefono(54, 2226, 258693);

        Map<Contacto, Telefono> mapAgenda = new HashMap<>();
        mapAgenda.put(contacto, telefono);
        Agenda agenda = new Agenda(mapAgenda);

        agenda.agregarContacto(contacto2, telefono2);

        System.out.println(agenda.getAgenda());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar nombre de contacto");
        String nombre = scanner.nextLine();

        System.out.println("Ingresar apellido de contacto");
        String apellido = scanner.nextLine();

        System.out.println("Ingresar prefijo de telefono");
        Integer prefij = scanner.nextInt();

        System.out.println("Ingresar area de telefono");
        Integer area = scanner.nextInt();

        System.out.println("Ingresar numero de telefono");
        Integer numero = scanner.nextInt();

        Contacto contacto3 = new Contacto(nombre, apellido);
        Telefono telefono3 = new Telefono(prefij, area, numero);

        agenda.agregarContacto(contacto3, telefono3);

        System.out.println(agenda.getAgenda());
    }
}
