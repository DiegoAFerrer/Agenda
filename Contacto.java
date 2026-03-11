public class Contacto{
    private String nombre;
    private String telefono;
    private String email;
    private Direccion direccion;

    public Contacto(String nombre, String telefono, String email, Direccion direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getEmail(){
        return this.email;
    }

    public String getDireccion(){
        return this.direccion.toString();
    }

      public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ". Telefono: " + this.telefono + ". Correo: " + this.email;
    }
}