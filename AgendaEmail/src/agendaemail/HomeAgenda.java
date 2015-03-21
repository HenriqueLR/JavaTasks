
package agendaemail;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class HomeAgenda extends javax.swing.JFrame {
    
    JTable table;
    
    DataBase db;
    PreparedStatement statement;
    ResultSet resultset;
    
    public HomeAgenda() {
        initComponents();
        AddBD();
    }
    
    private void AddBD(){
        db = new DataBase();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlContato = new javax.swing.JLabel();
        jbFiltrar = new javax.swing.JButton();
        jbApagar = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        jlMenssagem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtmenssagem = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jbEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jbAdicionar = new javax.swing.JButton();
        jtContato = new javax.swing.JTextField();
        jbEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Email");

        jlContato.setText("Contato");

        jbFiltrar.setText("Filtrar");
        jbFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarActionPerformed(evt);
            }
        });

        jbApagar.setText("Apagar");
        jbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApagarActionPerformed(evt);
            }
        });

        jlMenssagem.setText("Menssagem");

        jtmenssagem.setColumns(20);
        jtmenssagem.setRows(5);
        jScrollPane2.setViewportView(jtmenssagem);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlNome.setText("Nome");

        jbEmail.setText("Email");

        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addComponent(jbEmail)
                    .addComponent(jlNome)
                    .addComponent(jtNome))
                .addGap(30, 30, 30)
                .addComponent(jbAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlNome)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jbEnviar.setText("Enviar");
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlContato)
                            .addComponent(jlMenssagem))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlContato)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlMenssagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarActionPerformed
        try{
            if (!db.getConnection()){
                JOptionPane.showMessageDialog(null, "Conexao falhou");
            }else{
                statement = db.connection.prepareStatement("SELECT * FROM contatos WHERE nome LIKE ?");
                statement.setString(1, "%"+jtContato.getText().trim()+"%");
                resultset = statement.executeQuery();
                DefaultTableModel tablemodel = new DefaultTableModel(new String []{},0){};
                int qtdColunas = resultset.getMetaData().getColumnCount();
                for (int indice = 1;indice<=qtdColunas;indice++)
                    tablemodel.addColumn(resultset.getMetaData().getColumnName(indice));
                
                table = new JTable(tablemodel);
                DefaultTableModel dtm = (DefaultTableModel)table.getModel();
                
                while(resultset.next()){
                    try{
                        String[] dados = new String[qtdColunas];
                        for(int i = 1;i<=qtdColunas;i++){
                            dados[i-1] = resultset.getString(i);
                        }
                        dtm.addRow(dados);
                    }catch (SQLException erro){}
                    ScrollPane.setViewportView(table);
                }
                resultset.close();
                statement.close();
                db.close();
            }
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }//GEN-LAST:event_jbFiltrarActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        try{
            if (!db.getConnection()){
                JOptionPane.showMessageDialog(null, "Conexao falhou");
            }else{
                statement = db.connection.prepareStatement("INSERT INTO contatos (nome, email) values (?,?)");
                statement.setString(1, jtNome.getText());
                statement.setString(2, jtEmail.getText());
                
                int result = statement.executeUpdate();
                if (!(result > 0))
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar contato.");
                
                statement.close();
                db.close();
                
                jtNome.setText("");
                jtEmail.setText("");
                JOptionPane.showMessageDialog(null, "Contato cadastrado.");
            }
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarActionPerformed
        try{
            try{
                SimpleEmail email = new SimpleEmail();
                email.setDebug(true);
                
                //mudar as variaveis de acordo com suas configuracoes de email
                email.setHostName("smtp.gmail.com");
                email.setAuthentication("seu_email@gmail.com", "senha");
                email.setFrom("seu_email@gmail.com");
                email.setSslSmtpPort("465");
                email.setSSLOnConnect(true);
                
                email.addTo(table.getValueAt(table.getSelectedRow(),2).toString());
                email.setSubject("Envio de email");
                email.setMsg("ola "+table.getValueAt(table.getSelectedRow(),1).toString()+"\n\n"+jtmenssagem.getText());
                email.send();
                JOptionPane.showMessageDialog(null, "Email enviado para "+table.getValueAt(table.getSelectedRow(),1).toString());
            }catch (EmailException sxs){
                System.out.println("Ocorreu um erro: "+sxs.getMessage());
            }
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_jbEnviarActionPerformed

    private void jbApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApagarActionPerformed
        try{
            int resposta = JOptionPane.showConfirmDialog(null, "Realmente quer Excluir?","Cuidado",0,JOptionPane.YES_OPTION);
            if (resposta == 0){
                if (!db.getConnection()){
                    JOptionPane.showMessageDialog(null, "Conexao falhou");
                }else{
                    statement = db.connection.prepareStatement("DELETE FROM contatos WHERE id_contato = ?");
                    statement.setInt(1, Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
                    
                    int resultado = statement.executeUpdate();
                    if (resultado > 0)
                        JOptionPane.showMessageDialog(null, "contato excluido.");
                    else
                        JOptionPane.showMessageDialog(null, "falha ao excluir contato.");
                    
                    statement.close();
                    db.close();
                }
            }
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_jbApagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbApagar;
    private javax.swing.JLabel jbEmail;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JButton jbFiltrar;
    private javax.swing.JLabel jlContato;
    private javax.swing.JLabel jlMenssagem;
    private javax.swing.JLabel jlNome;
    private javax.swing.JTextField jtContato;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextArea jtmenssagem;
    // End of variables declaration//GEN-END:variables
}
