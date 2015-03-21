package src;


import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JfMainHome extends JFrame 
{
    //Inicializando variaveis
    private JLabel        jlTema, jlDisciplina, jlData, jlEnfoque, jlObservacao;
    private JTextField    jtfTema, jtfData;
    private JComboBox     jcbDisciplina;
    private JCheckBox     jcebLab1, jcebLab2, jcebLab3;
    private JRadioButton  jrbTeorico, jrbPratico;
    private ButtonGroup   jbg;
    private JTextArea     jtObservacao;
    private JButton       jbSalvar;
    private JButton       jbCancelar;
    private JPanel        jpg;
    
    public JfMainHome()
    {
       //Construtor chamando metodo inicializador das variaveis
       IniciarComponentes();
    }
    
    private void IniciarComponentes()
    {
        //Definindo estruturas do Frame
        this.setSize(510,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setTitle("Agenda de estudos - edição de item");
        
        //Label Tema
        jlTema = new JLabel("Tema");
        jlTema.setBounds(10, 10, 50, 20);
        
        //TextField Tema
        jtfTema = new JTextField();
        jtfTema.setBounds(10, 30, 460, 20);
        jtfTema.setText("Construção de interfaces gráficas com Java Swing");

        //Label Data
        jlData = new JLabel("Data");
        jlData.setBounds(310, 60, 50, 20); 
        
        //TexField Data
        jtfData = new JTextField();
        jtfData.setBounds(310, 90, 160, 20);
        jtfData.setText("20/02/2015");
        
        //Label Disciplina
        jlDisciplina = new JLabel("Disciplina");
        jlDisciplina.setBounds(10, 60, 80, 20);
        
        //ComboBox Disciplina
        jcbDisciplina = new JComboBox();
        jcbDisciplina.setBounds(10, 90, 290, 20);
        jcbDisciplina.addItem("Laboratório de Linguagem de Programação");
        jcbDisciplina.setSelectedIndex(0);
        
        //Label Enfoque
        jlEnfoque = new JLabel("Enfoque");
        jlEnfoque.setBounds(270, 140, 50, 20);
        
        //RadioButton Teorico/Pratico
        jrbTeorico = new JRadioButton("Teórico");
        jrbTeorico.setContentAreaFilled(false);
        jrbPratico = new JRadioButton("Prático");
        jrbPratico.setContentAreaFilled(false);
        jrbPratico.setSelected(true);
        
        //Grupo RadioButton
        jbg = new ButtonGroup(); 
        jbg.add(jrbTeorico);
        jbg.add(jrbPratico);
        
        //Adicionando Painel
        jpg = new JPanel();
        jpg.setBounds(270,160,80,65);
        jpg.setBackground(Color.gray);
        jpg.add(jrbTeorico);
        jpg.add(jrbPratico);
        
        //Label Observacao
        jlObservacao = new JLabel("Observação");
        jlObservacao.setBounds(10, 250, 100, 20);
        
        //TextField Observacao
        jtObservacao = new JTextArea();
        jtObservacao.setBounds(10, 280, 460, 100);
        
        //Button Salvar
        jbSalvar = new JButton("Salvar");
        jbSalvar.setBounds(210, 400, 120, 20); 
        
        //Button Cancelar
        jbCancelar = new JButton("Cancelar");
        jbCancelar.setBounds(350, 400, 120, 20);
        
        //CheckBOX
        jcebLab1 = new JCheckBox();
        jcebLab1.setText("Tenho Dificuldade");
        jcebLab1.setBounds(10, 140, 200, 20);
        
        jcebLab2 = new JCheckBox("Requer resolução de exercícios"); 
        jcebLab2.setBounds(10, 170, 250, 20);
        jcebLab2.setSelected(true);
        
        jcebLab3 = new JCheckBox("Requer computador");
        jcebLab3.setBounds(10, 200, 200, 20);
        jcebLab3.setSelected(true);
        
        //adicionando CheckBOX
        this.add(jcebLab3);
        this.add(jcebLab2);
        this.add(jcebLab1);

        //Adicionando os componentes no Frame
        this.add(jlTema);
        this.add(jtfTema);
        
        this.add(jlData);
        this.add(jtfData);
        
        this.add(jlDisciplina);
        this.add(jcbDisciplina);
                
        this.add(jlEnfoque);
        this.add(jpg);
        
        this.add(jtObservacao);
        this.add(jlObservacao);
        
        this.add(jbSalvar);
        this.add(jbCancelar); 
    } 
    
    public static void main(String[] args) 
    {
        //Iniciando um novo objeto da classe criada.
        JFrame init = new JfMainHome();
        init.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        init.setVisible(true);
    }
}
