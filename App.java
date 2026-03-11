import java.util.Scanner;

public class App{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Direccion d1 = new Direccion("tawa nanpa wan", "tu", "ma pi linja telo", "ma tomo pona", "ma pona lili", "ma pona", "luka wan");
        Contacto c1 = new Contacto("kala", "luka luka wan", "kala@toki.kon", d1);
        Contacto c2 = new Contacto("soweli", "luka luka tu", "soweli@toki.kon", d1);

        Agenda a1 = new Agenda();

        a1.agregarContacto(c1);
        a1.agregarContacto(c2);

        System.out.println(a1.mostrarContactos());


        boolean on = true;


        do{
            System.out.println("1. Ver Contactos");
            System.out.println("2. Editar Contactos");
            System.out.println("3. Agregar Contactos");
            System.out.println("4. Eliminar Contactos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(a1.mostrarContactos()); 
                    break;

                case 2:
                    System.out.println("Seleccione el índice del contacto que desea editar: \n");
                    System.out.println(a1.mostrarContactos());

                    System.out.println("Índice: "); int i = scanner.nextInt() - 1;

                    a1.eliminarContacto(i);
                    break;
                case 3:
                    System.out.println("Ingrese los datos del contacto: \n");
                    System.out.println("Nombre: "); String nombre = scanner.nextLine(); 


                    System.out.println("Teléfono: "); String telefono = scanner.nextLine(); 

                    System.out.println("Correo: "); String correo = scanner.nextLine(); 

                    System.out.println("Dirección: "); 
                    System.out.println("Calle: "); String calle = scanner.nextLine(); 
                    System.out.println("No. de Casa: "); String noCasa = scanner.nextLine(); 
                    System.out.println("Colonia: "); String colonia = scanner.nextLine();


                    System.out.println("Ciudad: "); String ciudad = scanner.nextLine(); 
                    System.out.println("Estado: "); String estado = scanner.nextLine(); 
                    System.out.println("País: "); String pais = scanner.nextLine(); 

                    System.out.println("Código Postal: "); String codigoPostal = scanner.nextLine(); 

                    Direccion direccion = new Direccion(calle, noCasa, colonia, ciudad, estado, pais, codigoPostal);

                    Contacto contacto = new Contacto(nombre, telefono, correo, direccion);

                    a1.agregarContacto(contacto); 
                    break;
                
                case 4:
                    System.out.println("Seleccione el índice del contacto que desea eliminar: \n");
                    System.out.println(a1.mostrarContactos());

                    System.out.println("Índice: "); int i = scanner.nextInt() - 1;

                    a1.eliminarContacto(i);
                    break;

                case 5:
                    on = false;
                    break;
                default:
                    break;
            }

        } while(on);
        
    }
}