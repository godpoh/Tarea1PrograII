/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import Data.Book;
import Data.Father_Object;
import Data.Magazine;
import Data.Scientific_Article;
import Logic.SaveInformation;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Principal extends javax.swing.JFrame {

//    ArrayList<> Array_Publications = new ArrayList();
    public Principal() {
        initComponents();
        Hide_Items_Defualt();
        setupRdEventListeners();
        Load_Genres_Cmb();
    }

    // Creacion de instacia para utilizar los getter y setter de los ArrayList de la clase SaveInformation
    private SaveInformation save_info = new SaveInformation();

    // Metodo para ocultar por defecto paneles
    private void Hide_Items_Defualt() {
        P_Show_Information.setVisible(false);
        P_3_Rd.setVisible(false);

        P_Book.setVisible(false);
        P_Magazine.setVisible(false);
        P_Scientific_Article.setVisible(false);

        Btn_Save.setVisible(false);
        P_Basic_Information.setVisible(false);

    }
    
// Metodo que oculta 1 seccion del programa(Publicacion, Mostracion de informacion de publicacion)
    private void Select_Save_Show() {
        if (Rd_Show.isSelected()) {
            P_Show_Information.setVisible(true);
            P_3_Rd.setVisible(true);
            Btn_Save.setVisible(false);
            Cmb_Genre.setVisible(false);
            Txt_Gender.setVisible(true);
        } else {
            Clean_Txt_Data();
            Cmb_Genre.setVisible(true);
            Txt_Gender.setVisible(false);
            P_Show_Information.setVisible(false);
            P_3_Rd.setVisible(true);
            Btn_Save.setVisible(true);
        }
    }
    
// Metodo que muestra su respectivo panel para la publicacion de un articulo
    private void Select_Book_Magazine_Sciencific() {
        if (Rd_Book.isSelected()) {
            P_Book.setVisible(true);
            P_Magazine.setVisible(false);
            P_Scientific_Article.setVisible(false);
            P_Basic_Information.setVisible(true);
            Clean_Txt_Data();
        }
        if (Rd_Magazine.isSelected()) {
            P_Book.setVisible(false);
            P_Magazine.setVisible(true);
            P_Scientific_Article.setVisible(false);
            P_Basic_Information.setVisible(true);
            Clean_Txt_Data();
        }
        if (Rd_Scientific.isSelected()) {
            Clean_Txt_Data();
            P_Book.setVisible(false);
            P_Magazine.setVisible(false);
            P_Scientific_Article.setVisible(true);
            P_Basic_Information.setVisible(true);
        }
    }

// Se crea un metodo que contiene Action Listeners, para actualizar a tiempo real lo que hacen los radio buttons
    private void setupRdEventListeners() {

        Rd_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Save_Show();
            }
        });

        Rd_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Save_Show();
            }
        });

        Rd_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Book_Magazine_Sciencific();
                Load_Publications_Cmb();
            }
        });

        Rd_Magazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Book_Magazine_Sciencific();
                Load_Publications_Cmb();
            }
        });

        Rd_Scientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Book_Magazine_Sciencific();
                Load_Publications_Cmb();
            }
        });
    }

    // Carga los generos al combobox utilizando el arraylist de la clase SaveInformation
    private void Load_Genres_Cmb() {
        HashMap<String, String> Genres = save_info.Get_HashMap_Genres();
        for (String genre : Genres.keySet()) {
            Cmb_Genre.addItem(genre);
        }
    }

    // Metodo que carga los nombres de las publicaciones en un combobox
    private void Load_Publications_Cmb() {
        Cmb_Book.removeAllItems();
        Cmb_Book.addItem("Seleccione una opción:");

        if (Rd_Book.isSelected()) {

            ArrayList<Book> Books = save_info.Get_Array_Books();
            for (Book book : Books) {
                Cmb_Book.addItem(book.getTitle());
            }
        }
        if (Rd_Magazine.isSelected()) {

            ArrayList<Magazine> Magazines = save_info.Get_Array_Magazine();
            for (Magazine magazine : Magazines) {
                Cmb_Book.addItem(magazine.getTitle());
            }
        }
        if (Rd_Scientific.isSelected()) {

            ArrayList<Scientific_Article> scientifics = save_info.Get_Array_Scientific_Article();
            for (Scientific_Article scientific : scientifics) {
                Cmb_Book.addItem(scientific.getTitle());
            }
        }
    }
    
