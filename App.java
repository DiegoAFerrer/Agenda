import java.util.Scanner;

public class App{

    public static Scanner scanner = new Scanner(System.in);


    public static Contacto editarContacto(Contacto temporal){
        
        System.out.println("Nombre: "); String nombre = scanner.nextLine();
        if (nombre.trim().isEmpty()){
            nombre = temporal.getNombre();
        }

        System.out.println("Teléfono: "); String telefono = scanner.nextLine();
        if (telefono.trim().isEmpty()){
            telefono = temporal.getTelefono();
        }

        System.out.println("Correo: "); String email = scanner.nextLine(); 
        if (email.trim().isEmpty()){
            email = temporal.getEmail();
        }

        System.out.println("Dirección: \n"); 
        System.out.println("Calle: "); String calle = scanner.nextLine(); 
        if (calle.trim().isEmpty()){
            calle = temporal.getDireccion().getCalle();
        }

        System.out.println("No. de Casa: "); String noCasa = scanner.nextLine(); 
        if (noCasa.trim().isEmpty()){
            noCasa = temporal.getDireccion().getNoCasa();
        }

        System.out.println("Colonia: "); String colonia = scanner.nextLine();
        if (colonia.trim().isEmpty()){
            colonia = temporal.getDireccion().getColonia();
        }

        System.out.println("Ciudad: "); String ciudad = scanner.nextLine(); 
        if (ciudad.trim().isEmpty()){
            ciudad = temporal.getDireccion().getCiudad();
        }

        System.out.println("Estado: "); String estado = scanner.nextLine(); 
        if (estado.trim().isEmpty()){
            estado = temporal.getDireccion().getEstado();
        }

        System.out.println("País: "); String pais = scanner.nextLine(); 
        if (pais.trim().isEmpty()){
            pais = temporal.getDireccion().getPais();
        }

        System.out.println("Código Postal: "); String codigoPostal = scanner.nextLine(); 
         if (codigoPostal.trim().isEmpty()){
            codigoPostal = temporal.getDireccion().getCodigoPostal();
        }

        Direccion direccion = new Direccion(calle, noCasa, colonia, ciudad, estado, pais, codigoPostal);

        Contacto contacto = new Contacto(nombre, telefono, email, direccion);
        return contacto;
    }

    public static Contacto introducirContacto(){
        
        System.out.println("Nombre: "); String nombre = scanner.nextLine();
        System.out.println("Teléfono: "); String telefono = scanner.nextLine();  
        System.out.println("Correo: "); String email = scanner.nextLine();  

        System.out.println("Dirección: \n"); 

        System.out.println("Calle: "); String calle = scanner.nextLine();   
        System.out.println("No. de Casa: "); String noCasa = scanner.nextLine(); 
        System.out.println("Colonia: "); String colonia = scanner.nextLine();
 
        System.out.println("Ciudad: "); String ciudad = scanner.nextLine(); 
        System.out.println("Estado: "); String estado = scanner.nextLine();
        System.out.println("País: "); String pais = scanner.nextLine(); 

        System.out.println("Código Postal: "); String codigoPostal = scanner.nextLine(); 

        Direccion direccion = new Direccion(calle, noCasa, colonia, ciudad, estado, pais, codigoPostal);

        Contacto contacto = new Contacto(nombre, telefono, email, direccion);
        return contacto;
    }

    public static void main(String[] args){

        Agenda a1 = new Agenda();

        boolean on = true;

        do{
            System.out.println("1. Ver Contactos");
            System.out.println("2. Editar Contactos");
            System.out.println("3. Agregar Contactos");
            System.out.println("4. Eliminar Contactos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar scanner

            int indice;
            
            switch (opcion) {
                case 1 -> System.out.println(a1.mostrarContactos());

                case 2 -> {
                    System.out.println("Seleccione el índice del contacto que desea editar: \n");
                    System.out.println(a1.mostrarContactos());

                    System.out.println("Índice: "); indice = scanner.nextInt() - 1;
                    scanner.nextLine();
                    Contacto editado = editarContacto(a1.getContactos().get(indice));
                    a1.editarContacto(indice, editado);
                }
                case 3 -> {
                    Contacto agregado = introducirContacto();
                    a1.agregarContacto(agregado);
                }
                
                case 4 -> {
                    System.out.println("Seleccione el índice del contacto que desea eliminar: \n");
                    System.out.println(a1.mostrarContactos());

                    System.out.println("Índice: "); indice = scanner.nextInt() - 1;

                    a1.eliminarContacto(indice);
                }

                case 5 -> on = false;
                
                default -> {
                    System.err.println("Selecciona un número del uno al seis");
                }
            }

        } while(on);
        
    }
}