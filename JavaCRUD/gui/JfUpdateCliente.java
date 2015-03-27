package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import database.Cruds;

@SuppressWarnings("serial")
public class JfUpdateCliente extends JFrame implements ActionListener {
    
    JButton btUpdate;
    JButton btVoltar;
    
    JTextField tel_cliente,nome_cliente;
    JLabel label1,label2;
    
    public JfUpdateCliente(){
        super("Update Cliente");
        
        Container update = getContentPane();
        
        btUpdate = new JButton("Update");
        btUpdate.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        tel_cliente = new JTextField();
        nome_cliente = new JTextField();
        label1 = new JLabel("Tel Cliente");
        label2 = new JLabel("Nome Cliente");
        
        update.setLayout(new GridLayout(3,1,3,3));
        update.add(label1);
        update.add(tel_cliente);
        update.add(label2);
        update.add(nome_cliente);
        update.add(btUpdate);
        update.add(btVoltar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500,200);
        setResizable(false);
        setSize(300,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
		if(e.getSource() == btUpdate){
			Cruds jfupdate = new Cruds();
			jfupdate.updatecliente(tel_cliente.getText(), nome_cliente.getText());
		}
		if(e.getSource() == btVoltar){
			setVisible(false);
			JfMainCliente jfback = new JfMainCliente();
			jfback.setUndecorated(true);
			jfback.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfback.setVisible(true);
		}
    }
    
    public static void main (String [] args){
        new JfUpdateCliente();
    }
}