/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserList;

import ImagePathList.*;

/**
 *
 * @author diego
 */
public class Lista extends EstructuraDeDatos {

    private Nodo primero;
    private Nodo ultimo;
    private int size;

    //Inicializar la lista
    public Lista() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    
    //Verificar si la lista esta vacia
    public boolean listaVacia() {
        return primero == null;
    }
    
    //Metodo para ver la lista
    public void mostrar() {
        Nodo actual = new Nodo();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            System.out.println("[" + contador + "]: Usuario: "+actual.getUser().getUser()+" Path Image: " + actual.getUser().getImageList().get(contador).getPath()+ " Category"+ actual.getUser().getImageList().get(contador).getCategory());
            actual = actual.siguiente;
            contador ++;
        }
    }
    
    public Boolean validateUser(String user){
        Boolean validate=false;
        Nodo actual = new Nodo();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            if(actual.getUser().getUser().equals(user)){
                validate=true;
            }
            actual = actual.siguiente;
            contador ++;
        }
        return validate;
    }
    
    @Override
    public void add(Object e) {
        User image = (User) e;
        
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = image;
        
        if (primero == null) {
            primero = nuevoNodo;
            primero.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = null;
            ultimo = nuevoNodo;
        }
        size++;
    }
    
    @Override
    public void delete(Object e) {
        User user = (User) e;
        
        Nodo actual = new Nodo();
        actual = primero;
        
        Nodo anterior = null;
        
        while (actual != null && !(actual.dato.getUser().equals(user.getUser()))) {
            anterior = actual;
            actual = actual.siguiente;
        }
        
        if (actual == null) {
           return;
        }
        
        if(anterior == null) {
            primero = actual.siguiente;
        } else {
            anterior.siguiente = actual.siguiente;
        }
        
        if(actual.siguiente == null) {
            ultimo = anterior;
        }
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public User findUser(String user) {
        User userFind= new User();
        Nodo actual = new Nodo();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            if(actual.getUser().getUser().equals(user)){
                userFind= actual.getUser();
            }
            actual = actual.siguiente;
            contador ++;
        }
        return userFind;
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        return size;
    }

    public User getUserIndex(int index){
        User user = new User();
        Nodo actual = new Nodo();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            if(contador == index){
                user= actual.getUser();
            }
            actual = actual.siguiente;
            contador ++;
        }
        return user;
    }
    
    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
