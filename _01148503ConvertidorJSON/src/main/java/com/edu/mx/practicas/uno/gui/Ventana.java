package com.edu.mx.practicas.uno.gui;
import com.edu.mx.practicas.uno.convertidor.Convertidor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    public Ventana()
    {
        new JFrame();//creating instance of JFrame
        JButton b1 = new JButton("Convertir");
        final JTextArea t1 = new JTextArea();
        t1.setBounds(10,100,200, 350);
        t1.setLineWrap(true);

        final JTextArea t2 = new JTextArea();
        t2.setBounds(500,100,200, 350);
        t2.setLineWrap(true);


        add(t1);//adding button in JFrame
        add(b1);
        b1.setBounds(325, 300, 100, 30);
        add(t2);//adding button in JFrame

        String[] elementos = {"XML", "JAVA"};
        final JComboBox combo = new JComboBox(elementos);
        combo.setBounds(80, 450, 100, 25);
        add(combo);

        setSize(750,550);//400 width and 500 height
        setLocation(400, 150);
        setLayout(null);//using no layout managers
        setVisible(true);//making the frame visible
        setDefaultCloseOperation(3);
        // Agregar Listeer
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Convertidor con = new Convertidor();
                if(!(t1.getText().trim().length() == 0))
                {
                    if(combo.getSelectedIndex() == 1) {
                        t2.setText(con.convertirClaseToJson(t1.getText().toString()));
                        t1.setText("");
                        System.out.println("JAVA");
                    } else
                    {
                        t2.setText(con.convertirXmlToJson(t1.getText().toString()));
                        t1.setText("");
                        System.out.println("XML");
                    }
                } else {
                    //JOptionPane.showMessageDialog(this, "No hay texto","Texto vacio", JOptionPane.WARNING_MESSAGE);
                }

                /**

                 */
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

    }
}
