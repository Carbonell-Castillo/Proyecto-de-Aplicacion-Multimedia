/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserList;

import ImagePathList.*;
import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Nodo implements Serializable{
    
    User dato;
    Nodo siguiente;
    
    public User getUser() {
        return dato;
    } 
    
    public void setUser(User nuevo) {
        this.dato = nuevo;
    }
}
