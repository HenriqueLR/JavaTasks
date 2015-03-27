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
public class JfDeleteCidade extends JFrame implements ActionListener {
    
    JButton btDeletar;
    JButton btVoltar;
    
    JTextField sigla_uf;
    JLabel label1;
    
    public JfDeleteCidade(){
        super("Deletar Cidade");
        
        Container delete = getContentPane();
        
        btDeletar = new JButton("Deletar");
        btDeletar.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        sigla_uf = new JTextField();
        label1 = new JLabel("Sigla Uf");
        
        delete.setLayout(new GridLayout(2,1,3,3));
        delete.add(label1);
        delete.add(sigla_uf);
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
			jfdelete.deletecidade(sigla_uf.getText());
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
        new JfDeleteCidade();
    }
}