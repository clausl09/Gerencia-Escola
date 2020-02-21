package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class AlunoView {

	private JPanel painelDaJanela;

	private JFrame janela;
	private JLabel lblMatricula;
	private JLabel lblNome;
	private JLabel lblDataNasc;
	private JLabel lblRg;
	private JLabel lblCpf;
	private JLabel lblLogradouro;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblBairro;
	private JLabel lblCep;
	private JLabel lblTelefone;
	private JLabel lblSenha;
	private JLabel lblEstado;
	private JLabel lblCidade;
	private JLabel lblSexo;

	private JButton botao1;
	private JButton botao2;

	private JRadioButton rbtMasculino;
	private JRadioButton rbtFeminino;
	private ButtonGroup grpRadio;

	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtTelefone;
	
	private JPasswordField jpwSenha;

	private JComboBox cbEstado;
	private String[] equipamentosE = { "SP - Sao Paulo", "RJ - Rio de janeiro" };
	private JComboBox cbCidade;
	private String[] equipamentosC = { "Sao Paulo", "Osasco", "Carapicuiba", "Diadema", "Cotia" };

	public void iniciaAluno() {
		// instanciando
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		lblMatricula = new JLabel();
		lblNome = new JLabel();
		lblDataNasc = new JLabel();
		lblSexo = new JLabel();
		lblRg = new JLabel();
		botao1 = new JButton();
		botao2 = new JButton();
		lblCpf = new JLabel();
		lblLogradouro = new JLabel();
		lblNumero = new JLabel();
		lblComplemento = new JLabel();
		lblBairro = new JLabel();
		lblCep = new JLabel();
		lblTelefone = new JLabel();
		lblSenha = new JLabel();
		lblEstado = new JLabel();
		lblCidade = new JLabel();
		rbtMasculino = new JRadioButton();
		rbtFeminino = new JRadioButton();
		txtMatricula = new JTextField();
		txtNome = new JTextField();
		txtDataNasc = new JTextField();
		txtRg = new JTextField();
		txtCpf = new JTextField();
		txtLogradouro = new JTextField();
		txtNumero = new JTextField();
		txtComplemento = new JTextField();
		txtBairro = new JTextField();
		txtCep = new JTextField();
		txtTelefone = new JTextField();
		jpwSenha = new JPasswordField();
		cbCidade = new JComboBox(equipamentosC);
		cbEstado = new JComboBox(equipamentosE);

		// config label nome
		lblNome.setText("Nome : ");
		lblNome.setBounds(4, 20, 400, 25);
		txtNome.setBounds(50, 20, 210, 25);

		// config label Data de nascimento
		lblDataNasc.setText("Data de nascimento : ");
		lblDataNasc.setBounds(270, 20, 150, 25);
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##/##/####");
			txtDataNasc = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtDataNasc.setBounds(400, 20, 70, 25);
		

	// config label Matricula
		lblMatricula.setText("Matricula : ");
		lblMatricula.setBounds(295, 65, 150, 25);
		txtMatricula.setBounds(360, 65, 110, 25);

		// config label Rg
		lblRg.setText("RG : ");
		lblRg.setBounds(160, 65, 200, 25);
		try {
			javax.swing.text.MaskFormatter rg = new javax.swing.text.MaskFormatter("##.###.###-#");
			txtRg = new javax.swing.JFormattedTextField(rg);
		} catch (Exception e) {
		}
		txtRg.setBounds(185, 65, 100, 25);

		// config label Cpf
		lblCpf.setText("CPF : ");
		lblCpf.setBounds(4, 65, 120, 25);
		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###/##");
			txtCpf = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e) {
		}
		txtCpf.setBounds(35, 65, 120, 25);

		// config label Logradouro
		lblLogradouro.setText("Logradouro : ");
		lblLogradouro.setBounds(4, 115, 208, 25);
		txtLogradouro.setBounds(85, 115, 250, 25);

		// config label Numero
		lblNumero.setText("Numero : ");
		lblNumero.setBounds(345, 115, 150, 25);
		txtNumero.setBounds(400, 115, 70, 25);

		// config label Complemento
		lblComplemento.setText("Complemento : ");
		lblComplemento.setBounds(4, 160, 150, 25);
		txtComplemento.setBounds(100, 160, 150, 25);

		// config label Bairro
		lblBairro.setText("Bairro : ");
		lblBairro.setBounds(260, 160, 208, 25);
		txtBairro.setBounds(310, 160, 160, 25);

		// config label Cep
		lblCep.setText("Cep : ");
		lblCep.setBounds(20, 210, 208, 25);
		try {
			javax.swing.text.MaskFormatter cep = new javax.swing.text.MaskFormatter("###.##.###");
			txtCep = new javax.swing.JFormattedTextField(cep);
		} catch (Exception e) {
		}
		txtCep.setBounds(70, 210, 130, 25);

		// config label Telefone
		lblTelefone.setText("Telefone : ");
		lblTelefone.setBounds(230, 210, 208, 25);
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("(##) #####-####");
			txtTelefone = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtTelefone.setBounds(310, 210, 130, 25);

		// config Combo box estado
		lblEstado.setText("Selecione seu estado :");
		lblEstado.setBounds(10, 260, 200, 25);
		cbEstado.setSelectedIndex(-1);
		cbEstado.setBounds(150, 260, 150, 25);
		cbEstado.setMaximumRowCount(10);

		// config Combo box cidade
		lblCidade.setText("Selecione seu cidade :");
		lblCidade.setBounds(10, 310, 200, 25);
		cbCidade.setSelectedIndex(-1);
		cbCidade.setBounds(150, 310, 150, 25);
		cbCidade.setMaximumRowCount(10);

		// cria o objeto de grupo de botoes
		grpRadio = new ButtonGroup();

		// adiciona os botoes ao grupo
		grpRadio.add(rbtMasculino);
		grpRadio.add(rbtFeminino);

		// configuraçao do botao Divorciado
		rbtMasculino.setText("Masculino");
		rbtMasculino.setBounds(330, 310, 150, 25);

		// configuraçao do botao Divorciado
		rbtFeminino.setText("Feminino");
		rbtFeminino.setBounds(330, 285, 150, 25);

		// lblSexo
		lblSexo.setText("Selecione o sexo");
		lblSexo.setBounds(330, 255, 150, 25);

		// config label Senha
		lblSenha.setText("Senha : ");
		lblSenha.setBounds(180, 355, 208, 25);
		jpwSenha.setBounds(180, 385, 100, 25);

		// config botao1
		botao1.setText("Confirmar");
		botao1.setBounds(80, 450, 100, 50);

		// config botao1
		botao2.setText("Cancelar");
		botao2.setBounds(280, 450, 100, 50);

		// confg painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblMatricula);
		painelDaJanela.add(txtMatricula);
		painelDaJanela.add(lblNome);
		painelDaJanela.add(txtNome);
		painelDaJanela.add(lblDataNasc);
		painelDaJanela.add(txtDataNasc);
		painelDaJanela.add(lblRg);
		painelDaJanela.add(txtRg);
		painelDaJanela.add(lblCpf);
		painelDaJanela.add(txtCpf);
		painelDaJanela.add(lblLogradouro);
		painelDaJanela.add(txtLogradouro);
		painelDaJanela.add(lblEstado);
		painelDaJanela.add(lblCidade);
		painelDaJanela.add(lblNumero);
		painelDaJanela.add(txtNumero);
		painelDaJanela.add(lblComplemento);
		painelDaJanela.add(txtComplemento);
		painelDaJanela.add(lblBairro);
		painelDaJanela.add(txtBairro);
		painelDaJanela.add(lblCep);
		painelDaJanela.add(txtCep);
		painelDaJanela.add(lblTelefone);
		painelDaJanela.add(txtTelefone);
		painelDaJanela.add(lblSenha);
		painelDaJanela.add(jpwSenha);
		painelDaJanela.add(cbEstado);
		painelDaJanela.add(cbCidade);
		painelDaJanela.add(rbtMasculino);
		painelDaJanela.add(rbtFeminino);
		painelDaJanela.add(lblSexo);
		painelDaJanela.add(botao1);
		painelDaJanela.add(botao2);

		// configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		janela.setSize(510, 550);
		janela.setVisible(true);

	}

}
