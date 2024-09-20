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
public class Magazine extends Father_Object {

    String Publication_Month;
    int Edition_Number;
    String Main_Theme;

    public Magazine() {

    }
    
// Constructor del objeto 
    public Magazine(String Publication_Month, int Edition_Number, String Main_Theme, String Title, String Author, int Publication_Year, String Editorial, int Number_Pages) {
        super(Title, Author, Publication_Year, Editorial, Number_Pages);
        this.Publication_Month = Publication_Month;
        this.Edition_Number = Edition_Number;
        this.Main_Theme = Main_Theme;
    }

    // Getter y Setter del objeto
    public String getPublication_Month() {
        return Publication_Month;
    }

    public void setPublication_Month(String Publication_Month) {
        this.Publication_Month = Publication_Month;
    }

    public int getEdition_Number() {
        return Edition_Number;
    }

    public void setEdition_Number(int Edition_Number) {
        this.Edition_Number = Edition_Number;
    }

    public String getMain_Theme() {
        return Main_Theme;
    }

    public void setMain_Theme(String Main_Theme) {
        this.Main_Theme = Main_Theme;
    }
    // Metodo que se utiliza para calcular los capitulos, divide entre 10 la cantidad de paginas 
    public void Calculate_Summary(int Number_Pages, String Title) {
       
        int totalPages = Number_Pages;


        int chapters = totalPages / 10;
        int sections = totalPages; 

        String summaryMessage = String.format("La revista '%s' tiene un total de %d páginas.\n"
                + "Esto equivale a %d capítulos y %d secciones.",
                Title, totalPages, chapters, sections);

        JOptionPane.showMessageDialog(null, summaryMessage, "Sumario de la Revista", JOptionPane.INFORMATION_MESSAGE);
    }

}
