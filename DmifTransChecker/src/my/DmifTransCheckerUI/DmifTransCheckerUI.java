/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.DmifTransCheckerUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author honli
 */
public class DmifTransCheckerUI extends javax.swing.JFrame {

    /**
     * Creates new form DmifTransCheckerUI
     */
    public DmifTransCheckerUI() {
        initComponents();
        this.jDataSetIP = new DataSet();
        this.jDataSetSoC = new DataSet();
        this.bIPOpened = false;
        this.bSoCOpened = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DmifTransChecker");
        setPreferredSize(new java.awt.Dimension(1270, 800));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1280, 800));

        jLabel1.setText("Output directory of IP");

        jLabel2.setText("Analyze script of IP");

        jTextField1.setText("/home/honli/perl/dmif_soc_monitor_analyzer/dce11_2_quick_pipe");

        jTextField2.setText("/home/honli/perl/dmif_soc_monitor_analyzer/dce11_2_quick_pipe");

        jButton3.setText("GO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setOpaque(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("IP", jPanel1);

        jLabel3.setText("Output directory of SoC");

        jLabel4.setText("Analyze script of SoC");

        jTextField3.setText("/home/honli/perl/dmif_soc_monitor_analyzer/elle_quick_pipe");

        jTextField4.setText("/home/honli/perl/dmif_soc_monitor_analyzer/elle_quick_pipe");
        jTextField4.setToolTipText("");

        jButton4.setText("GO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("SoC", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Compare", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        System.out.println(this.jTable1.getSelectedRow());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.bIPOpened = false;
        //Init table data
        this.jDataSetIP.CleanUp();

        DefaultTableModel jReqTableModel = new DefaultTableModel(this.jDataSetIP.DataSrc, this.jDataSetIP.ColName);
        this.jTable1.setModel(jReqTableModel);
        this.jTable1.repaint();
        this.jTable1.updateUI();

        System.out.println("IP GO button click.");
        String jOutputDirText = jTextField1.getText();
        String jScriptDirText = jTextField2.getText();

        if (jOutputDirText.isEmpty() || jScriptDirText.isEmpty()){
            JOptionPane.showMessageDialog(null, "Both two text field need to be filled in", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("jOutputDirText: " + jOutputDirText + "\njScriptDirText: " + jScriptDirText);

        String jFileReqTxt = jOutputDirText + System.getProperty("file.separator") + "dmif_freq_soc_monitor.txt";
        if(new File(jFileReqTxt).exists()) {
            System.out.println(jFileReqTxt + " exists");
        }
        else{
            JOptionPane.showMessageDialog(null, jFileReqTxt + " do not exist", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String jFileRetTxt = jOutputDirText + System.getProperty("file.separator") + "dmif_fret_soc_monitor.txt";
        if(new File(jFileRetTxt).exists()) {
            System.out.println(jFileRetTxt + " exists");
        }
        else{
            JOptionPane.showMessageDialog(null, jFileRetTxt + " do not exist", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String jFileScript = jOutputDirText + System.getProperty("file.separator") + "dmif_soc_monitor_analyzer.pl";
        if(new File(jFileScript).exists()) {
            System.out.println(jFileScript + " exists");
        }
        else{
            JOptionPane.showMessageDialog(null, jFileScript + " do not exist", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String lineToRead;
        try {
            String jCmd = "perl " + jFileScript + " -dir " + jOutputDirText;
            System.out.println(jCmd);
            Process jProc = Runtime.getRuntime().exec(jCmd);
            InputStream inputStream = jProc.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            if ((lineToRead = bufferedReader.readLine()) != null) {
                System.out.println(lineToRead);
                if(lineToRead.equals("PASSED")){
                    System.out.println("Script running properly");
                }
                else{
                    System.out.println("Error: " + bufferedReader.toString());
                    JOptionPane.showMessageDialog(null, "Error: " + bufferedReader.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String jOutputPath = jOutputDirText + System.getProperty("file.separator") + "_out.tmp";
        File jReqOutFile = new File(jOutputPath);
        if(jReqOutFile.isFile() && jReqOutFile.exists()){
            InputStreamReader read = null;
            try {
                System.out.println(jOutputPath + " found");
                read = new InputStreamReader(new FileInputStream(jReqOutFile));
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    String[] strArray = lineTxt.split(" ");
                    if(strArray.length == 10){
                        Vector jReqElement = new Vector();
                        jReqElement.addElement(strArray[0]);
                        jReqElement.addElement(strArray[1]);
                        jReqElement.addElement("0x" + Integer.toHexString(Integer.parseInt(strArray[2])));
                        jReqElement.addElement(strArray[3]);
                        jReqElement.addElement(strArray[9]);
                        jReqElement.addElement(strArray[7]);
                        jReqElement.addElement(strArray[8]);

                        this.jDataSetIP.DataSrc.addElement(jReqElement);
                    }
                    else{
                        System.out.println("Error: Data Format mismatch");
                        return ;
                    }
                }   read.close();

                this.jSetTableColWidth(0, 100, jTable1);
                this.jSetTableColWidth(1, 100, jTable1);
                this.jSetTableColWidth(2, 80, jTable1);
                this.jSetTableColWidth(3, 100, jTable1);
                this.jSetTableColWidth(4, 80, jTable1);

                this.jTable1.repaint();
                this.jTable1.updateUI();
                this.bIPOpened = true;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    read.close();
                } catch (IOException ex) {
                    Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            System.out.println("Error: " + jOutputPath + " not found");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.bSoCOpened = false;
        //Init table data
        this.jDataSetSoC.CleanUp();

        DefaultTableModel jReqTableModel = new DefaultTableModel(this.jDataSetSoC.DataSrc, this.jDataSetSoC.ColName);
        this.jTable2.setModel(jReqTableModel);
        this.jTable2.repaint();
        this.jTable2.updateUI();

        System.out.println("SoC GO button click.");
        String jOutputDirText = jTextField3.getText();
        String jScriptDirText = jTextField4.getText();

        if (jOutputDirText.isEmpty() || jScriptDirText.isEmpty()){
            JOptionPane.showMessageDialog(null, "Both two text field need to be filled in", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("jOutputDirText: " + jOutputDirText + "\njScriptDirText: " + jScriptDirText);

        String jFileReqTxt = jOutputDirText + System.getProperty("file.separator") + "dmif_freq_soc_monitor.txt";
        if(new File(jFileReqTxt).exists()) {
            System.out.println(jFileReqTxt + " exists");
        }
        else{
            JOptionPane.showMessageDialog(null, jFileReqTxt + " do not exist", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String jFileRetTxt = jOutputDirText + System.getProperty("file.separator") + "dmif_fret_soc_monitor.txt";
        if(new File(jFileRetTxt).exists()) {
            System.out.println(jFileRetTxt + " exists");
        }
        else{
            JOptionPane.showMessageDialog(null, jFileRetTxt + " do not exist", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String jFileScript = jOutputDirText + System.getProperty("file.separator") + "dmif_soc_monitor_analyzer.pl";
        if(new File(jFileScript).exists()) {
            System.out.println(jFileScript + " exists");
        }
        else{
            JOptionPane.showMessageDialog(null, jFileScript + " do not exist", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String lineToRead;
        try {
            String jCmd = "perl " + jFileScript + " -dir " + jOutputDirText;
            System.out.println(jCmd);
            Process jProc = Runtime.getRuntime().exec(jCmd);
            InputStream inputStream = jProc.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            if ((lineToRead = bufferedReader.readLine()) != null) {
                System.out.println(lineToRead);
                if(lineToRead.compareTo("PASSED") == 0){
                    System.out.println("Script running properly");
                }
                else{
                    System.out.println("Error: " + bufferedReader.toString());
                    JOptionPane.showMessageDialog(null, "Error: " + bufferedReader.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String jOutputPath = jOutputDirText + System.getProperty("file.separator") + "_out.tmp";
        File jReqOutFile = new File(jOutputPath);
        if(jReqOutFile.isFile() && jReqOutFile.exists()){
            InputStreamReader read = null;
            try {
                System.out.println(jOutputPath + " found");
                read = new InputStreamReader(new FileInputStream(jReqOutFile));
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    String[] strArray = lineTxt.split(" ");
                    if(strArray.length == 10){
                        Vector jReqElement = new Vector();
                        jReqElement.addElement(strArray[0]);
                        jReqElement.addElement(strArray[1]);
                        jReqElement.addElement("0x" + Integer.toHexString(Integer.parseInt(strArray[2])));
                        jReqElement.addElement(strArray[3]);
                        jReqElement.addElement(strArray[9]);
                        jReqElement.addElement(strArray[7]);
                        jReqElement.addElement(strArray[8]);

                        this.jDataSetSoC.DataSrc.addElement(jReqElement);
                    }
                    else{
                        System.out.println("Error: Data Format mismatch");
                        return ;
                    }
                }   read.close();

                this.jSetTableColWidth(0, 100, jTable2);
                this.jSetTableColWidth(1, 100, jTable2);
                this.jSetTableColWidth(2, 80, jTable2);
                this.jSetTableColWidth(3, 100, jTable2);
                this.jSetTableColWidth(4, 80, jTable2);

                this.jTable2.repaint();
                this.jTable2.updateUI();
                this.bSoCOpened = true;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    read.close();
                } catch (IOException ex) {
                    Logger.getLogger(DmifTransCheckerUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            System.out.println("Error: " + jOutputPath + " not found");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.bIPOpened && this.bSoCOpened){
            Vector vIPDataSet = new Vector();
            vIPDataSet.addAll(this.jDataSetIP.DataSrc);
            Vector vSoCDataSet = new Vector();
            vSoCDataSet.addAll(this.jDataSetSoC.DataSrc);
            
            for (int i = 0; i < vIPDataSet.size(); ){
                boolean bFound = false;
                Vector vIPElement = (Vector) vIPDataSet.elementAt(i);
                String vIPTag = (String) vIPElement.elementAt(2);
                String vIPData1 = (String) vIPElement.elementAt(5);
                String vIPData2 = (String) vIPElement.elementAt(6);
                for (int j = 0; j < vSoCDataSet.size();){
                    Vector vSoCElement = (Vector) vSoCDataSet.elementAt(j);
                    String vSoCTag = (String) vSoCElement.elementAt(2);
                    String vSoCData1 = (String) vSoCElement.elementAt(5);
                    String vSoCData2 = (String) vSoCElement.elementAt(6);
                    
                    if(vIPTag.equals(vSoCTag) && vIPData1.equals(vSoCData1) && vIPData2.equals(vSoCData2)){                        
                        vSoCDataSet.remove(j);
                        bFound = true;
                        break;
                    }
                    else{
                        j++;
                    }                    
                }
                if(bFound){
                    vIPDataSet.remove(i);
                    continue;
                }
                else{
                    i++;
                }
            }            
            DefaultTableModel jOutIPTableModel = new DefaultTableModel(vIPDataSet, this.jDataSetIP.ColName);
            this.jTable4.setModel(jOutIPTableModel);

            this.jSetTableColWidth(0, 100, jTable4);
            this.jSetTableColWidth(1, 100, jTable4);
            this.jSetTableColWidth(2, 80, jTable4);
            this.jSetTableColWidth(3, 100, jTable4);
            this.jSetTableColWidth(4, 80, jTable4);

            this.jTable4.repaint();
            this.jTable4.updateUI();
            
            DefaultTableModel jOutSoCTableModel = new DefaultTableModel(vSoCDataSet, this.jDataSetSoC.ColName);
            this.jTable3.setModel(jOutSoCTableModel);

            this.jSetTableColWidth(0, 100, jTable3);
            this.jSetTableColWidth(1, 100, jTable3);
            this.jSetTableColWidth(2, 80, jTable3);
            this.jSetTableColWidth(3, 100, jTable3);
            this.jSetTableColWidth(4, 80, jTable3);

            this.jTable3.repaint();
            this.jTable3.updateUI();
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Need to open analyze IP and SoC results first", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSetTableColWidth(int index, int width, JTable jTableIns){
        TableColumn Column = jTableIns.getColumnModel().getColumn(index);
        Column.setPreferredWidth(width);
        Column.setMaxWidth(width);
        Column.setMinWidth(width);
    }
    
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
            java.util.logging.Logger.getLogger(DmifTransCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DmifTransCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DmifTransCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DmifTransCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DmifTransCheckerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    private DataSet jDataSetIP;
    private DataSet jDataSetSoC;
    private boolean bIPOpened;
    private boolean bSoCOpened;
}
