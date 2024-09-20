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
public class Scientific_Article extends Father_Object {

    String ORCID;
    String Academic_Journal;

    public Scientific_Article() {

    }

    // Constructor del objeto
    public Scientific_Article(String ORCID, String Academic_Journal, String Title, String Author, int Publication_Year, String Editorial, int Number_Pages) {
        super(Title, Author, Publication_Year, Editorial, Number_Pages);
        this.ORCID = ORCID;
        this.Academic_Journal = Academic_Journal;
    }

    // Getter y Setter del objeto
    public String getORCID() {
        return ORCID;
    }

    public void setORCID(String ORCID) {
        this.ORCID = ORCID;
    }

    public String getAcademic_Journal() {
        return Academic_Journal;
    }

    public void setAcademic_Journal(String Academic_Journal) {
        this.Academic_Journal = Academic_Journal;
    }
    
    // Metodo que se utiliza para crear la cita bibliografica
    public void Citar(String author, int Publication_Year, String Title, String Academic_Journal, String ORCID) {
        String citation = String.format("%s. (%d). %s. %s. %s.",
                author,
                Publication_Year,
                Title,
                Academic_Journal,
                ORCID);

        JOptionPane.showMessageDialog(null, citation, "Cita Bibliográfica", JOptionPane.INFORMATION_MESSAGE);
    }

}
