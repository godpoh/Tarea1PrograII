/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

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
    }

    private void Hide_Items_Defualt() {
        P_Show_Information.setVisible(false);
        P_3_Rd.setVisible(false);

        P_Book.setVisible(false);
        P_Magazine.setVisible(false);
        P_Scientific_Article.setVisible(false);

        Btn_Save.setVisible(false);

    }

    private void Select_Save_Show() {
        if (Rd_Show.isSelected()) {
            P_Show_Information.setVisible(true);
            P_3_Rd.setVisible(true);
            Btn_Save.setVisible(false);
        } else {
            P_Show_Information.setVisible(false);
            P_3_Rd.setVisible(true);
            Btn_Save.setVisible(true);
        }
    }

    private void Select_Book_Magazine_Sciencific() {
        if (Rd_Book.isSelected()) {
            P_Book.setVisible(true);
            P_Magazine.setVisible(false);
            P_Scientific_Article.setVisible(false);

        }
        if (Rd_Magazine.isSelected()) {
            P_Book.setVisible(false);
            P_Magazine.setVisible(true);
            P_Scientific_Article.setVisible(false);
        }
        if (Rd_Scientific.isSelected()) {
            P_Book.setVisible(false);
            P_Magazine.setVisible(false);
            P_Scientific_Article.setVisible(true);
        }
    }

