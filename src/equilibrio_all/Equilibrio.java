// This was one of my projects on JAVA
//@author EdgarRND
package equilibrio_all;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
import equilibrio_all.WebInf;

public class Equilibrio extends JFrame implements ActionListener{
 private JButton bot1, bot2, bot3;
 private JButton bot4, bot5, bot6;
 private JLabel label1, label2, label3, label4, label5;
 private JLabel label6, label7, label8, labelsub8, label9, label10;
 private JLabel label11, label12, label13, label14, label15;
 private JTextField texton1, texton2, texton3;
 private JTextField texton4, texton5, texton6;
 private ImageIcon img_f, img_f2, img_d;
 private JMenuBar bar1;
 private JMenu menu1, menu2, menu3, menu4;
 private JMenuItem menu1_sub1, menu1_sub2, menu1_sub3;
 private JMenuItem menu1_sub4;
 private JMenuItem menu4_sub1;

 public Equilibrio(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setIconImage(new ImageIcon(getClass().getResource("images\\logoupes.png")).getImage());
  setTitle("Vela en Equilibrio - 1.1");
  bar1 = new JMenuBar();
  setJMenuBar(bar1);

  menu1 = new JMenu("Archivo");
  bar1.add(menu1);

  menu1_sub1 = new JMenuItem("Archivo");
  menu1.add(menu1_sub1);

  menu1_sub2 = new JMenuItem("Abrir");
  menu1.add(menu1_sub2);

  menu1_sub3 = new JMenuItem("Reiniciar");
  menu1_sub3.addActionListener(this);
  menu1.add(menu1_sub3);

  menu1_sub4 = new JMenuItem("Salir");
  menu1_sub4.addActionListener(this);
  menu1.add(menu1_sub4);

  menu2 = new JMenu("Editar");
  bar1.add(menu2);

  menu3 = new JMenu("Enlaces");
  bar1.add(menu3);
  
  menu4 = new JMenu("Informacion");
  bar1.add(menu4);

  menu4_sub1 = new JMenuItem("Creado por Edgar Renderos");
  menu4.add(menu4_sub1);
  menu4_sub1.addActionListener(this);

  label1 = new JLabel("Proyecto - Vela en Equilibrio");
  label1.setFont(new Font("Impact", 0, 40));
  label1.setBounds(320,0,500,50);
  add(label1);

  label2 = new JLabel("Realize las medidas solicitadas, luego ingreselas");
  label2.setFont(new Font("Century Gothic", 1, 16));
  label2.setBounds(60,50,600,100);
  add(label2);
  
  label3 = new JLabel("Altura de la vela (cm)");
  label3.setFont(new Font("Century Gothic", 1, 14));
  label3.setBounds(15,110,150,50);
  add(label3);

  label4 = new JLabel("Diametro de la vela (cm)");
  label4.setFont(new Font("Century Gothic", 1, 14));
  label4.setBounds(15,142,200,50);
  add(label4);
  
  label5 = new JLabel();
  label5.setBounds(160,180,300,50);
  label5.setFont(new Font("Century Gothic", 1, 16));
  label5.setForeground(new Color(111,34,17));
  add(label5);

  label6 = new JLabel("Se establece que F = M.g");
  label6.setBounds(170,245,200,30);
  label6.setFont(new Font("Century Gothic", 1, 16));
  add(label6);

  label7 = new JLabel("Introduce la masa perdida por la vela en ambos extremos (g)");
  label7.setBounds(30,270,500,50);
  label7.setFont(new Font("Century Gothic", 1, 16));
  add(label7);

  label8 = new JLabel();
  label8.setBounds(100,360,350,30);
  label8.setFont(new Font("Century Gothic", 1, 16));
  label8.setForeground(new Color(111,34,17));
  add(label8);

  labelsub8 = new JLabel();
  labelsub8.setBounds(105,380,300,30);
  labelsub8.setFont(new Font("Century Gothic", 1, 16));
  labelsub8.setForeground(new Color(111,34,17));
  add(labelsub8);

  label9 = new JLabel();
  label9.setBounds(130,410,300,30);
  label9.setFont(new Font("Century Gothic", 1, 16));
  label9.setForeground(new Color(111,34,17));
  add(label9);

  label10 = new JLabel("Se establece que");
  label10.setBounds(675,320,250,30);
  label10.setFont(new Font("Century Gothic", 1, 16));
  add(label10);

  ImageIcon img_f = new ImageIcon("C:\\Users\\Edgar\\Documents\\Homeworks\\Java_C2\\Equilibrio_1.1\\src\\equilibrio_all\\images\\f_general.jpg");
  label11 = new JLabel(img_f);
  label11.setBounds(650,320,200,100);
  add(label11);

  label12 = new JLabel("Teniendo la vela divida en dos partes se establece que una sera negativa y otra positiva");
  label12.setBounds(480,385,600,30);
  label12.setFont(new Font("Century Gothic", 1, 14));
  add(label12);

  ImageIcon img_f2 = new ImageIcon("C:\\Users\\Edgar\\Documents\\Homeworks\\Java_C2\\Equilibrio_1.1\\src\\equilibrio_all\\images\\f2.png");
  label13 = new JLabel(img_f2);
  label13.setBounds(685,370,120,120);
  add(label13);

  ImageIcon img_d = new ImageIcon("C:\\Users\\Edgar\\Documents\\Homeworks\\Java_C2\\Equilibrio_1.1\\src\\equilibrio_all\\images\\succed_2a.gif");
  label15 = new JLabel(img_d);
  label15.setBounds(500,40,500,300);
  label15.setBackground(new Color(255,0,0));
  add(label15);

  label14 = new JLabel();
  label14.setBounds(600,450,550,30);
  label14.setFont(new Font("Century Gothic", 1, 16));
  label14.setForeground(new Color(111,34,17));
  add(label14);

  label15 = new JLabel();
  label15.setBounds(675,470,550,30);
  label15.setFont(new Font("Century Gothic", 1, 16));
  label15.setForeground(new Color(111,34,17));
  add(label15);
   
  bot1 = new JButton("Aceptar");
  bot1.setBounds(50,190,100,30);
  add(bot1);
  bot1.addActionListener(this);

  bot2 = new JButton("Aceptar");
  bot2.setBounds(275,320,100,30);
  add(bot2);
  bot2.addActionListener(this);
  
  bot3 = new JButton("Aceptar");
  bot3.setBounds(700,515,100,30);
  add(bot3);
  bot3.addActionListener(this);

  texton1 = new JTextField();
  texton1.setBounds(200,120,200,30);
  texton1.setFont(new Font("Andale Mono", 1, 14));
  add(texton1);

  texton2 = new JTextField();
  texton2.setBounds(200,155,200,30);
  texton2.setFont(new Font("Andale Mono", 1, 14));
  add(texton2);
  
  texton3 = new JTextField();
  texton3.setBounds(110,320,150,30);
  texton3.setFont(new Font("Andale Mono", 1, 14));
  add(texton3);
 }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == menu1_sub3){
      texton1.setText(null);
      texton2.setText(null);
      texton3.setText(null);
      
      label5.setText(null);
      label8.setText(null);
      labelsub8.setText(null);
      label9.setText(null);
      label14.setText(null);
      label15.setText(null);
   }

   if(e.getSource() == menu1_sub4){
    System.exit(0);
   }

   if(e.getSource() == menu4_sub1){
       WebInf link = new WebInf();
       link.setVisible(true);
       //JOptionPane.showMessageDialog(null, "Creado por Saul Edgardo Renderos Alvarado");
       }

   if(e.getSource() == bot1){
   String h1 = texton1.getText();
   double h = Double.parseDouble(h1);
   double hr = h / 2;
   String x1 = texton2.getText();
   double x = Double.parseDouble(x1);
   double xr = x / 2;
   
   label5.setText("Centro de Gravedad: " + hr + "cm , " + xr + "cm");
  }

  if(e.getSource() == bot2){
   DecimalFormat f1 = new DecimalFormat("##.#");
   DecimalFormat f2 = new DecimalFormat("##.######");
   String g1 = texton3.getText();
   double g = Double.parseDouble(g1);
   double gr = g / 1000;
   double n = gr * 9.81;
   String nr = f1.format(n * 100);
   
   
   label8.setText("Fuerza sumada por la perdida de masa");
   labelsub8.setText("de ambos lados es igual a: " + n + "N");
   label9.setText("Reexpresado como: " + nr + "x10^-3 N");
  }

  if(e.getSource() == bot3){
  DecimalFormat df = new DecimalFormat("#.###");
   String h1 = texton1.getText();
   double h = Double.parseDouble(h1);
   String hr2 = df.format(h / 2);
   double hr2_n = Double.parseDouble(hr2);

   String g1 = texton3.getText();
   double g = Double.parseDouble(g1);
   double gr = g * 0.001;
   double n2 = gr * 9.81;

   String br = df.format(hr2_n * n2);
  

   label14.setText("T1 = " + br + "x10^2 N   y   T2 = " +"-"+ br + "x10^2 N");
   label15.setText(br + " + " + "-" + br + "= 0 N");
  }
 }
 
 public static void main(String args[]){
  Equilibrio dato1 = new Equilibrio();
  dato1.setBounds(0,0,1100,640);
  dato1.setVisible(true);
  dato1.setResizable(true);
  dato1.setLocationRelativeTo(null);
  dato1.getContentPane().setBackground(new Color(255,255,255));
 }
}