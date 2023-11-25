/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2DEFINITIVO;

/**
 *
 * @author angui, juanry
 */
public class Document {
    public String title;
    public int size;
    public String type;
    public int time;
    public boolean inHeap;
    
    /**
     * 
     * @param titl
     * @param sec
     * @param typ
     * @param tim 
     */
    public Document(String titl, int sec, String typ, int tim){
        this.title = titl;
        this.size = sec;
        this.type = typ;
        this.time = tim;
        this.inHeap = false;
    }
    
    
}
