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
public class JfUpdateFuncionario extends JFrame implements ActionListener {
    
    JButton btUpdate;
    JButton btVoltar;
    
    JTextField salario,nome_funcionario;
    JLabel label1,label2;
    
    public JfUpdateFuncionario(){
        super("Update Funcionario");
        
        Container update = getContentPane();
        
        btUpdate = new JButton("Update");
        btUpdate.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        salario = new JTextField();
        nome_funcionario = new JTextField();
        label1 = new JLabel("Salario");
        label2 = new JLabel("Nome Funcionario");
        
        update.setLayout(new GridLayout(3,1,3,3));
        update.add(label1);
        update.add(salario);
        update.add(label2);
        update.add(nome_funcionario);
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
			jfupdate.updatefuncionario(salario.getText(), nome_funcionario.getText());
		}
		if(e.getSource() == btVoltar){
			setVisible(false);
			JfMainFuncionario jfback = new JfMainFuncionario();
			jfback.setUndecorated(true);
			jfback.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfback.setVisible(true);
		}
    }
    
    public static void main (String [] args){
        new JfUpdateFuncionario();
    }
}