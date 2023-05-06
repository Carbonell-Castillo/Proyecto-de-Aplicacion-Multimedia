/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserList;

import ImagePathList.Lista;
import java.io.Serializable;

/**
 *
 * @author diego
 */
public class User implements Serializable {
    
    protected String user;
    protected ImagePathList.Lista imageList;

    public User(){
        user="";
        imageList= new ImagePathList.Lista();
    }

    public User(String user, ImagePathList.Lista imageList) {
        this.user = user;
        this.imageList = imageList;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ImagePathList.Lista getImageList() {
        return imageList;
    }

    public void setImageList(ImagePathList.Lista imageList) {
        this.imageList = imageList;
    }
    

    
    
    
}
