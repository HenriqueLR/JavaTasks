
package VISAO;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import CONTROLE.CCliente;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class ClienteHome extends JFrame {
    CCliente ccliente;
    boolean  Incluindo=false, RegistroCarregado=false;
    
    private JButton BtExcluir, BtNovo, BtPesquisar, BtSalvar, btLimpar;
    private JPanel PBotoes, PComponentes;
    private JLabel jLabel1, jLabel12, jLabel2, jLabel4, jLabel5, jLabel6, jLabel7;
    private JTextField jtf_Bairro, jtf_Cidade, jtf_Codigo, jtf_Nome, jtf_Numero,jtf_rua;
    private JFormattedTextField jtf_telefone;

    public ClienteHome(){
        iniciarComponentes();
        
        AtivarEdicao(false);
        ccliente = new CCliente();
        if (!ccliente.daoCliente.bd.getConnection())
        {
            JOptionPane.showMessageDialog(null, "Falha Conneccao");
            this.dispose(); 
        } 
    }
    
    private void iniciarComponentes() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cadastro de Clientes - C01001");
        this.setSize(627,404);
        this.setLayout(null);

        PComponentes = new JPanel();
        PComponentes.setSize(598,292); 
        PComponentes.setLayout(null);
        
        PBotoes = new JPanel();
        PBotoes.setSize(627,381);
        PBotoes.setLayout(null);
        
        jLabel1 = new JLabel("Codigo");
        jLabel1.setBounds(30, 15, 50, 30);
        jtf_Codigo = new JTextField();
        jtf_Codigo.setBounds(30, 45, 50, 35);
        
        jLabel2 = new JLabel("Nome");
        jLabel2.setBounds(130, 15, 50, 30);
        jtf_Nome = new JTextField();
        jtf_Nome.setBounds(130, 45, 400, 35);
        
        jLabel4 = new JLabel("Rua");
        jLabel4.setBounds(30,90, 50, 30);
        jtf_rua = new JTextField();
        jtf_rua.setBounds(30,120,250,35);
        
        jLabel7 = new JLabel("Numero");
        jLabel7.setBounds(300, 90, 50, 30); 
        jtf_Numero = new JTextField();
        jtf_Numero.setBounds(300, 120, 75, 35);
       
        jLabel6 = new JLabel("Bairro");
        jLabel6.setBounds(400,90,50,30);
        jtf_Bairro = new JTextField();
        jtf_Bairro.setBounds(400,120,130,35);
        
        jLabel5 = new JLabel("cidade");
        jLabel5.setBounds(30,170,50,30);
        jtf_Cidade = new JTextField();
        jtf_Cidade.setBounds(30,200,250,35);

        jLabel12 = new JLabel("Telefone");
        jLabel12.setBounds(350,170,50,30);
        jtf_telefone = new JFormattedTextField();
        try {
            jtf_telefone.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtf_telefone.setBounds(350,200,180,35);
        
        PComponentes.add(jLabel1);
        PComponentes.add(jtf_Codigo);
        PComponentes.add(jLabel2);
        PComponentes.add(jtf_Nome);
        PComponentes.add(jLabel4);
        PComponentes.add(jtf_rua);
        PComponentes.add(jLabel7);
        PComponentes.add(jtf_Numero);
        PComponentes.add(jLabel6);
        PComponentes.add(jtf_Bairro);
        PComponentes.add(jLabel5);
        PComponentes.add(jtf_Cidade);
        PComponentes.add(jLabel12);
        PComponentes.add(jtf_telefone);

        BtNovo = new JButton();
        BtNovo.setBounds(30,250,80,35);
        BtNovo.setText("Novo");
        BtNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BtNovoActionPerformed(evt);
            }
        });
        
        BtSalvar = new JButton(); 
        BtSalvar.setBounds(120,250,80,35);
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        
        BtExcluir = new JButton();
        BtExcluir.setBounds(210,250,100,35);
        BtExcluir.setText("Excluir");
        BtExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        
        btLimpar = new JButton();
        btLimpar.setBounds(320,250,100,35);
        btLimpar.setText("Cancelar");
        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
                
        BtPesquisar  = new JButton();      
        BtPesquisar.setBounds(430,250,100,35);
        BtPesquisar.setText("Pesquisar");
        BtPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });
        
        PBotoes.add(BtExcluir);
        PBotoes.add(BtNovo);
        PBotoes.add(BtPesquisar);
        PBotoes.add(BtSalvar);
        PBotoes.add(btLimpar);
        
        PBotoes.add(PComponentes);
        this.add(PBotoes);
    }

    private void AtivarEdicao(boolean habilitar){
        Component[] c;
        BtNovo.setEnabled(!habilitar);
        BtSalvar.setEnabled(habilitar);
        BtPesquisar.setEnabled(!habilitar);
        BtExcluir.setEnabled(!habilitar);        
        BtNovo.setEnabled(!habilitar);
        
        c = PComponentes.getComponents();
        for (int i = 0;i<c.length;i++){            
            if ((c[i] instanceof JTextField) || (c[i] instanceof JFormattedTextField))
              c[i].setEnabled(habilitar);
        }
        BtExcluir.setEnabled(RegistroCarregado&&habilitar);
        if (!RegistroCarregado){
           jtf_Codigo.setEnabled(true);
           jtf_Codigo.requestFocus();    
        }else{    
            jtf_Codigo.setEnabled(false);
        }  
    }

    private void LimparCampos()
    {
        Component[] c;
        c = PComponentes.getComponents();
        for (int i = 0;i<c.length;i++)
        {            
            if ((c[i] instanceof JTextField) || (c[i] instanceof JFormattedTextField))
              ((JTextField)(c[i])).setText("");                    
        } 
        
    } 

    private void BtNovoActionPerformed(ActionEvent evt) {                                       
        Incluindo = true;
        LimparCampos();
        AtivarEdicao(true);
        RegistroCarregado = false;
        jtf_Codigo.setText(Integer.toString(ccliente.gerar()));
        jtf_Codigo.setEnabled(false);
    }

    private void BtExcluirActionPerformed(ActionEvent evt) {                                          
        AtivarEdicao(false);
        if (jtf_Codigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O codigo nao pode ser vazio");
            jtf_Codigo.requestFocus();
            return;
        }          
        ccliente.cliente.setCodigo(Integer.parseInt(jtf_Codigo.getText()));     
       
        JOptionPane.showMessageDialog(null, ccliente.excluir(ccliente.cliente));
        LimparCampos();
        RegistroCarregado = false;
        AtivarEdicao(false);        
        
    } 

    private void BtPesquisarActionPerformed(ActionEvent evt) {                                            
        if (jtf_Codigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O codigo nao pode ser vazio");
            jtf_Codigo.requestFocus();
            return;
        }          
        
        ccliente.cliente.setCodigo(Integer.parseInt(jtf_Codigo.getText()));     
        Incluindo = false;
        if (ccliente.localizar(ccliente.cliente))
        {    
        
            jtf_Codigo.setText(String.valueOf(ccliente.cliente.getCodigo()));
            jtf_Nome.setText(ccliente.cliente.getNome());
            jtf_rua.setText(ccliente.cliente.getRua());       
            jtf_Numero.setText(String.valueOf( ccliente.cliente.getNumero()));       
            jtf_telefone.setText(ccliente.cliente.getTelefone());       
            jtf_Bairro.setText(ccliente.cliente.getBairro());       
            jtf_Cidade.setText(ccliente.cliente.getCidade());
        
            RegistroCarregado = true;
            AtivarEdicao(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nenhum registro Encontrado para: "+jtf_Codigo.getText());
            LimparCampos();
            AtivarEdicao(false);
        }       
    }  
    
    private void BtSalvarActionPerformed(ActionEvent evt) {                                         
        
        if (jtf_Codigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O codigo nao pode ser vazio");
            jtf_Codigo.requestFocus();
            return;
        }          
        if (jtf_rua.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "A Rua nao pode ser vazio");
            jtf_rua.requestFocus();
            return;
        }          
        
        if (jtf_Nome.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O Nome nao pode ser vazio");
            jtf_Nome.requestFocus();
            return;
        }       
        
        if (jtf_Numero.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O Numero nao pode ser vazio");
            jtf_Numero.requestFocus();
            return;
        }       
        
        if (jtf_Bairro.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O Bairro nao pode ser vazio");
            jtf_Bairro.requestFocus();
            return;
        }       
        
        if (jtf_Cidade.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "A cidade nao pode ser vazio");
            jtf_Cidade.requestFocus();
            return;
        }       
        
        if (jtf_telefone.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O Telefone nao pode ser vazio");
            jtf_telefone.requestFocus();
            return;
        }       
        ccliente.cliente.setCodigo(Integer.parseInt(jtf_Codigo.getText()));
        ccliente.cliente.setNome(jtf_Nome.getText());
        ccliente.cliente.setRua(jtf_rua.getText());
        ccliente.cliente.setNumero(Integer.parseInt(jtf_Numero.getText()));
        ccliente.cliente.setTelefone(jtf_telefone.getText());
        ccliente.cliente.setBairro(jtf_Bairro.getText());
        ccliente.cliente.setCidade(jtf_Cidade.getText());
        
        if (Incluindo)
           JOptionPane.showMessageDialog(null, ccliente.gravar(ccliente.cliente));
        else
           JOptionPane.showMessageDialog(null, ccliente.alterar(ccliente.cliente)); 
        
        RegistroCarregado = true;    
        AtivarEdicao(true);
    }    

    private void btLimparActionPerformed(ActionEvent evt) {                                         
        LimparCampos();
        RegistroCarregado = false;
        AtivarEdicao(false);
    }
}