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
public class JfUpdateGrupo extends JFrame implements ActionListener {
    
    JButton btUpdate;
    JButton btVoltar;
    
    JTextField cod_grupo,nome_grupo;
    JLabel label1,label2;
    
    public JfUpdateGrupo(){
        super("Update Grupo");
        
        Container update = getContentPane();
        
        btUpdate = new JButton("Update");
        btUpdate.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        cod_grupo = new JTextField();
        nome_grupo = new JTextField();
        label1 = new JLabel("Cod Grupo");
        label2 = new JLabel("Nome Grupo");
        
        update.setLayout(new GridLayout(3,1,3,3));
        update.add(label1);
        update.add(cod_grupo);
        update.add(label2);
        update.add(nome_grupo);
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
			jfupdate.updategrupo(nome_grupo.getText(), Integer.parseInt(cod_grupo.getText()));
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
        new JfUpdateGrupo();
    }
}