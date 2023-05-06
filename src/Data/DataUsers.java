/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import UserList.Lista;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author bruce
 */
public class DataUsers {
    public static void createData(){
    try {
            
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(
                           new FileOutputStream("C:\\Users\\bruce\\OneDrive\\Imágenes\\Saved Pictures\\usuarios.dat"));
            
            escribiendo_fichero.writeObject(SG.lista_usuarios);
            escribiendo_fichero.close();

            System.out.println("Usuarios Aguardados");
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println(e);
        }
    }

public static void readData() {
    String filePath = "C:\\Users\\bruce\\OneDrive\\Imágenes\\Saved Pictures\\usuarios.dat";
    if (validateExistData(filePath)) {
        try {
            ObjectInputStream recuperando_fichero = new ObjectInputStream(
                new FileInputStream(filePath)
            );
            SG.lista_usuarios = (Lista) recuperando_fichero.readObject();
            recuperando_fichero.close();
            System.out.println("Lista Recuperada");
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println(e);
        }
    } else {
        System.err.println("El archivo " + filePath + " no existe.");
    }
}

public static boolean validateExistData(String filePath) {
    File file = new File(filePath);
    return file.exists() && !file.isDirectory();
}

}

