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
public class JfDeleteGrupo extends JFrame implements ActionListener {
    
    JButton btDeletar;
    JButton btVoltar;
    
    JTextField nome_grupo;
    JLabel label1;
    
    public JfDeleteGrupo(){
        super("Deletar Grupo");
        
        Container delete = getContentPane();
        
        btDeletar = new JButton("Deletar");
        btDeletar.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        nome_grupo = new JTextField();
        label1 = new JLabel("Nome Grupo");
        
        delete.setLayout(new GridLayout(2,1,3,3));
        delete.add(label1);
        delete.add(nome_grupo);
        delete.add(btDeletar);
        delete.add(btVoltar);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500,200);
        setResizable(false);
        setSize(300,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
		if(e.getSource() == btDeletar){
			Cruds jfdelete = new Cruds();
			jfdelete.deletegrupo(nome_grupo.getText());
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
        new JfDeleteGrupo();
    }
}