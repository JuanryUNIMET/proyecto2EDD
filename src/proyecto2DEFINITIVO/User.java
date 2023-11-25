/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2DEFINITIVO;

import java.util.Arrays;

/**
 *
 * @author angui, juanry
 */
public class User {
    public String username;
    public String priority;
    public Document[] documents;
    
    /**
     * 
     * @param u
     * @param p 
     */
    public User(String u, String p){
        this.username = u;
        this.priority = p;
        this.documents = new Document[10];
       
        
    }
    
    /**
     * 
     * @param titl
     * @param sec
     * @param typ
     * @param tim 
     */
    public void addDocument(String titl, int sec, String typ, int tim){
        boolean found = false;
        for (int i = 0; i < this.documents.length; i++) {
            if(this.documents[i] == null || this.documents[i].title.equals("")){
                this.documents[i] =  new Document(titl,sec,typ,tim);
                found = true;
                break;
            }
                
        }
        if(!found){
            Document[] more_documents = new Document[this.documents.length+1];
            Arrays.fill(more_documents, new Document("", 0, "",0));
            for(int i = 0; i < this.documents.length; i++) {
                more_documents[i] = this.documents[i];
            }
            more_documents[this.documents.length] = new Document(titl,sec,typ,tim);
            this.documents = more_documents;
        }
    }
    
    /**
     * 
     * @param doc
     * @param printer 
     */
    public void sendToPrinter(Document doc, BinaryHeap printer){
        printer.insert(doc.title, doc.size, doc.type, doc.time);
    }
    
    /**
     * 
     * @return 
     */
    public String printDocs(){
        String docs = "";
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] != null && !documents[i].title.equals("")) {
                String send = "";
                if(documents[i].inHeap){
                    send = "Enviado a impresion";
                }
                docs += "       " + documents[i].title + " "+documents[i].type + ": " + send + "\n";
            }
        }
        return docs;
    }
    

}
