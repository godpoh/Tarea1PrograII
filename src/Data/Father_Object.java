/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author user
 */
public class Father_Object {
    
    String Title;
    String Author;
    int Publication_Year;
    String Editorial;
    int Number_Pages;
    
    public Father_Object() {
        
    }

    public Father_Object(String Title, String Author, int Publication_Year, String Editorial, int Number_Pages) {
        this.Title = Title;
        this.Author = Author;
        this.Publication_Year = Publication_Year;
        this.Editorial = Editorial;
        this.Number_Pages = Number_Pages;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getPublication_Year() {
        return Publication_Year;
    }

    public void setPublication_Year(int Publication_Year) {
        this.Publication_Year = Publication_Year;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getNumber_Pages() {
        return Number_Pages;
    }

    public void setNumber_Pages(int Number_Pages) {
        this.Number_Pages = Number_Pages;
    }
    
    public void Show_Details() {
        
    }
    
//    public int Return_Cost() {
//        
//    }
    
}
