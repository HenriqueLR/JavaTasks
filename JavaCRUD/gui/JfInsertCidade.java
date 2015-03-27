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
public class JfInsertCidade extends JFrame implements ActionListener {
    
    JButton btInserir;
    JButton btVoltar;
    
    JTextField sigla_uf,nome_cidade;
    JLabel label1,label2;
    
    public JfInsertCidade(){
        super("Insert Cidade");
        
        Container insert = getContentPane();
        
        btInserir = new JButton("Inserir");
        btInserir.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        sigla_uf = new JTextField();
        nome_cidade = new JTextField();
        label1 = new JLabel("Sigla Uf");
        label2 = new JLabel("Nome Cidade");
        
        insert.setLayout(new GridLayout(3,1,3,3));
        insert.add(label1);
        insert.add(sigla_uf);
        insert.add(label2);
        insert.add(nome_cidade);
        insert.add(btInserir);
        insert.add(btVoltar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500,200);
        setResizable(false);
        setSize(300,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
		if(e.getSource() == btInserir){
			Cruds jfinsert = new Cruds();
			jfinsert.insertcidade(sigla_uf.getText(), nome_cidade.getText());
		}
		if(e.getSource() == btVoltar){
			setVisible(false);
			JfMainCidade jfback = new JfMainCidade();
			jfback.setUndecorated(true);
			jfback.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfback.setVisible(true);
		}
    }
    
    public static void main (String [] args){
        new JfInsertCidade();
    }
}