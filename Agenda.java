
import java.util.ArrayList;

public class Agenda {

   private ArrayList<Contacto> contactos;

   public Agenda(){
      this.contactos = new ArrayList<>();
   }

   public ArrayList<Contacto> getContactos(){
      return this.contactos;
   }

   public void agregarContacto(Contacto contacto){
      this.contactos.add(contacto);
   }

   public void eliminarContacto(int indice){
      this.contactos.remove(this.contactos.get(indice));
   }

   public String mostrarContactos(){
      String lista = "";

      for (int i = 0 ; i < this.contactos.size(); i++) {
         lista += i+1 + ". " + this.contactos.get(i).toString() + "\n";
      }

      return lista;
   }

}