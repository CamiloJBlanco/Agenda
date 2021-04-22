import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Agenda {

    private Map<Contacto, Telefono> contactos = new HashMap<>();

    public Agenda(Map<Contacto,Telefono> mapAgenda) {
    }


    public Map<Contacto, Telefono> getAgenda() {
        return contactos;
    }

    public Contacto buscarContacto(String nombre, String apellido){
        Contacto contacto = null;
        try{
            Set<Contacto> contactoArray = contactos.keySet();
            Contacto newContacto = new Contacto(nombre, apellido);
            if(contactoArray.contains(newContacto)) {
                return newContacto;
            } else {
                throw new ContactoNoEncontradoException();
            }
        } catch(ContactoNoEncontradoException noEncontradoException) {
            System.out.println(noEncontradoException.getMessage());
        }
        return contacto;
    }

    public Telefono buscarTelefono(Contacto c) throws TelefonoNoEncontradoException{
        Telefono telefono = contactos.get(c);
        if(telefono != null){
            return telefono;
        } else{
            throw new TelefonoNoEncontradoException("Telefono no encontrado");
        }
    }

    public Telefono agregarContacto(Contacto c, Telefono t){
        contactos.put(c,t);
        return t;
    }

    public Telefono eliminarContacto(Contacto c){
        Telefono t = contactos.remove(c);
        return t;
    }

    public void editarTelefono(Contacto c, Telefono t) throws ContactoNoEncontradoException{
        if(contactos.get(c) == null) throw new ContactoNoEncontradoException();
        contactos.put(c, t);
    }
   }
