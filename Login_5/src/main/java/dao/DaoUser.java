/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class DaoUser {
    
    public List<User> findAllUser(){
        
        List<User> users = new ArrayList<User>();
        
        User u = new User();
        u.setUser("pepe");
        u.setPass("pepe01");
        users.add(u);
        
        u= new User();
        u.setUser("pablo");
        u.setPass("pablo01");
        users.add(u);
        
        
        u= new User();
        u.setUser("luis");
        u.setPass("luis01");
        users.add(u);
        
        return users;
        
    }
    

    
}

