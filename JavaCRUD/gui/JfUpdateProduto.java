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
public class JfUpdateProduto extends JFrame implements ActionListener {
    
    JButton btUpdate;
    JButton btVoltar;
    
    JTextField valor_compra,nome_produto;
    JLabel label1,label2;
    
    public JfUpdateProduto(){
        super("Update Produto");
        
        Container update = getContentPane();
        
        btUpdate = new JButton("Update");
        btUpdate.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        valor_compra = new JTextField();
        nome_produto = new JTextField();
        label1 = new JLabel("Valor Compra");
        label2 = new JLabel("Nome Produto");
        
        update.setLayout(new GridLayout(3,1,3,3));
        update.add(label1);
        update.add(valor_compra);
        update.add(label2);
        update.add(nome_produto);
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
			jfupdate.updateproduto(valor_compra.getText(), nome_produto.getText());
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
        new JfUpdateProduto();
    }
}