// Metodo utilizado para obtener toda la informacion de una publicacion y mostrarla en pantalla
    private void getPublicationInformationAndSet() {
        ArrayList<Book> Books = save_info.Get_Array_Books();

        String Title = (String) Cmb_Book.getSelectedItem();
        if (Rd_Show.isSelected()) {

            for (Book book : Books) {
                if (book.getTitle().contains(Title)) {
                    String Author = book.getAuthor();
                    int Publication_Year = book.getPublication_Year();
                    String Editorial = book.getEditorial();
                    int Number_Pages = book.getNumber_Pages();
                    String ISBN_Book = book.getISBN();
                    String Genre = book.getGenre();

                    Txt_Title.setText(Title);
                    Txt_Author.setText(Author);
                    Txt_Publication_Year.setText(String.valueOf(Publication_Year));
                    Txt_Editorial.setText(Editorial);
                    Txt_Number_Pages.setText(String.valueOf(Number_Pages));
                    Txt_ISBN_Book.setText(ISBN_Book);
                    Txt_Gender.setText(Genre);

                }
            }
            ArrayList<Magazine> Magazines = save_info.Get_Array_Magazine();
            for (Magazine magazine : Magazines) {
                if (magazine.getTitle().contains(Title)) {
                    String Author = magazine.getAuthor();
                    int Publication_Year = magazine.getPublication_Year();
                    String Editorial = magazine.getEditorial();
                    int Number_Pages = magazine.getNumber_Pages();
                    String Publication_Month = magazine.getPublication_Month();
                    int Edition_Number = magazine.getEdition_Number();
                    String Main_Theme = magazine.getMain_Theme();

                    Txt_Title.setText(Title);
                    Txt_Author.setText(Author);
                    Txt_Publication_Year.setText(String.valueOf(Publication_Year));
                    Txt_Editorial.setText(Editorial);
                    Txt_Number_Pages.setText(String.valueOf(Number_Pages));
                    Txt_Publication_Month_Magazine.setText(Publication_Month);
                    Txt_Edition_Number_Magazine.setText(String.valueOf(Edition_Number));
                    Txt_Main_Theme_Magazine.setText(Main_Theme);

                }
            }
            ArrayList<Scientific_Article> scientifics_article = save_info.Get_Array_Scientific_Article();
            for (Scientific_Article scientific_article : scientifics_article) {
                if (scientific_article.getTitle().contains(Title)) {
                    String Author = scientific_article.getAuthor();
                    int Publication_Year = scientific_article.getPublication_Year();
                    String Editorial = scientific_article.getEditorial();
                    int Number_Pages = scientific_article.getNumber_Pages();
                    String ORCID_Scientific = scientific_article.getORCID();
                    String Academic_Journal = scientific_article.getAcademic_Journal();

                    Txt_Title.setText(Title);
                    Txt_Author.setText(Author);
                    Txt_Publication_Year.setText(String.valueOf(Publication_Year));
                    Txt_Editorial.setText(Editorial);
                    Txt_Number_Pages.setText(String.valueOf(Number_Pages));
                    Txt_Academic_Journal.setText(ORCID_Scientific);
                    Txt_ORCID_Scientific.setText(String.valueOf(Academic_Journal));
                }
            }
        }
    }

    // Metodo que se utiliza en otros metodos para que limpie los TextFields
    private void Clean_Txt_Data() {
        Txt_Title.setText("");
        Txt_Author.setText("");
        Txt_Publication_Year.setText("");
        Txt_Editorial.setText("");
        Txt_Number_Pages.setText("");
        Txt_ISBN_Book.setText("");
        Txt_Publication_Month_Magazine.setText("");
        Txt_Edition_Number_Magazine.setText("");
        Txt_Main_Theme_Magazine.setText("");
        Txt_ORCID_Scientific.setText("");
        Txt_Academic_Journal.setText("");
        Txt_Gender.setText("");
    }
    
