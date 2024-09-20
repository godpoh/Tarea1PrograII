/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import javax.swing.JOptionPane;

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
    // Constructor del objeto padre
    public Father_Object(String Title, String Author, int Publication_Year, String Editorial, int Number_Pages) {
        this.Title = Title;
        this.Author = Author;
        this.Publication_Year = Publication_Year;
        this.Editorial = Editorial;
        this.Number_Pages = Number_Pages;
    }
    
    // Getters y Setters del objeto padre
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
    
    // Metodo para mostrar un joptionpane con la informacion heredada(Default de todas los objetos)
    public void Show_Details(String Title, String Author, int Publication_Year, String Editorial, int Number_Pages) {
        JOptionPane.showMessageDialog(null, "Titulo de la publicacion es: " + Title + " Autor es: " + Author + " Año de publicacion es: " + Publication_Year + " Editorial es: " + Editorial + " Numero de paginas es: " + Number_Pages, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    // Devuelve el costo de cada hoja
    public int Return_Cost(int QuantitySheets) {
        return QuantitySheets * 116;
    }
    
    
}
