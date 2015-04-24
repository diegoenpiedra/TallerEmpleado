/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theopentutorials.jdbc.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class VentanaPrincipal extends JFrame implements ActionListener {
    private JButton boton;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField texto3;
    private JTextField texto4;
    private JTextField texto5;
    private JLabel palabra1;
    private JLabel palabra2;
    private JLabel palabra3;
    private JLabel palabra4;
    private JLabel palabra5;
    private JLabel palabra6;
    
    public VentanaPrincipal(){
        super("Ventana Empleado");
        
        this.definirVentana();
        
        this.setResizable(false);
        this.setSize(350,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setVisible(true);     
    }
    
    public void definirVentana(){
        this.setLayout (new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        boton = new JButton("ENVIAR");
        
        texto1 = new JTextField(20);
        texto2 = new JTextField(20);
        texto3 = new JTextField(20);
        texto4 = new JTextField(20);
        texto5 = new JTextField(20);
     
        palabra1 = new JLabel("INGRESAR DATOS");
        palabra2 = new JLabel("ID");
        palabra3 = new JLabel("Nombre");
        palabra4 = new JLabel("Fecha ");
        palabra5 = new JLabel("Salario");
        palabra6 = new JLabel("ID dep");
        
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(palabra1,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(palabra2,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(texto1,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(palabra3,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(texto2,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(palabra4,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(texto3,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(palabra5,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(texto4,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(palabra6,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(texto5,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        add(boton,gbc);
        
   
    }

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton){
            palabra1.setText(texto1.getText());
        }
    }
    
}