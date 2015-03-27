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
public class JfInsertFuncionario extends JFrame implements ActionListener {
    
    JButton btInserir;
    JButton btVoltar;
    
    JTextField cod_cidade,nome_funcionario,salario;
    JLabel label1,label2,label3;
    
    public JfInsertFuncionario(){
        super("Insert Funcionario");
        
        Container insert = getContentPane();
        
        btInserir = new JButton("Inserir");
        btInserir.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        cod_cidade = new JTextField();
        nome_funcionario = new JTextField();
        salario = new JTextField();
        
        label1 = new JLabel("Cod Cidade");
        label2 = new JLabel("Nome Funcionario");
        label3 = new JLabel("salario");
        
        insert.setLayout(new GridLayout(4,1,3,3));
        insert.add(label1);
        insert.add(cod_cidade);
        insert.add(label2);
        insert.add(nome_funcionario);
        insert.add(label3);
        insert.add(salario);
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
			jfinsert.insertfuncionario(Integer.parseInt(cod_cidade.getText()), nome_funcionario.getText(),salario.getText());
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
        new JfInsertFuncionario();
    }
}