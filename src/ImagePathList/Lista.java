/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImagePathList;

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
            System.out.println("[" + contador + "]: id: "+actual.getImage().getId()+" Path: " + actual.getImage().getPath()+ " Category"+ actual.getImage().getCategory());
            actual = actual.siguiente;
            contador ++;
        }
    }
    
    @Override
    public void add(Object e) {
        Image image = (Image) e;
        
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
    
    public void deleteImage(int index) {
        
        Nodo actual = new Nodo();
        actual = primero;
        
        Nodo anterior = null;
        
        while (actual != null && !(actual.dato.getId()== index)) {
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

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        return size;
    }
    
    public void addListCategoriesUser(String category){
        Nodo actual = new Nodo();
        actual = primero;
        
        while (actual != null) {
            if(actual.getImage().getCategory().equals(category)){
                Data.SG.listImageWorks.add(actual.getImage());
            }
            actual = actual.siguiente;   
        }
    }
    
    
    /*public String getCategory(){
        String findCategory
                retr
    }*/
    public Image getListImage(int index){
        Nodo actual = new Nodo();
        Image findImage= new Image();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            System.out.println("[" + contador + "]: id: "+actual.getImage().getId()+" Path: " + actual.getImage().getPath()+ " Category"+ actual.getImage().getCategory());
            if(contador==index){
                findImage= actual.getImage();
            }
            actual = actual.siguiente;
            contador ++;
        }
        return findImage;
    }
    public Image getCategoryIndex(int index){
        Nodo actual = new Nodo();
        Image findImage= new Image();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            System.out.println("[" + contador + "]: id: "+actual.getImage().getId()+" Path: " + actual.getImage().getPath()+ " Category"+ actual.getImage().getCategory());
            if(contador==index){
                findImage= actual.getImage();
            }
            actual = actual.siguiente;
            contador ++;
        }
        return findImage;
    }
    
    public Image get(int i222) {
        Nodo actual = new Nodo();
        Image findImage= new Image();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            System.out.println("[" + contador + "]: id: "+actual.getImage().getId()+" Path: " + actual.getImage().getPath()+ " Category"+ actual.getImage().getCategory());
            if(actual.getImage().getId()==i222){
                findImage= actual.getImage();
            }
            actual = actual.siguiente;
            contador ++;
        }
        return findImage;
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
