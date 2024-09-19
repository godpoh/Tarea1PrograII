/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

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

    public Magazine(String Publication_Month, int Edition_Number, String Main_Theme, String Title, String Author, int Publication_Year, String Editorial, int Number_Pages) {
        super(Title, Author, Publication_Year, Editorial, Number_Pages);
        this.Publication_Month = Publication_Month;
        this.Edition_Number = Edition_Number;
        this.Main_Theme = Main_Theme;
    }

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
    
    
    
}
