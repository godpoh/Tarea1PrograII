/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Data.Book;
import Data.Magazine;
import Data.Scientific_Article;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class SaveInformation {

    ArrayList<Book> Array_Books = new ArrayList();
    ArrayList<Magazine> Array_Magazine = new ArrayList();
    ArrayList<Scientific_Article> Array_Scientific_Article = new ArrayList();

    HashMap<String, String> Genres = new HashMap();

    public SaveInformation() {
        Load_Genres_By_Default();
    }
    // Metodo para cargar por default los generos junto a una descripcion utilizando un HashMap
    private void Load_Genres_By_Default() {
        Genres.put("Ficción", "Género narrativo que relata hechos imaginarios o inventados por el autor.");
        Genres.put("Ciencia Ficción", "Narraciones basadas en avances científicos o tecnológicos, a menudo situadas en el futuro o en otros mundos.");
        Genres.put("Fantasía", "Género que incluye elementos mágicos o sobrenaturales, como mundos ficticios, criaturas míticas y poderes mágicos.");
        Genres.put("Misterio", "Historias centradas en la resolución de un enigma o crimen, a menudo con detectives o personajes investigadores.");
        Genres.put("Terror", "Género diseñado para provocar miedo, terror o horror en el lector, utilizando elementos sobrenaturales o psicológicos.");
        Genres.put("Romance", "Género que se enfoca en las relaciones amorosas y emocionales entre los personajes, con énfasis en el desarrollo emocional.");
        Genres.put("Aventura", "Narraciones centradas en eventos emocionantes, viajes o desafíos enfrentados por los personajes.");
        Genres.put("Histórico", "Ficción basada en hechos históricos reales, aunque con detalles narrativos o personajes ficticios.");
        Genres.put("Biografía", "Relato de la vida de una persona real, contada en forma narrativa o expositiva.");
        Genres.put("Poesía", "Expresión literaria a través de versos, que busca transmitir emociones, sentimientos e ideas utilizando lenguaje figurado y métrica.");
    }

        // Getters y Setter de ArrayLists
    public void Add_Book(Book book) {
        Array_Books.add(book);
    }

    public ArrayList<Book> Get_Array_Books() {
        return Array_Books;
    }

    public void Add_Magazine(Magazine magazine) {
        Array_Magazine.add(magazine);
    }

    public ArrayList<Magazine> Get_Array_Magazine() {
        return Array_Magazine;
    }

    public void Add_Scientific_Article(Scientific_Article scientific_article) {
        Array_Scientific_Article.add(scientific_article);
    }

    public ArrayList<Scientific_Article> Get_Array_Scientific_Article() {
        return Array_Scientific_Article;
    }

    public HashMap<String, String> Get_HashMap_Genres() {
        return Genres;
    }

}
