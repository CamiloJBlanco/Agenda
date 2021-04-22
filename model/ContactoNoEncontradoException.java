public class ContactoNoEncontradoException extends Exception{

    private static String mensaje = "Contacto no encontrado";

    public ContactoNoEncontradoException() {
        super(mensaje);
    }
}
