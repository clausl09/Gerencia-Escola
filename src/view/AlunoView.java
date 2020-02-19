package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Aluno;
import model.Data;

public class AlunoView {

	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtSexo;

	public AlunoView() {
		iniciaGui();
	}

	public void iniciaGui() {

		// definir a tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Cadastrar aluno");
		janela.setSize(500, 300);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		// criando JB para botao1
		JButton botao1 = new JButton();
		botao1.setText("Registrar");
		botao1.setBounds(70, 190, 100, 50);
		botao1.addActionListener(new CadastroListener());

		// criando JB para botao2
		JButton botao2 = new JButton();
		botao2.setText("Cancelar");
		botao2.setBounds(300, 190, 100, 50);

		// criando JL para matricula
		JLabel lblMatricula = new JLabel();
		lblMatricula.setText("Matricula :");
		lblMatricula.setBounds(10, 10, 80, 50);

		// criando JL para nome
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome :");
		lblNome.setBounds(10, 50, 80, 50);
		// criando JL para data
		JLabel lblData = new JLabel();
		lblData.setText("Data de nascimento :");
		lblData.setBounds(10, 90, 120, 50);

		// criando JL para sexo
		JLabel lblSexo = new JLabel();
		lblSexo.setText("Sexo :");
		lblSexo.setBounds(10, 130, 80, 50);

		// criando campo texto para matricula
		JTextField txtMatricula = new JTextField();
		txtMatricula.setBounds(150, 10, 250, 30);

		// criando campo texto para nome
		JTextField txtNome = new JTextField();
		txtNome.setBounds(150, 50, 250, 30);

		// criando campo texto para data
		JTextField txtData = new JTextField();
		txtData.setBounds(150, 90, 250, 30);

		// criando campo texto para sexo
		JTextField txtSexo = new JTextField();
		txtSexo.setBounds(150, 130, 250, 30);

		// add componentes na tela

		janela.getContentPane().add(botao1);
		janela.getContentPane().add(botao2);
		janela.getContentPane().add(lblMatricula);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(lblData);
		janela.getContentPane().add(lblSexo);
		janela.getContentPane().add(txtMatricula);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(txtData);
		janela.getContentPane().add(txtSexo);

		// Demonstrar janela
		janela.setVisible(true);

	}

	public class CadastroListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Aluno a1 = new Aluno();
			AlunoController ac = new AlunoController();
			boolean registra = true;
			// recebendo os dados para utilizar no sistema
			try {
				a1.setMatricula(txtMatricula.getText());
				a1.setNome(txtNome.getText());
				String data = txtData.getText();
				String sexo = txtSexo.getText().toUpperCase();
				
				// Convertendo string em char
				char aux = sexo.charAt(0);
				a1.setSexo(aux);

				String aux1 = a1.getNome().trim();
				String aux2 = a1.getMatricula().trim();

				int c1 = aux1.length();
				int c2 = aux2.length();
				int c3 = sexo.length();

				// verifcando o preenchimento de sexo, matricula e nome
				if ((c1 <= 0) || (c2 <= 0) || (c3 != 1)) {
					registra = false;
				}

				// verificando sexo
				if (aux != 'M' && aux != 'F') {
					registra = false;
				}
				// Separando a data
				String d1[] = data.split("/");
				// verifando se a data foi separada corretamente
				if (d1.length != 3) {
					registra = false;
				}

				int dia = Integer.parseInt(d1[0]);
				int mes = Integer.parseInt(d1[1]);
				int ano = Integer.parseInt(d1[2]);

				// Verificando se fevereiro tem 28 dias
				if ((mes == 2) && (dia > 29)) {
					registra = false;
				}

				// verificando se dia, mes e ano estão corretos
				if ((dia > 31) || (dia < 1) || (mes < 1) || (mes > 12) || (ano > 2020) || (ano < 1990)) {
					registra = false;
				}
				//
				Data d2 = new Data(dia, mes, ano);
				a1.setDataNascimentoData(d2);

				if (registra) {
					ac.inserirAluno(a1.getMatricula(), a1.getNome(), a1.getDataNascimentoData(), a1.getSexo());

					JOptionPane.showMessageDialog(null, "Usuário cadastrado !!!");
				} else {
					JOptionPane.showMessageDialog(null, "Erro na digitação, favor revise !!!");
				}

			} catch (NumberFormatException N) { 
				JOptionPane.showMessageDialog(null, "Dados inválidos verifique como você digitou os campos\n\n");
			} catch (java.lang.ArrayIndexOutOfBoundsException A) {
				JOptionPane.showMessageDialog(null, "A data precisa ser no formato dd/MM/yyyy");
			} catch (java.lang.StringIndexOutOfBoundsException C) {
				JOptionPane.showMessageDialog(null, "Digite o sexo");
			}
		}
		public class CancelaListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				janela.setVisible(false);
			}
		}
	}
}