// Se crea un metodo que contienen Action Listeners, para actualizar a tiempo real lo que hacen los radio buttons
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
            }
        });

        Rd_Magazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Book_Magazine_Sciencific();
            }
        });

        Rd_Scientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Book_Magazine_Sciencific();
            }
        });
    }

    private void Obtain_Data_And_Save() {
        if (Rd_Book.isSelected()) {
            String Title = Txt_Title_Book.getText();
            String Author = Txt_Autor_Book.getText();
            int Year_Publication = Integer.parseInt(Txt_Publication_Year_Book.getText());
            String Editorial = Txt_Editorial_Book.getText();
            int Pages_Number = Integer.parseInt(Txt_Number_Pages_Book.getText());
            String ISBN = Txt_ISBN_Book.getText();
            String Genre = (String) Cmb_Book.getSelectedItem();
            
            
            
            
        }
        if (Rd_Magazine.isSelected()) {
            String Title = Txt_Title_Magazine.getText();
            String Author = Txt_Author_Magazine.getText();
            int Year_Publication = Integer.parseInt(Txt_Publication_Year_Magazine.getText());
            String Editorial = Txt_Editorial_Magazine.getText();
            int Pages_Number = Integer.parseInt(Txt_Number_Pages_Magazine.getText());
            String Month_Publication = Txt_Publication_Month_Magazine.getText();
            int Edition_Number = Integer.parseInt(Txt_Edition_Number_Magazine.getText());
            String Main_Theme = Txt_Main_Theme_Magazine.getText();
            
            
            
            
        }
        if (Rd_Scientific.isSelected()) {
            String Title = Txt_Title_Scientific.getText() + "(Artículo Científico)";
            String Author = Txt_Author_Scientific.getText();
            int Year_Publication = Integer.parseInt(Txt_Publication_Year_Scientific.getText());
            String Editorial = Txt_Editorial_Scientific.getText();
            int Pages_Number = Integer.parseInt(Txt_Number_Pages_Scientific.getText());
            String ORCID = Txt_ORCID_Scientific.getText();
            String Academic_Journal = Txt_Academic_Journal.getText();
            
            
            
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Title_Book = new javax.swing.JTextField();
        Txt_Autor_Book = new javax.swing.JTextField();
        Txt_Publication_Year_Book = new javax.swing.JTextField();
        Txt_Editorial_Book = new javax.swing.JTextField();
        Txt_Number_Pages_Book = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Txt_ISBN_Book = new javax.swing.JTextField();
        Cmb_Genre = new javax.swing.JComboBox<>();
        P_Magazine = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Txt_Title_Magazine = new javax.swing.JTextField();
        Txt_Author_Magazine = new javax.swing.JTextField();
        Txt_Publication_Year_Magazine = new javax.swing.JTextField();
        Txt_Editorial_Magazine = new javax.swing.JTextField();
        Txt_Number_Pages_Magazine = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Txt_Main_Theme_Magazine = new javax.swing.JTextField();
        Txt_Edition_Number_Magazine = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Txt_Publication_Month_Magazine = new javax.swing.JTextField();
        P_Scientific_Article = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Txt_Title_Scientific = new javax.swing.JTextField();
        Txt_Author_Scientific = new javax.swing.JTextField();
        Txt_Publication_Year_Scientific = new javax.swing.JTextField();
        Txt_Editorial_Scientific = new javax.swing.JTextField();
        Txt_Number_Pages_Scientific = new javax.swing.JTextField();
        Txt_Academic_Journal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Txt_ORCID_Scientific = new javax.swing.JTextField();
        Btn_Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnG_WTD.add(Rd_Save);
        Rd_Save.setText("Guardar ");

        BtnG_WTD.add(Rd_Show);
        Rd_Show.setText("Mostrar Informacion");

        javax.swing.GroupLayout P_MainLayout = new javax.swing.GroupLayout(P_Main);
        P_Main.setLayout(P_MainLayout);
        P_MainLayout.setHorizontalGroup(
            P_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MainLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(Rd_Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rd_Show)
                .addContainerGap(328, Short.MAX_VALUE))
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

        getContentPane().add(P_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 880, 30));

        Cmb_Book.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción:" }));

        Btn_ShowInf.setText("Mostrar informacion ");

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

        getContentPane().add(P_Show_Information, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 200, 110));

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
                .addContainerGap(13, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Titulo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Autor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Año de Publicación:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Editorial:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Número de paginas:");

        Txt_Title_Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Autor_Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Publication_Year_Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Editorial_Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Number_Pages_Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("ISBN:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Género:");

        javax.swing.GroupLayout P_BookLayout = new javax.swing.GroupLayout(P_Book);
        P_Book.setLayout(P_BookLayout);
        P_BookLayout.setHorizontalGroup(
            P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_BookLayout.createSequentialGroup()
                        .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Title_Book)
                            .addComponent(Txt_Autor_Book)))
                    .addGroup(P_BookLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_ISBN_Book))
                    .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(P_BookLayout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Cmb_Genre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(P_BookLayout.createSequentialGroup()
                            .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(P_BookLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_Publication_Year_Book))
                                .addGroup(P_BookLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_Editorial_Book))
                                .addGroup(P_BookLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_Number_Pages_Book, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        P_BookLayout.setVerticalGroup(
            P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Txt_Title_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Autor_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Publication_Year_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Editorial_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Number_Pages_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Txt_ISBN_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(P_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Cmb_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(P_Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 330, 230));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Titulo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Autor:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Año de Publicación:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Editorial:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Número de paginas:");

        Txt_Title_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Author_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Publication_Year_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Editorial_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Number_Pages_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Tema Principal:");

        Txt_Main_Theme_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Edition_Number_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Número de Edición:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Mes de Publicación:");

        Txt_Publication_Month_Magazine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout P_MagazineLayout = new javax.swing.GroupLayout(P_Magazine);
        P_Magazine.setLayout(P_MagazineLayout);
        P_MagazineLayout.setHorizontalGroup(
            P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MagazineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(P_MagazineLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_Publication_Year_Magazine))
                        .addGroup(P_MagazineLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_Editorial_Magazine))
                        .addGroup(P_MagazineLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_Number_Pages_Magazine, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                    .addGroup(P_MagazineLayout.createSequentialGroup()
                        .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Title_Magazine)
                            .addComponent(Txt_Author_Magazine)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_MagazineLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                                .addComponent(Txt_Main_Theme_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        P_MagazineLayout.setVerticalGroup(
            P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MagazineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Title_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Txt_Author_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Publication_Year_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Editorial_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Number_Pages_Magazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        getContentPane().add(P_Magazine, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Titulo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Autor:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Año de Publicación:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Editorial:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Número de paginas:");

        Txt_Title_Scientific.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Author_Scientific.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Publication_Year_Scientific.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Editorial_Scientific.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Number_Pages_Scientific.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Txt_Academic_Journal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Revista Académica:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                        .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Title_Scientific)
                            .addComponent(Txt_Author_Scientific)))
                    .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(13, 13, 13)
                        .addComponent(Txt_ORCID_Scientific))
                    .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                            .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_Publication_Year_Scientific))
                                .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_Editorial_Scientific))
                                .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_Number_Pages_Scientific, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_Academic_Journal))))
                .addContainerGap())
        );
        P_Scientific_ArticleLayout.setVerticalGroup(
            P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Scientific_ArticleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(Txt_Title_Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Txt_Author_Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Publication_Year_Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Editorial_Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Number_Pages_Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_ORCID_Scientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_Scientific_ArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Academic_Journal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(P_Scientific_Article, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        Btn_Save.setText("GUARDAR");
        Btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SaveActionPerformed
        Obtain_Data_And_Save();
    }//GEN-LAST:event_Btn_SaveActionPerformed

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
    private javax.swing.JTextField Txt_Author_Magazine;
    private javax.swing.JTextField Txt_Author_Scientific;
    private javax.swing.JTextField Txt_Autor_Book;
    private javax.swing.JTextField Txt_Edition_Number_Magazine;
    private javax.swing.JTextField Txt_Editorial_Book;
    private javax.swing.JTextField Txt_Editorial_Magazine;
    private javax.swing.JTextField Txt_Editorial_Scientific;
    private javax.swing.JTextField Txt_ISBN_Book;
    private javax.swing.JTextField Txt_Main_Theme_Magazine;
    private javax.swing.JTextField Txt_Number_Pages_Book;
    private javax.swing.JTextField Txt_Number_Pages_Magazine;
    private javax.swing.JTextField Txt_Number_Pages_Scientific;
    private javax.swing.JTextField Txt_ORCID_Scientific;
    private javax.swing.JTextField Txt_Publication_Month_Magazine;
    private javax.swing.JTextField Txt_Publication_Year_Book;
    private javax.swing.JTextField Txt_Publication_Year_Magazine;
    private javax.swing.JTextField Txt_Publication_Year_Scientific;
    private javax.swing.JTextField Txt_Title_Book;
    private javax.swing.JTextField Txt_Title_Magazine;
    private javax.swing.JTextField Txt_Title_Scientific;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
