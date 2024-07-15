/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backingBean;

import controller.ControllerLogIn;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class beanIngreso {

    private String user;
    private String pass;

  public String ingresoAlSistema(){
    
    ControllerLogIn controllerLogIn = new ControllerLogIn();
    
    if(controllerLogIn.LogIn(user, pass)) {
        return "yes";
    } else return "no";
}
    

    // Getters y Setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
       public String retornarAlIndex (){
        return "returnIndex" ;
    
}
}

