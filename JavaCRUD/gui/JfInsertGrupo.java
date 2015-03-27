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
public class JfInsertGrupo extends JFrame implements ActionListener {
    
    JButton btInserir;
    JButton btVoltar;
    
    JTextField nome_grupo;
    JLabel label1;
    
    public JfInsertGrupo(){
        super("Insert Grupo");
        
        Container insert = getContentPane();
        
        btInserir = new JButton("Inserir");
        btInserir.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        nome_grupo = new JTextField();
        label1 = new JLabel("Nome Grupo");
        
        insert.setLayout(new GridLayout(2,1,3,3));
        insert.add(label1);
        insert.add(nome_grupo);
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
			jfinsert.insertgrupo(nome_grupo.getText());
		}
		if(e.getSource() == btVoltar){
			setVisible(false);
			JfMainGrupo jfback = new JfMainGrupo();
			jfback.setUndecorated(true);
			jfback.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfback.setVisible(true);
		}
    }
    
    public static void main (String [] args){
        new JfInsertGrupo();
    }
}