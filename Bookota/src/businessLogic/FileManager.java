package businessLogic;

import java.io.*;
import java.util.HashMap;
import data.*;


public class FileManager {

    public static void saveUsersMap(File archive, HashMap<String, User> usersMap) { //Esta funcion guarda los cambios en el archivo de texto
        FileOutputStream output = null;
        ObjectOutputStream writer = null;
        try { //Se hace un try-catch por si bota un error
            archive.createNewFile(); //Se crea el archivo
            output = new FileOutputStream(archive); //Se instancia el flujo de salida del arhivo
            writer = new ObjectOutputStream(output); //Se instancia el flujo de salida del objeto
            writer.writeObject(usersMap);
        } catch (IOException ex) {

        } finally {
            if (output != null) {
                try {
                    output.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {

                }
            }
        }
    }

    public static void saveBooksMap(File archive, HashMap<Integer, Book> booksMap) { //Esta funcion guarda los cambios en el archivo de texto
        FileOutputStream output = null;
        ObjectOutputStream writer = null;
        try { //Se hace un try-catch por si bota un error
            archive.createNewFile(); //Se crea el archivo
            output = new FileOutputStream(archive); //Se instancia el flujo de salida del arhivo
            writer = new ObjectOutputStream(output); //Se instancia el flujo de salida del objeto
            writer.writeObject(booksMap);
        } catch (IOException ex) {
            
        } finally {
            if (output != null) {
                try {
                    output.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    
                }
            }
        }
    }

    public static HashMap<String, User> updateUsersMap(File archive) { //Este método lee el archivo de texto
        FileInputStream input = null;
        ObjectInputStream reader = null;
        HashMap<String, User> usersMap = new HashMap<>();
        try {
            input = new FileInputStream(archive);
            reader = new ObjectInputStream(input);
            return (HashMap<String, User>) reader.readObject();
        } catch (FileNotFoundException ex) {

        } catch (IOException | ClassNotFoundException ex) {

        }
        return usersMap;
    }

    public static HashMap<Integer, Book> updateBooksMap(File archive) { //Este método lee el archivo de texto
        FileInputStream input = null;
        ObjectInputStream reader = null;
        HashMap<Integer, Book> booksMap = new HashMap<>();
        try {
            input = new FileInputStream(archive);
            reader = new ObjectInputStream(input);
            booksMap = (HashMap<Integer, Book>) reader.readObject();
            return booksMap;
        } catch (FileNotFoundException ex) {
            
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        return booksMap;
    }
    
    public static String readReviewFile(String filePath) throws FileNotFoundException, IOException {
        String line;
        String review = "";
        new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), "UTF8"));

        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));
        
        while((line = in.readLine())!=null) {
            review += line;
        }
        in.close();
        return review;
    }
}
