/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


/**
 *
 * @author soryl
 */
public class Graficos1 extends JFrame {
    
    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    private JLabel labelresta;
    private JTextField dato1;
    private JTextField dato2;
    private JButton btncalcular;
    
    // Componentes de resta
    private JLabel resultresta;
    private JLabel label1resta;
    private JLabel label2resta;
    private JLabel labelrestaresa;
    private JTextField dato1rest;
    private JTextField dato2rest;
    private JButton btncalcularresta;
    //Mutiplicaion
    private JLabel resultmulti;
    private JLabel label1multi;
    private JLabel label2multi;
    private JLabel labelrestamulti;
    private JTextField dato1multi;
    private JTextField dato2multi;
    private JButton btncalcularmulti;

    public Graficos1() {
        setTitle("Salvage Valtryek Rashas Nexus-q Yell-q+Qauake-q,7 vs Magma Ifritor Ciquex Yaggy-q+Wave, 10 "); //titulo de la ventana
             // alto ancho
        setSize(550, 300); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componenetes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");
                
        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        btncalcular = new JButton("Calcular\n");
        // componentes resta
        labelrestaresa = new JLabel ("Resta");
        resultresta = new JLabel("Resultado");
        label1resta = new JLabel("Valor 1");
        label2resta = new JLabel("Valor 2");
        labelrestaresa = new JLabel("Valor 1");
                
        dato1rest = new JTextField(5);
        dato2rest = new JTextField(5);
        btncalcularresta = new JButton("Calcular resta");
        
        
    }
    
    public void Componentes(Graficos1 ventana){
                 
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btncalcular);      
        ventana.add(result);
        
        ventana.add(labelrestaresa);

        btncalcular.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btncalcularActionPerformed(evt);
            }
        });   
        
        btncalcular.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btncalcularActionPerformed2(evt);
            }
        });
        ventana.add(label1resta);
        ventana.add(dato1rest);
        ventana.add(label2resta);
        ventana.add(dato2rest);
        ventana.add(btncalcularresta);      
        ventana.add(resultresta);

        btncalcularresta.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evta) { // metodo del evento
                btncalcularActionPerformedresta(evta);
            }
        });   
        
        btncalcularresta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evta) { // metodo del evento
                btncalcularActionPerformed2resta(evta);
            }
        });
         
    }
    
    private void btncalcularActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
    
    private void btncalcularActionPerformed2(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado Mouse: " + re);
    }
    private void btncalcularActionPerformedresta(ActionEvent evta) {
        int v1s = Integer.parseInt(dato1rest.getText()); 
        int v2s = Integer.parseInt(dato2rest.getText());
        int res = v1s-v2s;
        resultresta.setText("Resultado: " + res);
    }
    
    private void btncalcularActionPerformed2resta (MouseEvent evta) {
        int v1s = Integer.parseInt(dato1rest.getText()); 
        int v2s = Integer.parseInt(dato2rest.getText());
        int res = v1s-v2s;
        resultresta.setText("Resultado Mouse: " + res);
    }
    
    public static void main(String[] args) {
        Graficos1 ventana = new Graficos1();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        ventana.setBackground(Color.BLACK);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true); //activar la ventana 
            
       
    }
    
    
}




