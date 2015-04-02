
package VISAO;

import CONTROLE.CConsultaCliente;
import MODELO.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ClienteSearch extends JFrame {
    CConsultaCliente consultaCliente;
    ArrayList <Cliente> clientes;

    private JButton BtPesquisar;
    private JPanel JPFiltros,jPanel1;
    private JTable JTClientes;
    private JTextField JTFBairro, JTFCidade,JTFNome,JTFCodigo;
    private JLabel jLabel1,jLabel2,jLabel3,jLabel4;
    private JScrollPane jScrollPane1;

    public ClienteSearch() 
    {
        iniciarComponentes();
        consultaCliente = new CConsultaCliente();
        if (!consultaCliente.consultaCliente.bd.getConnection())
        {
            JOptionPane.showMessageDialog(null, "Falha Conneccao");
            this.dispose(); 
        }   
    }

    private void iniciarComponentes() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Consulta de Clientes - C01001");
        this.setSize(627,404);
        this.setLayout(null);

        JPFiltros = new JPanel();
        JPFiltros.setSize(627,114);
        JPFiltros.setLayout(null);
        
        jScrollPane1 = new JScrollPane();
        jScrollPane1.setBounds(0,60,626,240);
        
        JTClientes = new JTable();
        JTClientes.setSize(627,240);
        
        jPanel1 = new JPanel();
        jPanel1.setBounds(0,60,626,240);
        jPanel1.setLayout(null);        
        
        BtPesquisar = new JButton();
        BtPesquisar.setText("Pesquisar");
        BtPesquisar.setBounds(475, 44, 100, 38);
        BtPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });        
                
        jLabel4 = new JLabel("Codigo");
        jLabel4.setBounds(30, 15, 50, 30);
        JTFCodigo = new JTextField();
        JTFCodigo.setBounds(30, 45, 50, 35);        
        
        jLabel1 = new JLabel();
        jLabel1.setText("Cidade");
        jLabel1.setBounds(100, 15, 50, 30);
        JTFCidade = new JTextField();
        JTFCidade.setBounds(100, 45, 100, 35);    
        
        jLabel2 = new JLabel();
        jLabel2.setText("Bairro");
        jLabel2.setBounds(220, 15, 50, 30);
        JTFBairro = new JTextField();
        JTFBairro.setBounds(220, 45, 100, 35); 
        JTFBairro.setText(" ");
        
        jLabel3 = new JLabel();
        jLabel3.setText("Nome");
        jLabel3.setBounds(340, 15, 50, 30);
        JTFNome = new JTextField();
        JTFNome.setBounds(340, 45, 100, 35); 
        
        JPFiltros.add(jLabel4);
        JPFiltros.add(JTFCodigo);
        JPFiltros.add(jLabel1);
        JPFiltros.add(JTFCidade);
        JPFiltros.add(jLabel2);
        JPFiltros.add(JTFBairro);
        JPFiltros.add(jLabel3);
        JPFiltros.add(JTFNome);
        JPFiltros.add(BtPesquisar);
        
        JTClientes.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Telefone"
            }
            ){
            boolean[] canEdit = new boolean [] {
                false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane1.setViewportView(JTClientes);
        jPanel1.add(jScrollPane1);

        this.add(JPFiltros);
        this.add(jPanel1);
    }    
    
    private void BtPesquisarActionPerformed(ActionEvent evt) {                                            
        try 
        {
            JTClientes.getColumnModel().getColumn(0).setPreferredWidth(130);
            JTClientes.getColumnModel().getColumn(1).setPreferredWidth(50);
            DefaultTableModel dtmCliente = (DefaultTableModel)JTClientes.getModel();
            dtmCliente.setNumRows(0);
            
            clientes = consultaCliente.consultar(JTFCodigo.getText(), JTFCidade.getText() ,JTFBairro.getText(),JTFNome.getText());
            for(int i =0;i<clientes.size();i++)
                dtmCliente.addRow(new Object[]{(clientes.get(i)).getNome(), (clientes.get(i)).getTelefone()});
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERRO: "+ex.getMessage());;
        }
                
    }   
}
