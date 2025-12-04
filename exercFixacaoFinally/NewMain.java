package exercFixacaoFinally;

import java.io.*;
import java.util.*;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File("C:\\Users\\PLATINADO\\OneDrive\\Documentos\\mentoria_java_2025\\src\\exercFixacaoFinally\\in.txt");
        Scanner sc = null;

        try {

            sc = new Scanner(file);
            while (sc.hasNextLine()) {

                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {

            System.out.println("Erro abrindo o ficheiro: " + e.getMessage());
        } finally {

            if (sc != null) {

                sc.close();
            }
            System.out.println("finally block executed");
        }

    }

}
