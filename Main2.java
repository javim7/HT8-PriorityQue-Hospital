//importando clases externas
import java.util.*; 
import java.io.File;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;


/***************************************
 * @author Javier Mombiela 20067
 * 
 * Clase Main, controla el menu y el
 * funcionamiento del programa.
 ***************************************/
public class Main2 {

    //creando variables
    static String nombre = "";
    static String sintoma = "";
    static String codigoEmergencia = "";
    static String[] partes;

    public static void main(String[] args) {

        //Para leer el archivo
        ArrayList<String> archivo = new ArrayList<>();

         //try catch para poder encontrar el archivo de texto que contiene las palabras
         try {
            Stream<String> lines = Files.lines(
                    Paths.get("pacientes.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(archivo::add);

        } catch (IOException e ){
            System.out.println("No se ha encontrado el archivo!");
        }

        //haciendo un foreach para poder crear un arraylist con los 3 idiomas
        for (String linea : archivo) {

            ArrayList<String> pacientes = new ArrayList();

            //foreach para poder separar las palabras por las comas y agregarlas a la lista
            for (String seccion : linea.split(",")) {
                pacientes.add(seccion);
            }
        
        for(int i = 0; i<pacientes.size();i++) {
            System.out.println(pacientes.get(i));
        }

    }
    
}
}
