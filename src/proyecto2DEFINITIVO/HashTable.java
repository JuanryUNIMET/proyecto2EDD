/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2DEFINITIVO;

import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author angui, juanry
 */
public class HashTable {
    public User[] users;
    public int size;
    public int usersRegistered;
    
    
    /**
     * 
     * Constructor
     */
    public HashTable(){
        this.users = new User[500];
        this.size = 500;
        usersRegistered = 0;
        Arrays.fill(this.users, new User("", ""));
    }
    

    /**
     * 
     * @param username
     * @param priority 
     */
    public void insertUser(String username, String priority){
        User user = new User(username, priority);
        int index = hashFunction(username);
        if(this.users[index].username.equals("")){
            this.users[index] = user;
            usersRegistered++;
        }else{
            if (usersRegistered == size){
                System.out.println("El registro de usuarios se encuentra lleno");
            }else{
            while(index < size && !this.users[index].username.equals("")){
                index++;
                if (index == size){
                    index = 0;
                }
            }
            this.users[index] = user;
            usersRegistered++;
            }
        }
    }
    
    /**
     * 
     * @param username
     * @return 
     */
    public int hashFunction(String username){
        int n = 7;
        int index = 0;
        for (int i = 0; i < username.length(); i++) {      
            index = n*index + username.charAt(i); 
            if (index< 0){
                index*=-1;
            }
        }
        index = index%499;
        return index;
    }
    
    /**
     * 
     * @param username 
     */
    public void deleteUser(String username){
        int hash = hashFunction(username);
        if(this.users[hash].username.equals(username)){
            this.users[hash] = new User("", "");
        }else{
            while(hash < size && !this.users[hash].username.equals(username)){
            hash++;
            if (hash == size){
                    hash = 0;
                }
            }
            this.users[hash] = new User("", "");
        }
        

    }
    
    /**
     * 
     * @param username
     * @return 
     * Busca al usuario
     */
    public User searchUser(String username){
        int hash = hashFunction(username);
        if(this.users[hash].username.equals(username)){
            return this.users[hash];
        }else{
            
        } 
        int cont = 0;
        while(cont < usersRegistered && hash < size && !this.users[hash].username.equals(username)){
            hash++;
            if (hash == size){
                    hash = 0;
                }
            cont ++;
            }
        if(this.users[hash].username.equals(username)){
            return this.users[hash];}
        else{
            System.out.println("No encontrado");
            return null;
        }
    
    }

    /**
     * 
     * @param username
     * @param title
     * @return
     * Borra un documento
     */
    public boolean deleteDocument(String username, String title){
        User user = searchUser(username);
        for (int i = 0; i < user.documents.length; i++) {
            if (user.documents[i] != null && user.documents[i].title.equals(title)) {
                user.documents[i] = new Document("", 0, "",0);
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * @param username
     * @param title
     * @return 
     * Busca un documento
     */
    public Document searchDocument(String username, String title){
        User user = searchUser(username);
        if (user!= null){
            for (int i = 0; i < user.documents.length; i++) {
                if (user.documents[i] != null && user.documents[i].title.equals(title)) {
                    return user.documents[i];
            }
        }}
        return null;
    }
    
    /**
     * 
     * @param print
     * @return 
     * Imprime usuarios con su prioridad
     */
    public String printUsers(String print){
        for (int i = 0; i < size; i++) {
            if(!users[i].username.equals("")){
                print+= users[i].username + " ---> " + users[i].priority + "\n";
                print += users[i].printDocs();
            }
        }
        return print;
    }
}

