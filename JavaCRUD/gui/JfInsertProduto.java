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
public class JfInsertProduto extends JFrame implements ActionListener {
    
    JButton btInserir;
    JButton btVoltar;
    
    JTextField cod_grupo,nome_produto,valor_compra;
    JLabel label1,label2,label3;
    
    public JfInsertProduto(){
        super("Insert Produto");
        
        Container insert = getContentPane();
        
        btInserir = new JButton("Inserir");
        btInserir.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        cod_grupo = new JTextField();
        nome_produto = new JTextField();
        valor_compra = new JTextField();
        
        label1 = new JLabel("Cod Grupo");
        label2 = new JLabel("Nome Produto");
        label3 = new JLabel("Valor Compra");
        
        insert.setLayout(new GridLayout(4,1,3,3));
        insert.add(label1);
        insert.add(cod_grupo);
        insert.add(label2);
        insert.add(nome_produto);
        insert.add(label3);
        insert.add(valor_compra);
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
			jfinsert.insertproduto(Integer.parseInt(cod_grupo.getText()), nome_produto.getText(),valor_compra.getText());
		}
		if(e.getSource() == btVoltar){
			setVisible(false);
			JfMainProduto jfback = new JfMainProduto();
			jfback.setUndecorated(true);
			jfback.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfback.setVisible(true);
		}
    }
    
    public static void main (String [] args){
        new JfInsertProduto();
    }
}