/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ImagePathList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Serializar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lista lista_usuarios = new Lista();

        System.out.println("Lista de imagenes");
        System.out.println(lista_usuarios.getSize());

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el id");
            int id = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingres el path");
            
            String path = entrada.nextLine();
            
            System.out.println("Ingrese la categoria");
            String category = entrada.nextLine();
            
            Image nuevo = new Image(id, path, category);
            lista_usuarios.add(nuevo);
        }

        System.out.println("Lista_Usuarios");
        System.out.println("size:" + lista_usuarios.getSize());
        lista_usuarios.mostrar();
        System.out.println("Obteniendooooo");
        
        
        System.out.println("Eliminar un usuario: ");
        Scanner entrada2 = new Scanner(System.in);
        
        int id = entrada2.nextInt();
        lista_usuarios.delete(new Image(id, "", ""));
        lista_usuarios.mostrar();
        
        
        try {
            
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(
                           new FileOutputStream("C:\\Users\\bruce\\OneDrive\\Imágenes\\Saved Pictures\\usuarios.dat"));
            
            escribiendo_fichero.writeObject(lista_usuarios);
            escribiendo_fichero.close();

            
            ObjectInputStream recuperando_fichero = new ObjectInputStream(
                           new FileInputStream("C:\\Users\\bruce\\OneDrive\\Imágenes\\Saved Pictures\\usuarios.dat")
            );
            
            Lista lista_recuperada = (Lista) recuperando_fichero.readObject();
            
            recuperando_fichero.close();
            
            System.out.println("Lista Recuperada");
            System.out.println(lista_recuperada.getSize());
            lista_recuperada.mostrar();
            
            
            
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println(e);
        }

    }

}
