/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImagePathList;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Nodo implements Serializable{
    
    Image dato;
    Nodo siguiente;
    
    public Image getImage() {
        return dato;
    } 
    
    public void setImage(Image nuevo) {
        this.dato = nuevo;
    }
}
