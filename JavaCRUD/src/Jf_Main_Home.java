package src;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import gui.*;

@SuppressWarnings("serial")
public class Jf_Main_Home extends JFrame implements ActionListener {
	
	JButton btCliente;
	JButton btCidade;
	JButton btFuncionario; 
	JButton btGrupo;
	JButton btProduto;
	
	public Jf_Main_Home(){
		super("Home");
        
        Container home = getContentPane();
        
        btCliente = new JButton("Cliente");
        btCliente.addActionListener(this);
        btCidade = new JButton("Cidade");
        btCidade.addActionListener(this);
        btFuncionario = new JButton("Funcionario");
        btFuncionario.addActionListener(this);
        btGrupo = new JButton("Grupo");
        btGrupo.addActionListener(this);
        btProduto = new JButton("Produto");
        btProduto.addActionListener(this);
		
        home.setLayout(new GridLayout(5,1,3,3));
        home.add(btCidade);
        home.add(btCliente);
        home.add(btFuncionario);
        home.add(btGrupo);
        home.add(btProduto);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
        setLocation(500,200);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btCliente){
			setVisible(false);
			JfMainCliente jfmain = new JfMainCliente();
			jfmain.setUndecorated(true);
			jfmain.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfmain.setVisible(true);
			setLocation(500,200);
		}
		if(e.getSource() == btCidade){
			setVisible(false);
			JfMainCidade jfmain = new JfMainCidade();
			jfmain.setUndecorated(true);
			jfmain.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfmain.setVisible(true);
			setLocation(500,200);
		}
		if(e.getSource() == btFuncionario){
			setVisible(false);
			JfMainFuncionario jfmain = new JfMainFuncionario();
			jfmain.setUndecorated(true);
			jfmain.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfmain.setVisible(true);
			setLocation(500,200);
		}
		if(e.getSource() == btGrupo){
			setVisible(false);
			JfMainGrupo jfmain = new JfMainGrupo();
			jfmain.setUndecorated(true);
			jfmain.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfmain.setVisible(true);
			setLocation(500,200);
		}
		if(e.getSource() == btProduto){
			setVisible(false);
			JfMainProduto jfmain = new JfMainProduto();
			jfmain.setUndecorated(true);
			jfmain.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfmain.setVisible(true);
			setLocation(500,200);
		}
	}
	public static void main(String args []){
		new Jf_Main_Home();
	}
}
