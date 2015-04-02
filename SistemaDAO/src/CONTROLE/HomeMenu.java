
package CONTROLE;

import VISAO.ClienteHome;
import VISAO.ClienteSearch;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HomeMenu extends JFrame {
    private JMenu jMenu3,jMenu4;
    private JMenuItem jMenuItem2, jMenuItem4,jMenuItem3;
    private JMenuBar jMenuBar1;
    
    public HomeMenu() 
    {
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setTitle("Sistema de cadastros e consultas");
        this.setSize(700, 700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jMenuBar1 = new JMenuBar();
        setJMenuBar(jMenuBar1);
        
        jMenu3 = new JMenu("Cadastro");
        jMenu4 = new JMenu("Opcoes");
        
        jMenuItem2 = new JMenuItem();
        jMenuItem2.setText("Cadastro de Clientes");
        jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });    
        jMenu3.add(jMenuItem2);
        
        jMenuItem4 = new JMenuItem();
        jMenuItem4.setText("Consulta de Clientes");
        jMenuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);
        
        jMenuItem3 = new JMenuItem();
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });       
        jMenu4.add(jMenuItem3);
        
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);
    }
    private void jMenuItem2ActionPerformed(ActionEvent evt) {                                           
            JFrame f = new ClienteHome();
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setVisible(true);
    }  
  
    private void jMenuItem3ActionPerformed(ActionEvent evt) {                                           
            System.exit(0);          
    }                                          

    private void jMenuItem4ActionPerformed(ActionEvent evt) {                                           
            JFrame f = new ClienteSearch();
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setVisible(true);
    }
    public static void main(String[] args) 
    {
        JFrame init = new HomeMenu();
        init.setVisible(true);
    }
}