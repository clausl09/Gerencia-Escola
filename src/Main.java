import javax.swing.UIManager;

import view.AlunoView;

public class Main {

	public static void main(String[] args) {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		AlunoController aluno = new AlunoController();s
	//	aluno.incerrirAluno();
	//	aluno.listarTodos();
	//	aluno.listaAniversariantes(01);
		new AlunoView().iniciaAluno();
	}

}
