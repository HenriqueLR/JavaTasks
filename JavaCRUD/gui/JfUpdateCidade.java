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
public class JfUpdateCidade extends JFrame implements ActionListener {
    
    JButton btUpdate;
    JButton btVoltar;
    
    JTextField nome_cidade,sigla_uf;
    JLabel label1,label2;
    
    public JfUpdateCidade(){
        super("Update Cidade");
        
        Container update = getContentPane();
        
        btUpdate = new JButton("Update");
        btUpdate.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        nome_cidade = new JTextField();
        sigla_uf = new JTextField();
        label1 = new JLabel("Nome Cidade");
        label2 = new JLabel("Sigla Uf");
        
        update.setLayout(new GridLayout(3,1,3,3));
        update.add(label1);
        update.add(nome_cidade);
        update.add(label2);
        update.add(sigla_uf);
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
			jfupdate.updatecidade(nome_cidade.getText(), sigla_uf.getText());
		}
		if(e.getSource() == btVoltar){
			setVisible(false);
			JfMainCidade jfmain = new JfMainCidade();
			jfmain.setUndecorated(true);
			jfmain.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfmain.setVisible(true);
		}
    }
    
    public static void main (String [] args){
        new JfUpdateCidade();
    }
}