
package com.mycompany.studentrecordapp;
import java.sql.*;
import com.mycompany.studentrecordapp.DBConnection.*;

public class MainFrame extends javax.swing.JFrame {

   
    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        DeletePanel = new javax.swing.JPanel();
        Deletelabel = new javax.swing.JLabel();
        RemoveLabel = new javax.swing.JLabel();
        RemoveKTUIDTextField = new javax.swing.JTextField();
        RemoveButton = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        QuitButton2 = new javax.swing.JButton();
        UpdatePanel = new javax.swing.JPanel();
        UpdateLabel = new javax.swing.JLabel();
        UpdateDetailsLabel = new javax.swing.JLabel();
        InputKTUIDTextField = new javax.swing.JTextField();
        UpdateEnterButton = new javax.swing.JButton();
        UpdateDetailsPanel = new javax.swing.JPanel();
        KTUIDLabel1 = new javax.swing.JLabel();
        KTUIDTextField1 = new javax.swing.JTextField();
        AdmnNoLabel1 = new javax.swing.JLabel();
        AdmnNoTextField1 = new javax.swing.JTextField();
        NameLabel1 = new javax.swing.JLabel();
        NameTextField1 = new javax.swing.JTextField();
        PhNoLabel1 = new javax.swing.JLabel();
        PhNoTextField1 = new javax.swing.JTextField();
        BloodLabel1 = new javax.swing.JLabel();
        BloodTextField1 = new javax.swing.JTextField();
        MailLabel1 = new javax.swing.JLabel();
        MailTextField1 = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        QuitButton3 = new javax.swing.JButton();
        SearchPanel = new javax.swing.JPanel();
        SearchLabel = new javax.swing.JLabel();
        SearchDeatailsLabel = new javax.swing.JLabel();
        InputKTUIDTextField1 = new javax.swing.JTextField();
        SearchEnterButton = new javax.swing.JButton();
        SearchResultsPanel = new javax.swing.JPanel();
        KTUIDLabel2 = new javax.swing.JLabel();
        KTUIDTextField2 = new javax.swing.JTextField();
        AdmnNoLabel2 = new javax.swing.JLabel();
        AdmnNoTextField2 = new javax.swing.JTextField();
        NameLabel2 = new javax.swing.JLabel();
        NameTextField2 = new javax.swing.JTextField();
        PhNoLabel2 = new javax.swing.JLabel();
        PhNoTextField2 = new javax.swing.JTextField();
        BloodLabel2 = new javax.swing.JLabel();
        BloodTextField2 = new javax.swing.JTextField();
        MailLabel2 = new javax.swing.JLabel();
        MailTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        QuitButton1 = new javax.swing.JButton();
        InsertPanel = new javax.swing.JPanel();
        QuitButton = new javax.swing.JButton();
        InsertLabel = new javax.swing.JLabel();
        KTUIDLabel = new javax.swing.JLabel();
        KTUIDTextFeild = new javax.swing.JTextField();
        AdmnNoLabel = new javax.swing.JLabel();
        AdmnNoTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PhNoTextField = new javax.swing.JTextField();
        BloodLabel = new javax.swing.JLabel();
        BloodTextField = new javax.swing.JTextField();
        MailLabel = new javax.swing.JLabel();
        MailTextField = new javax.swing.JTextField();
        InsertSubmitButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jTabbedPane1.setBackground(new java.awt.Color(51, 0, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N

        DeletePanel.setBackground(new java.awt.Color(255, 204, 204));

        Deletelabel.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        Deletelabel.setForeground(new java.awt.Color(102, 102, 102));
        Deletelabel.setText("DELETE STUDENT DETAILS");

        RemoveLabel.setText("Enter KTUID of Student to be removed");

        RemoveKTUIDTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RemoveButton.setBackground(new java.awt.Color(254, 249, 249));
        RemoveButton.setForeground(new java.awt.Color(255, 102, 102));
        RemoveButton.setText("REMOVE");
        RemoveButton.setBorder(null);
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(153, 153, 153));
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        QuitButton2.setBackground(new java.awt.Color(102, 102, 102));
        QuitButton2.setForeground(new java.awt.Color(204, 204, 204));
        QuitButton2.setText("X");
        QuitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeletePanelLayout = new javax.swing.GroupLayout(DeletePanel);
        DeletePanel.setLayout(DeletePanelLayout);
        DeletePanelLayout.setHorizontalGroup(
            DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Deletelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePanelLayout.createSequentialGroup()
                            .addComponent(Clear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletePanelLayout.createSequentialGroup()
                            .addGroup(DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RemoveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RemoveKTUIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(QuitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DeletePanelLayout.setVerticalGroup(
            DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deletelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuitButton2))
                .addGap(25, 25, 25)
                .addComponent(RemoveLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveKTUIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(DeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemoveButton)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DELETE", DeletePanel);

        UpdatePanel.setBackground(new java.awt.Color(204, 255, 255));

        UpdateLabel.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        UpdateLabel.setForeground(new java.awt.Color(102, 102, 102));
        UpdateLabel.setText("UPDATE STUDENT DETAILS");

        UpdateDetailsLabel.setText("Enter KTUID of Student to be updated");

        InputKTUIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputKTUIDTextFieldActionPerformed(evt);
            }
        });

        UpdateEnterButton.setBackground(new java.awt.Color(229, 253, 253));
        UpdateEnterButton.setForeground(new java.awt.Color(0, 102, 204));
        UpdateEnterButton.setText("Search");
        UpdateEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEnterButtonActionPerformed(evt);
            }
        });

        UpdateDetailsPanel.setBackground(new java.awt.Color(235, 255, 255));
        UpdateDetailsPanel.setVisible(false);

        KTUIDLabel1.setText("KTU ID");

        KTUIDTextField1.setEditable(false);
        KTUIDTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KTUIDTextField1ActionPerformed(evt);
            }
        });

        AdmnNoLabel1.setText("Admission No.");

        AdmnNoTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdmnNoTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmnNoTextField1ActionPerformed(evt);
            }
        });

        NameLabel1.setText("Name");

        NameTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PhNoLabel1.setText("Phone No.");

        PhNoTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BloodLabel1.setText("Blood Group");

        BloodTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MailLabel1.setText("E- mail");

        MailTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        UpdateButton.setBackground(new java.awt.Color(229, 253, 253));
        UpdateButton.setForeground(new java.awt.Color(0, 102, 204));
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(153, 153, 153));
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateDetailsPanelLayout = new javax.swing.GroupLayout(UpdateDetailsPanel);
        UpdateDetailsPanel.setLayout(UpdateDetailsPanelLayout);
        UpdateDetailsPanelLayout.setHorizontalGroup(
            UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateDetailsPanelLayout.createSequentialGroup()
                        .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhNoLabel1)
                            .addComponent(PhNoTextField1))
                        .addGap(18, 18, 18)
                        .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BloodLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BloodTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(NameTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateDetailsPanelLayout.createSequentialGroup()
                        .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UpdateDetailsPanelLayout.createSequentialGroup()
                                .addComponent(KTUIDLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addGap(101, 101, 101))
                            .addGroup(UpdateDetailsPanelLayout.createSequentialGroup()
                                .addComponent(KTUIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AdmnNoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdmnNoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(MailTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateDetailsPanelLayout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateButton))
                    .addGroup(UpdateDetailsPanelLayout.createSequentialGroup()
                        .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        UpdateDetailsPanelLayout.setVerticalGroup(
            UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateDetailsPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KTUIDLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdmnNoLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdmnNoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KTUIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhNoLabel1)
                    .addComponent(BloodLabel1))
                .addGap(2, 2, 2)
                .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhNoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(MailLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        QuitButton3.setBackground(new java.awt.Color(102, 102, 102));
        QuitButton3.setForeground(new java.awt.Color(204, 204, 204));
        QuitButton3.setText("X");
        QuitButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdatePanelLayout = new javax.swing.GroupLayout(UpdatePanel);
        UpdatePanel.setLayout(UpdatePanelLayout);
        UpdatePanelLayout.setHorizontalGroup(
            UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePanelLayout.createSequentialGroup()
                .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdatePanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UpdatePanelLayout.createSequentialGroup()
                                .addComponent(InputKTUIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateEnterButton))
                            .addComponent(UpdateDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(UpdatePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(UpdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(QuitButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        UpdatePanelLayout.setVerticalGroup(
            UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuitButton3))
                .addGap(20, 20, 20)
                .addComponent(UpdateDetailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputKTUIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateEnterButton))
                .addGap(18, 18, 18)
                .addComponent(UpdateDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UPDATE", UpdatePanel);

        SearchLabel.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        SearchLabel.setForeground(new java.awt.Color(102, 102, 102));
        SearchLabel.setText("SEARCH STUDENT DETAILS");

        SearchDeatailsLabel.setText("Enter KTUID of Student to be Search");

        InputKTUIDTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputKTUIDTextField1ActionPerformed(evt);
            }
        });

        SearchEnterButton.setBackground(new java.awt.Color(153, 153, 153));
        SearchEnterButton.setForeground(new java.awt.Color(255, 255, 255));
        SearchEnterButton.setText("Search");
        SearchEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEnterButtonActionPerformed(evt);
            }
        });

        SearchResultsPanel.setBackground(new java.awt.Color(204, 204, 204));
        SearchResultsPanel.setVisible(false);

        KTUIDLabel2.setText("KTU ID");

        KTUIDTextField2.setEditable(false);
        KTUIDTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KTUIDTextField2ActionPerformed(evt);
            }
        });

        AdmnNoLabel2.setText("Admission No.");

        AdmnNoTextField2.setBackground(new java.awt.Color(242, 242, 242));
        AdmnNoTextField2.setEditable(false);
        AdmnNoTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmnNoTextField2ActionPerformed(evt);
            }
        });

        NameLabel2.setText("Name");

        NameTextField2.setBackground(new java.awt.Color(242, 242, 242));
        NameTextField2.setEditable(false);
        NameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextField2ActionPerformed(evt);
            }
        });

        PhNoLabel2.setText("Phone No.");

        PhNoTextField2.setBackground(new java.awt.Color(242, 242, 242));
        PhNoTextField2.setEditable(false);

        BloodLabel2.setText("Blood Group");

        BloodTextField2.setBackground(new java.awt.Color(242, 242, 242));
        BloodTextField2.setEditable(false);

        MailLabel2.setText("E- mail");

        MailTextField2.setBackground(new java.awt.Color(242, 242, 242));
        MailTextField2.setEditable(false);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchResultsPanelLayout = new javax.swing.GroupLayout(SearchResultsPanel);
        SearchResultsPanel.setLayout(SearchResultsPanelLayout);
        SearchResultsPanelLayout.setHorizontalGroup(
            SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchResultsPanelLayout.createSequentialGroup()
                        .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhNoLabel2)
                            .addComponent(PhNoTextField2))
                        .addGap(18, 18, 18)
                        .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BloodLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BloodTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(NameTextField2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchResultsPanelLayout.createSequentialGroup()
                        .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchResultsPanelLayout.createSequentialGroup()
                                .addComponent(KTUIDLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addGap(101, 101, 101))
                            .addGroup(SearchResultsPanelLayout.createSequentialGroup()
                                .addComponent(KTUIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AdmnNoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdmnNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(MailTextField2)
                    .addGroup(SearchResultsPanelLayout.createSequentialGroup()
                        .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(SearchResultsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchResultsPanelLayout.setVerticalGroup(
            SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResultsPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KTUIDLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdmnNoLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdmnNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KTUIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhNoLabel2)
                    .addComponent(BloodLabel2))
                .addGap(2, 2, 2)
                .addGroup(SearchResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(MailLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MailTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        QuitButton1.setBackground(new java.awt.Color(102, 102, 102));
        QuitButton1.setForeground(new java.awt.Color(204, 204, 204));
        QuitButton1.setText("X");
        QuitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchDeatailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SearchPanelLayout.createSequentialGroup()
                                .addComponent(InputKTUIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(SearchEnterButton))
                            .addComponent(SearchResultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(QuitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuitButton1))
                .addGap(20, 20, 20)
                .addComponent(SearchDeatailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputKTUIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchEnterButton))
                .addGap(18, 18, 18)
                .addComponent(SearchResultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("SEARCH", SearchPanel);

        InsertPanel.setBackground(new java.awt.Color(204, 255, 204));

        QuitButton.setBackground(new java.awt.Color(102, 102, 102));
        QuitButton.setForeground(new java.awt.Color(204, 204, 204));
        QuitButton.setText("X");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        InsertLabel.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        InsertLabel.setForeground(new java.awt.Color(102, 102, 102));
        InsertLabel.setText("INSERT STUDENT DETAILS");

        KTUIDLabel.setText("KTU ID");

        KTUIDTextFeild.setToolTipText("");
        KTUIDTextFeild.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        KTUIDTextFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KTUIDTextFeildActionPerformed(evt);
            }
        });

        AdmnNoLabel.setText("Admission No.");

        AdmnNoTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdmnNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmnNoTextFieldActionPerformed(evt);
            }
        });

        NameLabel.setText("Name");

        NameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Phone No.");

        PhNoTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BloodLabel.setText("Blood Group");

        BloodTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MailLabel.setText("E- mail");

        MailTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        InsertSubmitButton.setBackground(new java.awt.Color(241, 254, 241));
        InsertSubmitButton.setForeground(new java.awt.Color(0, 102, 51));
        InsertSubmitButton.setText("SUBMIT");
        InsertSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertSubmitButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(153, 153, 153));
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("CLEAR");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InsertPanelLayout = new javax.swing.GroupLayout(InsertPanel);
        InsertPanel.setLayout(InsertPanelLayout);
        InsertPanelLayout.setHorizontalGroup(
            InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsertPanelLayout.createSequentialGroup()
                        .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(InsertPanelLayout.createSequentialGroup()
                                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(PhNoTextField))
                                .addGap(18, 18, 18)
                                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BloodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BloodTextField)))
                            .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InsertPanelLayout.createSequentialGroup()
                                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InsertPanelLayout.createSequentialGroup()
                                        .addComponent(KTUIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(83, 83, 83))
                                    .addComponent(KTUIDTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AdmnNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdmnNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(MailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InsertPanelLayout.createSequentialGroup()
                                .addComponent(ClearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InsertSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(357, 357, 357))))
            .addGroup(InsertPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(InsertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        InsertPanelLayout.setVerticalGroup(
            InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InsertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuitButton))
                .addGap(26, 26, 26)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KTUIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdmnNoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdmnNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KTUIDTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BloodLabel))
                .addGap(2, 2, 2)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(MailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(InsertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertSubmitButton)
                    .addComponent(ClearButton))
                .addGap(90, 90, 90))
        );

        jTabbedPane1.addTab("INSERT", InsertPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdmnNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmnNoTextFieldActionPerformed

    }//GEN-LAST:event_AdmnNoTextFieldActionPerformed

    private void KTUIDTextFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KTUIDTextFeildActionPerformed
    }//GEN-LAST:event_KTUIDTextFeildActionPerformed

    private void InsertSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertSubmitButtonActionPerformed
        //ON INSERT BUTTON CLICK
        String ktuid=KTUIDTextFeild.getText();
        String admnno=AdmnNoTextField.getText();
        String name =NameTextField.getText();
        String phno=PhNoTextField.getText();
        String blood=BloodTextField.getText();
        String mail=MailTextField.getText();
        try{
            Connection con=DBConnection.connectDB();
            String query="INSERT INTO student(ktuid,admnNo,name,phone,blood,email) VALUES(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,ktuid);
            pst.setString(2,admnno);
            pst.setString(3,name);
            pst.setString(4,phno);
            pst.setString(5,blood);
            pst.setString(6,mail);
            int rowsAffected=pst.executeUpdate();
            pst.close();
            con.close();
            System.out.println(rowsAffected);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_InsertSubmitButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        String ktuid=RemoveKTUIDTextField.getText();
        if(isValid(ktuid)){
        try{
            Connection con=DBConnection.connectDB();
            String query="DELETE FROM student WHERE ktuid=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,ktuid);
            int rowsAffected=pst.executeUpdate();
            pst.close();
            con.close();
            System.out.println(rowsAffected);
        }catch(Exception e){
            e.printStackTrace();
        }}
    }//GEN-LAST:event_RemoveButtonActionPerformed
    private void AdmnNoTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmnNoTextField1ActionPerformed
    }//GEN-LAST:event_AdmnNoTextField1ActionPerformed
    private void UpdateEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEnterButtonActionPerformed
        String ktuid=InputKTUIDTextField.getText();
        if(isValid(ktuid)){
        UpdateDetailsPanel.setVisible(true);
        KTUIDTextField1.setText(InputKTUIDTextField.getText());
        InputKTUIDTextField.setVisible(false);
        UpdateEnterButton.setVisible(false);
        UpdateDetailsLabel.setText("Enter details");
        }
    }//GEN-LAST:event_UpdateEnterButtonActionPerformed

    private void InputKTUIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputKTUIDTextFieldActionPerformed
    }//GEN-LAST:event_InputKTUIDTextFieldActionPerformed
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String ktuid=KTUIDTextField1.getText();
        String admnno=AdmnNoTextField1.getText();
        String name =NameTextField1.getText();
        String phno=PhNoTextField1.getText();
        String blood=BloodTextField1.getText();
        String mail=MailTextField1.getText();
        try{
            Connection con=DBConnection.connectDB();
            String query="UPDATE student SET admnNo=?,name=?,phone=?,blood=?,email=? WHERE ktuid=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(6,ktuid);
            pst.setString(1,admnno);
            pst.setString(2,name);
            pst.setString(3,phno);
            pst.setString(4,blood);
            pst.setString(5,mail);
            int rowsAffected=pst.executeUpdate();
            pst.close();
            con.close();
            System.out.println(rowsAffected);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_UpdateButtonActionPerformed
    private void KTUIDTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KTUIDTextField1ActionPerformed
    }//GEN-LAST:event_KTUIDTextField1ActionPerformed
    private void InputKTUIDTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputKTUIDTextField1ActionPerformed
    }//GEN-LAST:event_InputKTUIDTextField1ActionPerformed
    private boolean isValid(String ktuid){
        boolean ret=false;
        int count=0;
        try{
        Connection con=DBConnection.connectDB();
        PreparedStatement pst=con.prepareStatement("SELECT COUNT(*) FROM student WHERE ktuid=?");
        pst.setString(1, ktuid);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            count=rs.getInt(1);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(count>0){
            ret=true;
        }
        return ret;
    }
    
    private void SearchEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEnterButtonActionPerformed
        String ktuid=InputKTUIDTextField1.getText();
        if(isValid(ktuid)){
        SearchResultsPanel.setVisible(true);
        KTUIDTextField2.setText(InputKTUIDTextField1.getText());
        InputKTUIDTextField1.setVisible(false);
        SearchEnterButton.setVisible(false);
        try{
            Connection con=DBConnection.connectDB();
            String query="SELECT * FROM student WHERE ktuid=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,ktuid);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
            AdmnNoTextField2.setText(rs.getString("admnNo"));
            NameTextField2.setText(rs.getString("name"));
            PhNoTextField2.setText(rs.getString("phone"));
            BloodTextField2.setText(rs.getString("blood"));
            MailTextField2.setText(rs.getString("email"));
            }
            rs.close();
            pst.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_SearchEnterButtonActionPerformed

    private void KTUIDTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KTUIDTextField2ActionPerformed
    }//GEN-LAST:event_KTUIDTextField2ActionPerformed

    private void AdmnNoTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmnNoTextField2ActionPerformed
    }//GEN-LAST:event_AdmnNoTextField2ActionPerformed

    private void NameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextField2ActionPerformed
    }//GEN-LAST:event_NameTextField2ActionPerformed

    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        dispose();
        Start s=new Start();
        s.setVisible(true);
        s.setBounds(0, 0, 400, 450);
    }//GEN-LAST:event_QuitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        UpdateDetailsPanel.setVisible(false);
        KTUIDTextField1.setText("");
        InputKTUIDTextField.setVisible(true);
        UpdateEnterButton.setVisible(true);
        UpdateDetailsLabel.setText("Enter details");
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        RemoveKTUIDTextField.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SearchResultsPanel.setVisible(false);
        InputKTUIDTextField1.setText("");
        InputKTUIDTextField1.setVisible(true);
        SearchEnterButton.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        KTUIDTextFeild.setText("");
        AdmnNoTextField.setText("");
        NameTextField.setText("");
        PhNoTextField.setText("");
        BloodTextField.setText("");
        MailTextField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void QuitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButton1ActionPerformed
       dispose();
        Start s=new Start();
        s.setVisible(true);
        s.setBounds(0, 0, 400, 450);
    }//GEN-LAST:event_QuitButton1ActionPerformed

    private void QuitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButton2ActionPerformed
        dispose();
        Start s=new Start();
        s.setVisible(true);
        s.setBounds(0, 0, 400, 450);       
    }//GEN-LAST:event_QuitButton2ActionPerformed

    private void QuitButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButton3ActionPerformed
       dispose();
        Start s=new Start();
        s.setVisible(true);
        s.setBounds(0, 0, 400, 450);
    }//GEN-LAST:event_QuitButton3ActionPerformed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
        
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdmnNoLabel;
    private javax.swing.JLabel AdmnNoLabel1;
    private javax.swing.JLabel AdmnNoLabel2;
    private javax.swing.JTextField AdmnNoTextField;
    private javax.swing.JTextField AdmnNoTextField1;
    private javax.swing.JTextField AdmnNoTextField2;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BloodLabel;
    private javax.swing.JLabel BloodLabel1;
    private javax.swing.JLabel BloodLabel2;
    private javax.swing.JTextField BloodTextField;
    private javax.swing.JTextField BloodTextField1;
    private javax.swing.JTextField BloodTextField2;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearButton;
    private javax.swing.JPanel DeletePanel;
    private javax.swing.JLabel Deletelabel;
    private javax.swing.JTextField InputKTUIDTextField;
    private javax.swing.JTextField InputKTUIDTextField1;
    private javax.swing.JLabel InsertLabel;
    private javax.swing.JPanel InsertPanel;
    private javax.swing.JButton InsertSubmitButton;
    private javax.swing.JLabel KTUIDLabel;
    private javax.swing.JLabel KTUIDLabel1;
    private javax.swing.JLabel KTUIDLabel2;
    private javax.swing.JTextField KTUIDTextFeild;
    private javax.swing.JTextField KTUIDTextField1;
    private javax.swing.JTextField KTUIDTextField2;
    private javax.swing.JLabel MailLabel;
    private javax.swing.JLabel MailLabel1;
    private javax.swing.JLabel MailLabel2;
    private javax.swing.JTextField MailTextField;
    private javax.swing.JTextField MailTextField1;
    private javax.swing.JTextField MailTextField2;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel NameLabel2;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField NameTextField1;
    private javax.swing.JTextField NameTextField2;
    private javax.swing.JLabel PhNoLabel1;
    private javax.swing.JLabel PhNoLabel2;
    private javax.swing.JTextField PhNoTextField;
    private javax.swing.JTextField PhNoTextField1;
    private javax.swing.JTextField PhNoTextField2;
    private javax.swing.JButton QuitButton;
    private javax.swing.JButton QuitButton1;
    private javax.swing.JButton QuitButton2;
    private javax.swing.JButton QuitButton3;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTextField RemoveKTUIDTextField;
    private javax.swing.JLabel RemoveLabel;
    private javax.swing.JLabel SearchDeatailsLabel;
    private javax.swing.JButton SearchEnterButton;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JPanel SearchResultsPanel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UpdateDetailsLabel;
    private javax.swing.JPanel UpdateDetailsPanel;
    private javax.swing.JButton UpdateEnterButton;
    private javax.swing.JLabel UpdateLabel;
    private javax.swing.JPanel UpdatePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
