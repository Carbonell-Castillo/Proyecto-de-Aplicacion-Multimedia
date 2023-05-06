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
public class Image implements Serializable {
    
    protected int id;
    protected String path;
    protected String category;

    public Image(){
        id=0;
        path="";
        category="";
    }
    public Image(int id, String path, String category) {
        this.id = id;
        this.path = path;
        this.category= category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    
    
}
