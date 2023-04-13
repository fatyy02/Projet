package IHM;

import Utility.BibalExceptions;
import Utility.DBConnection;
import Utility.ModelTableau;
import static Utility.Utility.YMDtoDMY;
import static Utility.Utility.closeStatementResultSet;
import static Utility.Utility.dateToStr;
import static Utility.Utility.formatDate;
import static Utility.Utility.initialiseRequetePreparee;
import static Utility.Utility.showMessageSucces;
import control.UsagerControl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import objets_metiers.Usager;
/**
 * 
 * @author Diallo & Janati
 */
public class GestionUsager extends javax.swing.JFrame implements MouseListener {

    public GestionUsager() {

        initComponents();
        setResizable(false);
        setIdentifiant();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));

        tableListeUsager.addMouseListener(this);
        tableListeUsager.setModel(new ModelTableau(new Object[0][0],
                new String[]{"Id", "Nom",
                    "Prenom", "Date de naissance", "Sexe", "Telephone", "Adresse"}));
        tableListeUsager.setRowHeight(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panRecherch = new javax.swing.JPanel();
        RecherchParLabel = new javax.swing.JLabel();
        RecherchField = new javax.swing.JFormattedTextField();
        RecherchCombo = new javax.swing.JComboBox();
        RecherchBouton = new javax.swing.JButton();
        panListeUsager = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeUsager = new javax.swing.JTable();
        panAjoutUsager = new javax.swing.JPanel();
        panAjoutBas = new javax.swing.JPanel();
        civiliteLabel = new javax.swing.JLabel();
        matriculeLabel = new javax.swing.JLabel();
        prenomField = new javax.swing.JFormattedTextField();
        identifiantField = new javax.swing.JFormattedTextField();
        prenomLabel = new javax.swing.JLabel();
        telField = new javax.swing.JFormattedTextField();
        nomLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        nomField = new javax.swing.JFormattedTextField();
        civiliteCombo = new javax.swing.JComboBox();
        prenomLabel1 = new javax.swing.JLabel();
        adresseField = new javax.swing.JFormattedTextField();
        dateNaisPicker = new com.toedter.calendar.JCalendar();
        annulerBouton = new javax.swing.JButton();
        ajouterBouton = new javax.swing.JButton();
        modifierBouton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        retourButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Usagers");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(100, 200, 255));
        jPanel1.setName("Gestion de personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        panRecherch.setBackground(new java.awt.Color(100, 200, 255));
        panRecherch.setBorder(javax.swing.BorderFactory.createTitledBorder("Rechercher"));

        RecherchParLabel.setText("Rechercher par  ");

        RecherchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RecherchField.setPreferredSize(new java.awt.Dimension(123, 26));

        RecherchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id", "Nom", "All" }));
        RecherchCombo.setPreferredSize(new java.awt.Dimension(123, 26));
        RecherchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchComboActionPerformed(evt);
            }
        });

        RecherchBouton.setText("search");
        RecherchBouton.setPreferredSize(new java.awt.Dimension(47, 26));
        RecherchBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRecherchLayout = new javax.swing.GroupLayout(panRecherch);
        panRecherch.setLayout(panRecherchLayout);
        panRecherchLayout.setHorizontalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRecherchLayout.createSequentialGroup()
                        .addComponent(RecherchParLabel)
                        .addGap(41, 41, 41)
                        .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panRecherchLayout.createSequentialGroup()
                        .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        panRecherchLayout.setVerticalGroup(
            panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRecherchLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchParLabel)
                    .addComponent(RecherchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRecherchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecherchBouton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panListeUsager.setBackground(new java.awt.Color(255, 255, 255));
        panListeUsager.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des Utilisateurs"));

        jScrollPane1.getViewport().setBackground(Color.white);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableListeUsager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom", "Prenom", "Date de naissance", "Sexe", "Telephone", "Adresse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListeUsager.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableListeUsager.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableListeUsager);

        javax.swing.GroupLayout panListeUsagerLayout = new javax.swing.GroupLayout(panListeUsager);
        panListeUsager.setLayout(panListeUsagerLayout);
        panListeUsagerLayout.setHorizontalGroup(
            panListeUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListeUsagerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panListeUsagerLayout.setVerticalGroup(
            panListeUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListeUsagerLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panAjoutUsager.setBackground(new java.awt.Color(255, 255, 255));
        panAjoutUsager.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout Usager"));

        panAjoutBas.setBackground(new java.awt.Color(255, 255, 255));
        panAjoutBas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        civiliteLabel.setFont(new java.awt.Font("calibri", 1, 14)); // NOI18N
        civiliteLabel.setForeground(new java.awt.Color(100, 100, 100));
        civiliteLabel.setText("Civilite : ");

        matriculeLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matriculeLabel.setForeground(new java.awt.Color(100,100, 100));
        matriculeLabel.setText("Id ");

        prenomField.setPreferredSize(new java.awt.Dimension(123, 26));

        identifiantField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        identifiantField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identifiantField.setToolTipText("");
        identifiantField.setEnabled(false);
        identifiantField.setFont(new java.awt.Font("calibri", 1, 14)); // NOI18N
        identifiantField.setPreferredSize(new java.awt.Dimension(123, 26));

        prenomLabel.setFont(new java.awt.Font("calibri", 1, 14)); // NOI18N
        prenomLabel.setForeground(new java.awt.Color(0, 0, 255));
        prenomLabel.setText("Prenom  ");

        try {
            telField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-##-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telField.setPreferredSize(new java.awt.Dimension(123, 26));

        nomLabel.setFont(new java.awt.Font("calibri", 1, 14)); // NOI18N
        nomLabel.setForeground(new java.awt.Color(100, 100, 100));
        nomLabel.setText("Nom  ");

        telLabel.setFont(new java.awt.Font("calibri", 1, 14)); // NOI18N
        telLabel.setForeground(new java.awt.Color(100, 100, 100));
        telLabel.setText("Telephone  ");

        dateLabel.setFont(new java.awt.Font("calibri", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(100, 100, 100));
        dateLabel.setText("Date de naissance  ");

        nomField.setPreferredSize(new java.awt.Dimension(123, 26));

        civiliteCombo.setFont(new java.awt.Font("calibri", 1, 12)); // NOI18N
        civiliteCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "Mme" }));
        civiliteCombo.setPreferredSize(new java.awt.Dimension(123, 26));

        prenomLabel1.setFont(new java.awt.Font("calibri", 1, 14)); // NOI18N
        prenomLabel1.setForeground(new java.awt.Color(100,100,100));
        prenomLabel1.setText("Adresse");

        adresseField.setPreferredSize(new java.awt.Dimension(123, 26));

        javax.swing.GroupLayout panAjoutBasLayout = new javax.swing.GroupLayout(panAjoutBas);
        panAjoutBas.setLayout(panAjoutBasLayout);
        panAjoutBasLayout.setHorizontalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAjoutBasLayout.createSequentialGroup()
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telLabel)
                            .addComponent(prenomLabel)
                            .addComponent(nomLabel)
                            .addComponent(matriculeLabel)
                            .addComponent(civiliteLabel)
                            .addComponent(prenomLabel1))
                        .addGap(91, 91, 91)
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(civiliteCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(identifiantField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prenomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adresseField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateNaisPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(panAjoutBasLayout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panAjoutBasLayout.setVerticalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(civiliteLabel)
                    .addComponent(civiliteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matriculeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(identifiantField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel)
                    .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel)
                    .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(dateNaisPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel1)
                    .addComponent(adresseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telLabel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        annulerBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        ajouterBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter(evt);
            }
        });

        modifierBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        modifierBouton.setText("Modifier");
        modifierBouton.setEnabled(false);
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier(evt);
            }
        });

        supprimerButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        supprimerButton.setText("Supprimer");
        supprimerButton.setEnabled(false);
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer(evt);
            }
        });

        javax.swing.GroupLayout panAjoutUsagerLayout = new javax.swing.GroupLayout(panAjoutUsager);
        panAjoutUsager.setLayout(panAjoutUsagerLayout);
        panAjoutUsagerLayout.setHorizontalGroup(
            panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panAjoutBas, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panAjoutUsagerLayout.createSequentialGroup()
                .addComponent(annulerBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supprimerButton)
                .addGap(18, 18, 18)
                .addComponent(modifierBouton)
                .addGap(10, 10, 10)
                .addComponent(ajouterBouton)
                .addContainerGap())
        );
        panAjoutUsagerLayout.setVerticalGroup(
            panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutUsagerLayout.createSequentialGroup()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAjoutUsagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerBouton)
                    .addComponent(supprimerButton)
                    .addComponent(modifierBouton)
                    .addComponent(ajouterBouton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Gestion Des Usagers");

        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAjoutUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(retourButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panRecherch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panListeUsager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retourButton)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panRecherch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panListeUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panAjoutUsager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1178, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        clearField();
        modifierBouton.setEnabled(false);
        supprimerButton.setEnabled(false);
        ajouterBouton.setEnabled(true);
        setIdentifiant();

    }//GEN-LAST:event_annulerBoutonActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        Menu m = new Menu();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_retourButtonActionPerformed

    private void modifier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier

        try {
            Usager usager = getUsagerInfos();
            UsagerControl.modifier(usager);
            setIdentifiant();
            clearField();
            ((ModelTableau) tableListeUsager.getModel()).updateRow(
                    new Object[]{usager.getId(), usager.getNom(), usager.getPrenom(),
                        dateToStr(usager.getDateNais()), usager.getSexe(),
                        usager.getTel(), usager.getAdresse()},
                    tableListeUsager.getSelectedRow());
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            ajouterBouton.setEnabled(true);
            showMessageSucces("Les modifications ont été enregistrées");
        } catch (BibalExceptions e) {
            System.out.println("IHM.GestionUsager.modifierBoutonActionPerformed()");
        }
    }//GEN-LAST:event_modifier

    private void supprimer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer
        try {
            Usager usager = getUsagerInfos();
            UsagerControl.supprimer(usager);
            showMessageSucces("L'enregistrement a bien été supprimé");
            setIdentifiant();
            clearField();
            ((ModelTableau) tableListeUsager.getModel()).removeRow(tableListeUsager.getSelectedRow());
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            ajouterBouton.setEnabled(true);
        } catch (BibalExceptions e) {
            showMessageSucces("Impossible de supprimer cet usager");
        }
    }//GEN-LAST:event_supprimer

    private void RecherchBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchBoutonActionPerformed
        String rechPar = RecherchCombo.getSelectedItem().toString();
        String textARechercher = RecherchField.getText().trim();
        if (textARechercher.length() > 0) {
            ArrayList<Usager> listUsagers;
            try {
                switch (rechPar) {
                    case "Identifiant":
                        int identifiant = parseInt(textARechercher);
                        Usager usager = UsagerControl.findById(identifiant);
                        fillUsagerJtable(new ArrayList<Usager>() {
                            {
                                add(usager);
                            }
                        });
                        break;
                    case "Nom":
                        listUsagers = UsagerControl.findByNom(textARechercher);
                        fillUsagerJtable(listUsagers);
                        break;
                    case "Tout afficher":
                        listUsagers = UsagerControl.getListUsagers();
                        fillUsagerJtable(listUsagers);
                        break;
                }
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchBoutonActionPerformed() : Erreurs");
            } catch (NumberFormatException e) {
                showMessageSucces("Identifiant non valide");
            }
        }
    }//GEN-LAST:event_RecherchBoutonActionPerformed

    private void RecherchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchComboActionPerformed

        if (RecherchCombo.getSelectedItem().equals("Tout afficher")) {
            try {
                ArrayList<Usager> listUsagers = UsagerControl.getListUsagers();
                fillUsagerJtable(listUsagers);
                RecherchBouton.setEnabled(false);
                RecherchField.setEnabled(false);
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchComboActionPerformed() : Erreurs");
            }
        } else {
            RecherchBouton.setEnabled(true);
            RecherchField.setEnabled(true);
        }
    }//GEN-LAST:event_RecherchComboActionPerformed

    private void ajouter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter
        try {
            Usager usager = getUsagerInfos();
            UsagerControl.ajouter(usager);
            setIdentifiant();
            clearField();
            ((ModelTableau) tableListeUsager.getModel()).addRow(
                    new Object[]{usager.getId(), usager.getNom(), usager.getPrenom(),
                        dateToStr(usager.getDateNais()), usager.getSexe(),
                        usager.getTel(), usager.getAdresse()});
            showMessageSucces("Usager ajouté avec succès");
        } catch (BibalExceptions e) {
            System.out.println("IHM.GestionUsager.ajouterBoutonActionPerformed()");
        }
    }//GEN-LAST:event_ajouter

    private Usager getUsagerInfos() {
        int identifiant = parseInt(identifiantField.getText());
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        Date dateNais = dateNaisPicker.getDate();
        String sexe = civiliteCombo.getSelectedItem().toString().equals("M") ? "Masculin" : "Féminin";
        String adresse = adresseField.getText();
        String tel = telField.getText().replace("-", "").trim();
        return new Usager(identifiant, nom, prenom, dateNais, sexe, adresse, tel);
    }

    private void fillUsagerJtable(ArrayList<Usager> listUsagers) {
        String titre[] = new String[]{"Identifiant", "Nom",
            "Prénom", "Date de naissance", "Sexe", "Téléphone", "Adresse"};
        if (listUsagers.size() > 0) {
            int nbLigne = (null == listUsagers.get(0)) ? 0 : listUsagers.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                Usager usager = listUsagers.get(i);
                data[i][0] = usager.getId();
                data[i][1] = usager.getNom();
                data[i][2] = usager.getPrenom();
                data[i][3] = usager.getDateNais();
                data[i][4] = usager.getSexe();
                data[i][5] = usager.getTel();
                data[i][6] = usager.getAdresse();
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableListeUsager.setModel(model);
            tableListeUsager.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            ModelTableau model = new ModelTableau(data, titre);
            tableListeUsager.setModel(model);
            tableListeUsager.setRowHeight(1);
        }
    }

    private void clearField() {
        nomField.setText("");
        prenomField.setText("");
        adresseField.setText("");
        telField.setText("");
    }

    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM usager ORDER BY id DESC LIMIT 1";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant = 1;
            if (resultSet.first()) {
                identifiant = resultSet.getInt("id");
            }
            identifiantField.setText((identifiant + 1) + "");
        } catch (SQLException | BibalExceptions e) {
            JOptionPane.showMessageDialog(null, "Erreurs d'accès à la base de données" +e.getMessage(),
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int row = tableListeUsager.getSelectedRow();
        int nbreCol = tableListeUsager.getColumnCount();

        Object dataLigneSelected[] = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableListeUsager.getModel().getValueAt(row, i);
            }
            identifiantField.setText(dataLigneSelected[0].toString());
            nomField.setText(dataLigneSelected[1].toString());
            prenomField.setText(dataLigneSelected[2].toString());
            try {
                dateNaisPicker.setDate(formatDate(YMDtoDMY(dataLigneSelected[3].toString(), "/")));
            } catch (BibalExceptions ex) {
                System.out.println("IHM.GestionUsager.mouseReleased()");
            }
            String sexe = dataLigneSelected[4].toString();
            String civilite = sexe.equalsIgnoreCase("Masculin") ? "M" : "Mme";
            civiliteCombo.setSelectedItem(civilite);
            telField.setText(dataLigneSelected[5].toString().replace(" ", ""));
            adresseField.setText(dataLigneSelected[6].toString());
            modifierBouton.setEnabled(true);
            supprimerButton.setEnabled(true);
            ajouterBouton.setEnabled(false);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecherchBouton;
    private javax.swing.JComboBox RecherchCombo;
    private javax.swing.JFormattedTextField RecherchField;
    private javax.swing.JLabel RecherchParLabel;
    private javax.swing.JFormattedTextField adresseField;
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton annulerBouton;
    private javax.swing.JComboBox civiliteCombo;
    private javax.swing.JLabel civiliteLabel;
    private javax.swing.JLabel dateLabel;
    private com.toedter.calendar.JCalendar dateNaisPicker;
    private javax.swing.JFormattedTextField identifiantField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel matriculeLabel;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JFormattedTextField nomField;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JPanel panAjoutBas;
    private javax.swing.JPanel panAjoutUsager;
    private javax.swing.JPanel panListeUsager;
    private javax.swing.JPanel panRecherch;
    private javax.swing.JFormattedTextField prenomField;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JLabel prenomLabel1;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton supprimerButton;
    private javax.swing.JTable tableListeUsager;
    private javax.swing.JFormattedTextField telField;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
}
