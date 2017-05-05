package HashAlgorithms;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Hashshshshsh extends javax.swing.JFrame{

    
    static String algorithmA,algorithmB,algorithmC,algorithmD;
    public Hashshshshsh() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Hash Algorithms");
        KeyListener klb = new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e) {
                int c = e.getKeyCode();
                if(c==10)
                {
                    decrypt();
                }
            }
            
            @Override
            public void keyTyped(KeyEvent ke) {
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
            }
        };
        KeyListener kla = new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e) {
                int c = e.getKeyCode();
                if(c==10)
                {
                    encrypt();
                }
            }
            
            @Override
            public void keyTyped(KeyEvent ke) {
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
            }
        };
        KeyListener klc = new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e) {
                int c = e.getKeyCode();
                if(c==10)
                {
                    DecryptC.setEnabled(false);
                    StopC.setEnabled(true);
                    running = true;
                    bruteforcedecrypt();
                }
            }
            
            @Override
            public void keyTyped(KeyEvent ke) {
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
            }
        };
        KeyListener kld = new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e) {
                int c = e.getKeyCode();
                if(c==10)
                {
                    hashTotal();
                }
            }
            
            @Override
            public void keyTyped(KeyEvent ke) {
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
            }
        };
        keywordField.addKeyListener(kla);
        encryptedTextField.addKeyListener(klb);
        filenameField.addKeyListener(klb);
        encryptedTextFieldC.addKeyListener(klc);
        keywordlengthfieldC.addKeyListener(klc);
        filepath.addKeyListener(kld);
        DecryptC.setEnabled(true);
        StopC.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedpane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultAreaA = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        encryptA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hashalgorithmA = new javax.swing.JComboBox();
        keywordField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultAreaB = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filenameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        browseBtn1 = new javax.swing.JButton();
        hashalgorithmB = new javax.swing.JComboBox();
        encryptedTextField = new javax.swing.JTextField();
        Decrypt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultAreaC = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        numberssel = new javax.swing.JCheckBox();
        encryptedTextFieldC = new javax.swing.JTextField();
        characterssel = new javax.swing.JCheckBox();
        keywordlengthfieldC = new javax.swing.JTextField();
        hashalgorithmC = new javax.swing.JComboBox();
        symbolssel = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        StopC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DecryptC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        resultAreaD = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        browseBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        hashalgorithmD = new javax.swing.JComboBox();
        filepath = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultAreaA.setColumns(20);
        resultAreaA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultAreaA.setRows(5);
        resultAreaA.setToolTipText("Your result will display here.");
        jScrollPane3.setViewportView(resultAreaA);

        encryptA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        encryptA.setText("Encrypt!");
        encryptA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter a phrase/word/random string to Hash:");

        hashalgorithmA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hashalgorithmA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MD5", "SHA-1", "SHA-256" }));
        hashalgorithmA.setToolTipText("Select your preferred hashing algorithm.");

        keywordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        keywordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        keywordField.setToolTipText("Type...");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Result:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(hashalgorithmA, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptA, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keywordField)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keywordField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hashalgorithmA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encryptA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        tabbedpane.addTab("Hasher", jPanel1);

        resultAreaB.setColumns(20);
        resultAreaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultAreaB.setRows(5);
        resultAreaB.setToolTipText("Your result will display here.");
        jScrollPane2.setViewportView(resultAreaB);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter your hashed Text:");

        filenameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filenameField.setText("dictionary.txt");
        filenameField.setToolTipText("Enter the full path of the file name(C:\\Users\\****\\Desktop\\****.txt) or, if the dictionary is on the same file as the .jar, simply enter the file name and extension.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter the file name for your dictionary:");

        browseBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        browseBtn1.setText("Open File");
        browseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtn1ActionPerformed(evt);
            }
        });

        hashalgorithmB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hashalgorithmB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MD5", "SHA1", "SHA-256" }));
        hashalgorithmB.setToolTipText("Select your preferred hashing algorithm.");

        encryptedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        encryptedTextField.setToolTipText("Text must be a hashed encrypt using either the MD5 or SHA-1 algorithms.");

        Decrypt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Decrypt.setText("Decrypt");
        Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Result:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(encryptedTextField)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(hashalgorithmB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(filenameField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseBtn1)))
                .addGap(2, 2, 2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filenameField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hashalgorithmB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );

        tabbedpane.addTab("Dictionary Attack", jPanel2);

        resultAreaC.setColumns(20);
        resultAreaC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultAreaC.setRows(5);
        resultAreaC.setToolTipText("Your result will display here.");
        jScrollPane4.setViewportView(resultAreaC);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter your hashed Text:");

        numberssel.setText("Numbers");

        encryptedTextFieldC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        encryptedTextFieldC.setToolTipText("Text must be a hashed encrypt using either the MD5 or SHA-1 algorithms.");

        characterssel.setSelected(true);
        characterssel.setText("Characters");

        keywordlengthfieldC.setText("4");

        hashalgorithmC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hashalgorithmC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MD5", "SHA1", "SHA-256" }));
        hashalgorithmC.setToolTipText("Select your preferred hashing algorithm.");

        symbolssel.setText("Symbols");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter the plaintext's max length:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(characterssel))
                    .addComponent(jLabel8))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(numberssel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(symbolssel)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keywordlengthfieldC))))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(encryptedTextFieldC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hashalgorithmC, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(encryptedTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hashalgorithmC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(symbolssel)
                            .addComponent(numberssel))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(characterssel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keywordlengthfieldC)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        StopC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StopC.setText("Stop");
        StopC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopCActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Result:");

        DecryptC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DecryptC.setText("Decrypt");
        DecryptC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(DecryptC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StopC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DecryptC, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(StopC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        tabbedpane.addTab("Brute Force Search", jPanel3);

        resultAreaD.setColumns(20);
        resultAreaD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultAreaD.setRows(5);
        resultAreaD.setToolTipText("Your result will display here.");
        jScrollPane5.setViewportView(resultAreaD);

        browseBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        browseBtn.setText("Open File");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter a file name/path, or click the Open File button:");

        hashalgorithmD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hashalgorithmD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MD5", "SHA-1", "SHA-256" }));
        hashalgorithmD.setToolTipText("Select your preferred hashing algorithm.");

        filepath.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filepath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filepath.setToolTipText("Enter the file path in the following format: C:\\Folder\\file.txt");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Result:");

        calculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(filepath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browseBtn))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(hashalgorithmD, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filepath, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hashalgorithmD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
        );

        tabbedpane.addTab("File Hash Total", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedpane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptAActionPerformed
        encrypt();
    }//GEN-LAST:event_encryptAActionPerformed

    private void DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptActionPerformed
        decrypt();
    }//GEN-LAST:event_DecryptActionPerformed

    boolean running;
    private void DecryptCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptCActionPerformed
        DecryptC.setEnabled(false);
        StopC.setEnabled(true);
        running = true;
        bruteforcedecrypt();
    }//GEN-LAST:event_DecryptCActionPerformed

    private void StopCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopCActionPerformed
        DecryptC.setEnabled(true);
        StopC.setEnabled(false);
        running = false;
    }//GEN-LAST:event_StopCActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        hashTotal();
    }//GEN-LAST:event_calculateActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            filepath.setText(fc.getSelectedFile().toString());
        }
    }//GEN-LAST:event_browseBtnActionPerformed

    private void browseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtn1ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            filenameField.setText(fc.getSelectedFile().toString());
        }
    }//GEN-LAST:event_browseBtn1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Hashshshshsh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hashshshshsh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hashshshshsh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hashshshshsh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hashshshshsh().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Decrypt;
    private static javax.swing.JButton DecryptC;
    private static javax.swing.JButton StopC;
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton browseBtn1;
    private javax.swing.JButton calculate;
    private javax.swing.JCheckBox characterssel;
    private javax.swing.JButton encryptA;
    private javax.swing.JTextField encryptedTextField;
    private javax.swing.JTextField encryptedTextFieldC;
    private javax.swing.JTextField filenameField;
    private javax.swing.JTextField filepath;
    private javax.swing.JComboBox hashalgorithmA;
    private javax.swing.JComboBox hashalgorithmB;
    private javax.swing.JComboBox hashalgorithmC;
    private javax.swing.JComboBox hashalgorithmD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField keywordField;
    private javax.swing.JTextField keywordlengthfieldC;
    private javax.swing.JCheckBox numberssel;
    private javax.swing.JTextArea resultAreaA;
    private javax.swing.JTextArea resultAreaB;
    private static javax.swing.JTextArea resultAreaC;
    private javax.swing.JTextArea resultAreaD;
    private javax.swing.JCheckBox symbolssel;
    private javax.swing.JTabbedPane tabbedpane;
    // End of variables declaration//GEN-END:variables

    
    public void encrypt(){
        algorithmA = (String)hashalgorithmA.getSelectedItem();
        try {
            String message = keywordField.getText();
            resultAreaA.setText(hashString(message,algorithmA));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null,ex,"Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void decrypt(){
        algorithmB = (String)hashalgorithmB.getSelectedItem();
        try {
            File input =  new File(filenameField.getText());
            BufferedReader br = new BufferedReader(new FileReader(input));
            String line = "";
            boolean a = false;
            String enctext = encryptedTextField.getText();
            while((line = br.readLine())!=null)
            {
                if(enctext.equals(hashString(line, algorithmB)))
                {
                    resultAreaB.setText("Your unencrypted word is: "+line);
                    a=true;
                    break;
                }
            }
            if(a==false)
            {
                resultAreaB.setText("No match found");
            }
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null,"Algorithm selection error!\n"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null,ex,"Error!",JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Enter the complete file name(dictionary.txt) that is in the same folder as the .jar,"
                    + " or the complete path of the file.\n"+ex,"Error 404 - File Not Found :",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex,"Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
    String[] symbols = {"!","/","@","#","$","%","^","&","*","(",")","-","_","+","=",";",":","'","|","{","}","[","]"};
    
    ArrayList<String> stringList = new ArrayList<String>();
    String[] canUse ;
    int maxlength = 0;
    String encTextC;
    private void bruteforcedecrypt() {
        algorithmC = (String)hashalgorithmC.getSelectedItem();
        encTextC = encryptedTextFieldC.getText();
        
        stringList.clear();
        try{
            maxlength = Integer.parseInt(keywordlengthfieldC.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Enter a correct number from 1-10.\n"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
        }
        if(characterssel.isSelected()){
            for(String a:alphabet){
                stringList.add(a);
            }
        }
        if(numberssel.isSelected()){
            for(String a:numbers){
                stringList.add(a);
            }
        }
        if(symbolssel.isSelected()){
            for(String a:symbols){
                stringList.add(a);
            }
        }
        canUse = new String[stringList.size()];
        stringList.toArray(canUse);
        
        new Words().start();
    }
    
    class Words extends Thread{
        public void run(){
            try {
                words(maxlength);
                DecryptC.setEnabled(true);
                StopC.setEnabled(false);
            } catch (IOException | NoSuchAlgorithmException ex) {
                JOptionPane.showMessageDialog(null,ex,"Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
        int counter = 0;
        List<String> words(int n) throws IOException, NoSuchAlgorithmException {
            List<String> ret = new ArrayList<String>();
            if(n == 0) {
                ret.add("");
                return ret;
            }
            for(String word : words(n - 1)) {
                for(int c = 0; c < canUse.length; c++) {
                    if(running)
                    {
                        counter++;
                        char b = canUse[c].charAt(0);
                        ret.add(word + b);
                        String d = word+Character.toString(b);
                        if(encTextC.equals(hashString(d,algorithmC))){
                            resultAreaC.setText("Your plaintext word is: " + d + " .\nAnalysed " + counter + " combinations.");
                            ret.clear();
                            ret.add("");
                            running = false;
                            DecryptC.setEnabled(true);
                            StopC.setEnabled(false);
                            break;
                        }
                        else{
                            resultAreaC.setText("Comparing strings. Current String: " + d + " .\nAnalysed " + counter + " Strings.");
                        }
                    }
                    else{
                        ret.clear();
                        ret.add("");
                        break;
                    }
                }
            }
            return ret;
        }
    }
    
    public void hashTotal(){
        String filep = filepath.getText();
        algorithmD = (String)hashalgorithmD.getSelectedItem();
        if(!filep.equals("")){
            try{
                resultAreaD.setText(filep + "Calculating...");
                File file1 = new File(filep);
                byte[] filebytes = new byte[(int) file1.length()];
                FileInputStream fis = new FileInputStream(file1);
                fis.read(filebytes);
                MessageDigest md = MessageDigest.getInstance(algorithmD);
                byte[] result = md.digest(filebytes);
                resultAreaD.setText(filep + " 's hash total:\n"+convert(result));
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"The file path was incorrect!\n"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
            } catch (IOException | NoSuchAlgorithmException ex) {
                JOptionPane.showMessageDialog(null,ex,"Error!",JOptionPane.ERROR_MESSAGE);
            } catch(java.lang.OutOfMemoryError error){
                JOptionPane.showMessageDialog(null,"File is too large!\n" + error,"Error!",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"File path not be empty!","Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private static String hashString(String message, String algorithm) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        MessageDigest md = MessageDigest.getInstance(algorithm);
        byte[] bytes = md.digest(message.getBytes("UTF-8"));
        return convert(bytes);
    }
    
    private static String convert(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return stringBuffer.toString();
    }
    
}