// Obtiene la informacion de la publicacion y la guarda en el respectivo ArrayList
    private void Obtain_Data_And_Save() {
        String Title = Txt_Title.getText();
        String Author = Txt_Author.getText();
        int Year_Publication = Integer.parseInt(Txt_Publication_Year.getText());
        String Editorial = Txt_Editorial.getText();
        int Pages_Number = Integer.parseInt(Txt_Number_Pages.getText());
        if (Rd_Book.isSelected()) {

            String ISBN = Txt_ISBN_Book.getText();
            String Genre = (String) Cmb_Genre.getSelectedItem();

            Book book = new Book(ISBN, Genre, Title, Author, Year_Publication, Editorial, Pages_Number);
            save_info.Add_Book(book);

            Load_Publications_Cmb();
            Show_Information(Title, Author, Year_Publication, Editorial, Pages_Number, Genre, null);
            Clean_Txt_Data();
        }
        if (Rd_Magazine.isSelected()) {

            String Month_Publication = Txt_Publication_Month_Magazine.getText();
            int Edition_Number = Integer.parseInt(Txt_Edition_Number_Magazine.getText());
            String Main_Theme = Txt_Main_Theme_Magazine.getText();

            Magazine magazine = new Magazine(Month_Publication, Edition_Number, Main_Theme, Title, Author, Year_Publication, Editorial, Pages_Number);
            save_info.Add_Magazine(magazine);

            Show_Information(Title, Author, Year_Publication, Editorial, Pages_Number, null, null);
            Load_Publications_Cmb();
            Clean_Txt_Data();
        }
        if (Rd_Scientific.isSelected()) {

            String ORCID = Txt_ORCID_Scientific.getText();
            String Academic_Journal = Txt_Academic_Journal.getText();

            Scientific_Article scientific_article = new Scientific_Article(ORCID, Academic_Journal, Title, Author, Year_Publication, Editorial, Pages_Number);
            save_info.Add_Scientific_Article(scientific_article);

            Show_Information(Title, Author, Year_Publication, Editorial, Pages_Number, null, ORCID);
            Load_Publications_Cmb();
            Clean_Txt_Data();
        }
    }

    // Metodo que se utiliza para mostrar la informacion basica en joptionpanels
    private void Show_Information(String Title, String Author, int Publication_Year, String Editorial, int Number_Pages, String Genre, String ORCID) {

        Father_Object father = new Father_Object();
        father.Show_Details(Title, Author, Publication_Year, Editorial, Number_Pages);

        int cost = father.Return_Cost(Number_Pages);
        JOptionPane.showMessageDialog(null, "El costo del libro seria de: " + cost + " colones debido a que cada pagina tiene un precio de 116 colones.");

        if (Rd_Book.isSelected()) {
            Clean_Txt_Data();
            Book book = new Book();
            book.Describe_Genre(Genre);
        }
        if (Rd_Magazine.isSelected()) {
            Clean_Txt_Data();
            Magazine magazine = new Magazine();
            magazine.Calculate_Summary(Number_Pages, Title);
        }

        if (Rd_Scientific.isSelected()) {
            Clean_Txt_Data();
            Scientific_Article scientific = new Scientific_Article();
            scientific.Citar(Author, Publication_Year, Title, Editorial, ORCID);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnG_WTD = new javax.swing.ButtonGroup();
        BtnG_BFMC = new javax.swing.ButtonGroup();
        P_Main = new javax.swing.JPanel();
        Rd_Save = new javax.swing.JRadioButton();
        Rd_Show = new javax.swing.JRadioButton();
        P_Show_Information = new javax.swing.JPanel();
        Cmb_Book = new javax.swing.JComboBox<>();
        Btn_ShowInf = new javax.swing.JButton();
        P_3_Rd = new javax.swing.JPanel();
        Rd_Book = new javax.swing.JRadioButton();
        Rd_Magazine = new javax.swing.JRadioButton();
        Rd_Scientific = new javax.swing.JRadioButton();
        P_Book = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Txt_ISBN_Book = new javax.swing.JTextField();
        Cmb_Genre = new javax.swing.JComboBox<>();
        Txt_Gender = new javax.swing.JTextField();
        P_Magazine = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Txt_Main_Theme_Magazine = new javax.swing.JTextField();
        Txt_Edition_Number_Magazine = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Txt_Publication_Month_Magazine = new javax.swing.JTextField();
        P_Scientific_Article = new javax.swing.JPanel();
        Txt_Academic_Journal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Txt_ORCID_Scientific = new javax.swing.JTextField();
        Btn_Save = new javax.swing.JButton();
        P_Basic_Information = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Txt_Title = new javax.swing.JTextField();
        Txt_Author = new javax.swing.JTextField();
        Txt_Publication_Year = new javax.swing.JTextField();
        Txt_Editorial = new javax.swing.JTextField();
        Txt_Number_Pages = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_Main.setOpaque(false);

        BtnG_WTD.add(Rd_Save);
        Rd_Save.setText("Guardar ");

        BtnG_WTD.add(Rd_Show);
        Rd_Show.setText("Mostrar Informacion");

        javax.swing.GroupLayout P_MainLayout = new javax.swing.GroupLayout(P_Main);
        P_Main.setLayout(P_MainLayout);
        P_MainLayout.setHorizontalGroup(
            P_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rd_Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rd_Show)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        P_MainLayout.setVerticalGroup(
            P_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rd_Show)
                    .addComponent(Rd_Save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(P_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 220, 30));

        P_Show_Information.setOpaque(false);

        Cmb_Book.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción:" }));

        Btn_ShowInf.setText("Mostrar informacion ");
        Btn_ShowInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ShowInfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_Show_InformationLayout = new javax.swing.GroupLayout(P_Show_Information);
        P_Show_Information.setLayout(P_Show_InformationLayout);
        P_Show_InformationLayout.setHorizontalGroup(
            P_Show_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Show_InformationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cmb_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(P_Show_InformationLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Btn_ShowInf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P_Show_InformationLayout.setVerticalGroup(
            P_Show_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Show_InformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cmb_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Btn_ShowInf)
                .addGap(20, 20, 20))
        );

        getContentPane().add(P_Show_Information, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 200, 110));

        P_3_Rd.setOpaque(false);

        BtnG_BFMC.add(Rd_Book);
        Rd_Book.setText("Libro");

        BtnG_BFMC.add(Rd_Magazine);
        Rd_Magazine.setText("Revista");

        BtnG_BFMC.add(Rd_Scientific);
        Rd_Scientific.setText("Articulo Cientifico");

        javax.swing.GroupLayout P_3_RdLayout = new javax.swing.GroupLayout(P_3_Rd);
        P_3_Rd.setLayout(P_3_RdLayout);
        P_3_RdLayout.setHorizontalGroup(
            P_3_RdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_3_RdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rd_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rd_Magazine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rd_Scientific)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        P_3_RdLayout.setVerticalGroup(
            P_3_RdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_3_RdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_3_RdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rd_Book)
                    .addComponent(Rd_Magazine)
                    .addComponent(Rd_Scientific))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(P_3_Rd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 260, 30));

        P_Book.setOpaque(false);

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ISBN:");

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Género:");

        Txt_ISBN_Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Cmb_Genre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout P_BookLayout = new javax.swing.GroupLayout(P_Book);
        P_Book.setLayout(P_BookLayout);
        P_BookLayout.setHorizontalGroup(
            P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_BookLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_ISBN_Book))
                    .addGroup(P_BookLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Gender)
                            .addComponent(Cmb_Genre, 0, 239, Short.MAX_VALUE))))
                .addContainerGap())
        );
        P_BookLayout.setVerticalGroup(
            P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Txt_ISBN_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Cmb_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(P_Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 330, 90));

        P_Magazine.setOpaque(false);

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Tema Principal:");

        Txt_Main_Theme_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Edition_Number_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Número de Edición:");

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Mes de Publicación:");

        Txt_Publication_Month_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout P_MagazineLayout = new javax.swing.GroupLayout(P_Magazine);
        P_Magazine.setLayout(P_MagazineLayout);
        P_MagazineLayout.setHorizontalGroup(
            P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MagazineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_MagazineLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Publication_Month_Magazine))
                    .addGroup(P_MagazineLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Edition_Number_Magazine))
                    .addGroup(P_MagazineLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Main_Theme_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P_MagazineLayout.setVerticalGroup(
            P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MagazineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Publication_Month_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Edition_Number_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Main_Theme_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(P_Magazine, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 100));

        P_Scientific_Article.setOpaque(false);

        Txt_Academic_Journal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Revista Académica:");

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("ORCID:");

        Txt_ORCID_Scientific.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout P_Scientific_ArticleLayout = new javax.swing.GroupLayout(P_Scientific_Article);
        P_Scientific_Article.setLayout(P_Scientific_ArticleLayout);
        P_Scientific_ArticleLayout.setHorizontalGroup(
            P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(13, 13, 13)
                        .addComponent(Txt_ORCID_Scientific))
                    .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Academic_Journal, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_Scientific_ArticleLayout.setVerticalGroup(
            P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_ORCID_Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Academic_Journal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(P_Scientific_Article, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        Btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gtk-save.png"))); // NOI18N
        Btn_Save.setText("GUARDAR");
        Btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, -1));

        P_Basic_Information.setOpaque(false);

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Titulo:");

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Autor:");

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Año de Publicación:");

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Editorial:");

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Número de paginas:");

        Txt_Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Author.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Publication_Year.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Editorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Number_Pages.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout P_Basic_InformationLayout = new javax.swing.GroupLayout(P_Basic_Information);
        P_Basic_Information.setLayout(P_Basic_InformationLayout);
        P_Basic_InformationLayout.setHorizontalGroup(
            P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Basic_InformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_Basic_InformationLayout.createSequentialGroup()
                        .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Title)
                            .addComponent(Txt_Author)))
                    .addGroup(P_Basic_InformationLayout.createSequentialGroup()
                        .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(P_Basic_InformationLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Publication_Year))
                            .addGroup(P_Basic_InformationLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Editorial))
                            .addGroup(P_Basic_InformationLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Number_Pages, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_Basic_InformationLayout.setVerticalGroup(
            P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Basic_InformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(Txt_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Txt_Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Publication_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Basic_InformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Number_Pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(P_Basic_Information, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bvfdgd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Evento en el boton guardar que utiliza el metodo Obtain_Data_And_Save
    private void Btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SaveActionPerformed
        Obtain_Data_And_Save();
    }//GEN-LAST:event_Btn_SaveActionPerformed
// Evento en el boton de mostrar informacion que utiliza el metodo getPublicationInformationAndSet
    private void Btn_ShowInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ShowInfActionPerformed
        getPublicationInformationAndSet();
    }//GEN-LAST:event_Btn_ShowInfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnG_BFMC;
    private javax.swing.ButtonGroup BtnG_WTD;
    private javax.swing.JButton Btn_Save;
    private javax.swing.JButton Btn_ShowInf;
    private javax.swing.JComboBox<String> Cmb_Book;
    private javax.swing.JComboBox<String> Cmb_Genre;
    private javax.swing.JPanel P_3_Rd;
    private javax.swing.JPanel P_Basic_Information;
    private javax.swing.JPanel P_Book;
    private javax.swing.JPanel P_Magazine;
    private javax.swing.JPanel P_Main;
    private javax.swing.JPanel P_Scientific_Article;
    private javax.swing.JPanel P_Show_Information;
    private javax.swing.JRadioButton Rd_Book;
    private javax.swing.JRadioButton Rd_Magazine;
    private javax.swing.JRadioButton Rd_Save;
    private javax.swing.JRadioButton Rd_Scientific;
    private javax.swing.JRadioButton Rd_Show;
    private javax.swing.JTextField Txt_Academic_Journal;
    private javax.swing.JTextField Txt_Author;
    private javax.swing.JTextField Txt_Edition_Number_Magazine;
    private javax.swing.JTextField Txt_Editorial;
    private javax.swing.JTextField Txt_Gender;
    private javax.swing.JTextField Txt_ISBN_Book;
    private javax.swing.JTextField Txt_Main_Theme_Magazine;
    private javax.swing.JTextField Txt_Number_Pages;
    private javax.swing.JTextField Txt_ORCID_Scientific;
    private javax.swing.JTextField Txt_Publication_Month_Magazine;
    private javax.swing.JTextField Txt_Publication_Year;
    private javax.swing.JTextField Txt_Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    // End of variables declaration//GEN-END:variables
}
