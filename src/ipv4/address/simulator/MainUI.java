/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipv4.address.simulator;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author PRANAY
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeading = new javax.swing.JPanel();
        labelHeading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelChooseClass = new javax.swing.JLabel();
        comboboxClass = new javax.swing.JComboBox<>();
        buttonSubmit = new javax.swing.JButton();
        labelNetid = new javax.swing.JLabel();
        panelBottom = new javax.swing.JPanel();
        labelIcon1 = new javax.swing.JLabel();
        labelIcon2 = new javax.swing.JLabel();
        labelIcon3 = new javax.swing.JLabel();
        labelIP1 = new javax.swing.JLabel();
        labelSubnet1 = new javax.swing.JLabel();
        labelIP2 = new javax.swing.JLabel();
        labelSubnet2 = new javax.swing.JLabel();
        labelIP3 = new javax.swing.JLabel();
        labelSubnet3 = new javax.swing.JLabel();
        textIP1 = new javax.swing.JTextField();
        textIP2 = new javax.swing.JTextField();
        textIP3 = new javax.swing.JTextField();
        textIP4 = new javax.swing.JTextField();
        textSubnet1 = new javax.swing.JTextField();
        textSubnet2 = new javax.swing.JTextField();
        textSubnet3 = new javax.swing.JTextField();
        textSubnet4 = new javax.swing.JTextField();
        textIP5 = new javax.swing.JTextField();
        textIP6 = new javax.swing.JTextField();
        textIP7 = new javax.swing.JTextField();
        textIP8 = new javax.swing.JTextField();
        textSubnet5 = new javax.swing.JTextField();
        textSubnet6 = new javax.swing.JTextField();
        textSubnet7 = new javax.swing.JTextField();
        textSubnet8 = new javax.swing.JTextField();
        textIP9 = new javax.swing.JTextField();
        textIP10 = new javax.swing.JTextField();
        textIP11 = new javax.swing.JTextField();
        textIP12 = new javax.swing.JTextField();
        textSubnet9 = new javax.swing.JTextField();
        textSubnet10 = new javax.swing.JTextField();
        textSubnet11 = new javax.swing.JTextField();
        textSubnet12 = new javax.swing.JTextField();
        labelResult1 = new javax.swing.JLabel();
        labelResult2 = new javax.swing.JLabel();
        labelResult3 = new javax.swing.JLabel();
        buttonEvaluate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulator");
        setBackground(java.awt.SystemColor.window);
        setResizable(false);

        labelHeading.setBackground(new java.awt.Color(255, 255, 255));
        labelHeading.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        labelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeading.setText("IPv4 Addressing");

        javax.swing.GroupLayout panelHeadingLayout = new javax.swing.GroupLayout(panelHeading);
        panelHeading.setLayout(panelHeadingLayout);
        panelHeadingLayout.setHorizontalGroup(
            panelHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelHeadingLayout.setVerticalGroup(
            panelHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelChooseClass.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelChooseClass.setText("Choose the Class in which IP Addressing is to be done  :");

        comboboxClass.setFont(new java.awt.Font("Bradley Hand ITC", 1, 12)); // NOI18N
        comboboxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select One--", "Class A", "Class B", "Class C" }));

        buttonSubmit.setFont(new java.awt.Font("Bradley Hand ITC", 1, 12)); // NOI18N
        buttonSubmit.setText("Submit");

        labelNetid.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelNetid.setText("Network ID for selected Class is : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboboxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buttonSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(labelNetid, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChooseClass)
                    .addComponent(comboboxClass)
                    .addComponent(buttonSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNetid)
                .addGap(14, 14, 14))
        );

        labelIcon1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipv4/address/simulator/pcicon.jpg"))); // NOI18N
        labelIcon1.setText(" PC1 :");

        labelIcon2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipv4/address/simulator/pcicon.jpg"))); // NOI18N
        labelIcon2.setText(" PC2 :");

        labelIcon3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipv4/address/simulator/pcicon.jpg"))); // NOI18N
        labelIcon3.setText(" PC3 :");

        labelIP1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelIP1.setText("IPv4 Address :");

        labelSubnet1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelSubnet1.setText("Subnet Mask :");

        labelIP2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelIP2.setText("IPv4 Address :");

        labelSubnet2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelSubnet2.setText("Subnet Mask :");

        labelIP3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelIP3.setText("IPv4 Address :");

        labelSubnet3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelSubnet3.setText("Subnet Mask :");

        textIP1.setText("jTextField1");

        textIP2.setText("jTextField2");

        textIP3.setText("jTextField3");

        textIP4.setText("jTextField4");

        textSubnet1.setText("jTextField5");

        textSubnet2.setText("jTextField6");

        textSubnet3.setText("jTextField7");

        textSubnet4.setText("jTextField8");

        textIP5.setText("jTextField9");

        textIP6.setText("jTextField10");

        textIP7.setText("jTextField11");

        textIP8.setText("jTextField12");

        textSubnet5.setText("jTextField13");

        textSubnet6.setText("jTextField14");

        textSubnet7.setText("jTextField15");

        textSubnet8.setText("jTextField16");

        textIP9.setText("jTextField17");

        textIP10.setText("jTextField18");

        textIP11.setText("jTextField19");

        textIP12.setText("jTextField20");

        textSubnet9.setText("jTextField21");

        textSubnet10.setText("jTextField22");

        textSubnet11.setText("jTextField23");

        textSubnet12.setText("jTextField24");

        labelResult1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelResult1.setText("RESULT :");

        labelResult2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelResult2.setText("RESULT :");

        labelResult3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        labelResult3.setText("RESULT :");

        buttonEvaluate.setFont(new java.awt.Font("Bradley Hand ITC", 1, 12)); // NOI18N
        buttonEvaluate.setText("Evaluate");

        javax.swing.GroupLayout panelBottomLayout = new javax.swing.GroupLayout(panelBottom);
        panelBottom.setLayout(panelBottomLayout);
        panelBottomLayout.setHorizontalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addComponent(labelIcon1)
                        .addGap(18, 18, 18)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addComponent(labelSubnet1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addComponent(labelIP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelResult3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(labelResult2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelResult1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addComponent(labelIcon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addComponent(labelIP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addComponent(labelSubnet2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSubnet8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonEvaluate)
                        .addGroup(panelBottomLayout.createSequentialGroup()
                            .addComponent(labelIcon3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBottomLayout.createSequentialGroup()
                                    .addComponent(labelIP3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textIP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textIP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textIP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textIP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelBottomLayout.createSequentialGroup()
                                    .addComponent(labelSubnet3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textSubnet9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textSubnet10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textSubnet11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textSubnet12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        panelBottomLayout.setVerticalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLayout.createSequentialGroup()
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIcon1)
                            .addComponent(labelResult1)))
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIP1)
                            .addComponent(textIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubnet1)
                            .addComponent(textSubnet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelIcon2))
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelIP2)
                                    .addComponent(textIP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(labelResult2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubnet2)
                            .addComponent(textSubnet5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(labelIcon3))
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelIP3)
                                    .addComponent(textIP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(labelResult3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubnet3)
                            .addComponent(textSubnet9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSubnet12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(buttonEvaluate)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEvaluate;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JComboBox<String> comboboxClass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelChooseClass;
    private javax.swing.JLabel labelHeading;
    private javax.swing.JLabel labelIP1;
    private javax.swing.JLabel labelIP2;
    private javax.swing.JLabel labelIP3;
    private javax.swing.JLabel labelIcon1;
    private javax.swing.JLabel labelIcon2;
    private javax.swing.JLabel labelIcon3;
    private javax.swing.JLabel labelNetid;
    private javax.swing.JLabel labelResult1;
    private javax.swing.JLabel labelResult2;
    private javax.swing.JLabel labelResult3;
    private javax.swing.JLabel labelSubnet1;
    private javax.swing.JLabel labelSubnet2;
    private javax.swing.JLabel labelSubnet3;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelHeading;
    private javax.swing.JTextField textIP1;
    private javax.swing.JTextField textIP10;
    private javax.swing.JTextField textIP11;
    private javax.swing.JTextField textIP12;
    private javax.swing.JTextField textIP2;
    private javax.swing.JTextField textIP3;
    private javax.swing.JTextField textIP4;
    private javax.swing.JTextField textIP5;
    private javax.swing.JTextField textIP6;
    private javax.swing.JTextField textIP7;
    private javax.swing.JTextField textIP8;
    private javax.swing.JTextField textIP9;
    private javax.swing.JTextField textSubnet1;
    private javax.swing.JTextField textSubnet10;
    private javax.swing.JTextField textSubnet11;
    private javax.swing.JTextField textSubnet12;
    private javax.swing.JTextField textSubnet2;
    private javax.swing.JTextField textSubnet3;
    private javax.swing.JTextField textSubnet4;
    private javax.swing.JTextField textSubnet5;
    private javax.swing.JTextField textSubnet6;
    private javax.swing.JTextField textSubnet7;
    private javax.swing.JTextField textSubnet8;
    private javax.swing.JTextField textSubnet9;
    // End of variables declaration//GEN-END:variables
}
