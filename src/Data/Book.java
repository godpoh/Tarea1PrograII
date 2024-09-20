/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author user
 */
public class Book extends Father_Object {

    String ISBN;
    String Genre;

    public Book() {

    }
// Constructor del objeto
    public Book(String ISBN, String Genre, String Title, String Author, int Publication_Year, String Editorial, int Number_Pages) {
        super(Title, Author, Publication_Year, Editorial, Number_Pages);
        this.ISBN = ISBN;
        this.Genre = Genre;
    }
// Getter y Setter
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

}
