//importando clases externas
import java.util.*; 
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


/***************************************
 * @author Javier Mombiela 20067
 * 
 * Clase Main, controla el menu y el
 * funcionamiento del programa.
 ***************************************/
public class Main {

    public static void main(String[] args) {

         //creando instancias
        Scanner scanner = new Scanner(System.in);

        //creando variables
         String nombre = "";
         String sintoma = "";
         String codigoEmergencia = "";
         String[] partes;
         VectorHeap<Pacientes> Pacientes = new VectorHeap<Pacientes>();

        //se utiliza un try catch para aseguranos que el archivo pueda ser leido correctamente 
        try{

            //creando variables
            File archivoTexto = new File("pacientes.txt"); //creando nuestro nuevo archivo

            Scanner scan = new Scanner(archivoTexto); //instanciando la clase scanner con el archivo

            while(scan.hasNextLine()) { //while para que se lean todas las lineas en el archivo

                String linea = scan.nextLine(); //guardando los elementos (de cada linea) como variables
                
                //separando cada linea por la coma
                partes = linea.split(",");
                nombre = partes[0];
                sintoma = partes[1];
                codigoEmergencia = partes[2];

                Pacientes nuevoPaciente = new Pacientes(nombre, sintoma, codigoEmergencia);
                Pacientes.add(nuevoPaciente);
    
            }

            //se hace un catch por si el archivo no se puede leer
        } catch (FileNotFoundException errorArchivoNoEncontrado) {
            // Se le advierte al usuario que el archivo no es existente, se termina el programa.
            System.out.println("El archivo de texto pacientes.txt no ha sido encontrado.");
        }
        

        //haciendo un boolean iniciandolo en true
        boolean menu = true;

        //haciendo un while para que haya un ciclo infinito
        while(menu) {
            //creando menu
            System.out.println("\nMenu");
            System.out.println("(1) Atender Siguiente Paciente");
            System.out.println("(2) Ver proximo en lista de espera");
            System.out.println("(3) Salir del programa");

            int opcion = 0;

        //creando un try catch para asegurar que se ingrese una opcion correcta entre 10 y 30
        while(true){
            try{
                System.out.print("Opcion: ");
                opcion = scanner.nextInt();
                //(Programación defensiva)
                //Protección por si el usuario elige un número menor a uno o mayor a dos, seguirá pidiendo la opción. 
                if(opcion > 3 || opcion < 1){
                    System.out.println("\nOpcion incorrecta, intenta de nuevo..");
                }
                //Si el usuario ingresa los datos correctos terminará el ciclo while
                else{break;}
            }
            //Si el usuario ingresa una letra regresará un mensaje de error. 
            catch(Exception o){
                scanner.nextLine();
                System.out.println("Caracter invalido! Intenta de nuevo..");
            }
        } 


        //menu

        //opcion1, atender al siguiente paciente
        if(opcion==1) {

            //instanciando el paciente
            Pacientes siguientePaciente;

            //if para ver si el vector esta vacio o no
            if(!Pacientes.isEmpty()) {
                //eliminando al pciente del heap
                siguientePaciente = Pacientes.remove();

                //sacando info del paciente
                System.out.println("\nEl doctor ha atendido al paciente : ");
                System.out.println("\t Nombre:       "+siguientePaciente.getNombre());
                System.out.println("\t Enfermedad:  "+siguientePaciente.getSintoma());
                System.out.println("\t Codigo:      "+siguientePaciente.getPrioridadPaciente());

                //else por si el vector esta vacio
            }else {
                System.out.println("\nTodos los pacientes han sido atendidos!");
            }

        }

        //opcion2, ver lista de espera
        if(opcion==2) {

            //instanciando la clase pacientes
            Pacientes siguientePatient;

            //viendo si el heap esta vacio o no
            if(!Pacientes.isEmpty()) {

                //sacando al primer paciente en el heap
                siguientePatient = Pacientes.getFirst();

                //imprimiendo ifno del pacientes
                System.out.println("El siguiente paciente para atender es : ");
                System.out.println("\t Nombre:       "+siguientePatient.getNombre());
                System.out.println("\t Enfermedad:  "+siguientePatient.getSintoma());
                System.out.println("\t Codigo:      "+siguientePatient.getPrioridadPaciente());

                //else por si la lista esta vacia
            }else {
                System.out.println("No hay ningun paciente en la lista de espera!");
            }

        }

        //opcion3, salir del programa
        if(opcion==3) {
            //imprimiendo mensajes de despedidda
            System.out.println("\nGracias por utilizar el programa, vuelva pronto!");
            System.out.println("Finalizando Programa...");
            System.out.println("Programa Finalizado!\n");
            //haciendo el boolean false pora que salga del ciclor
            menu = false;
        }
        
    }
        
    }
    
}
