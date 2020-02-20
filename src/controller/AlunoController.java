package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import model.Aluno;
import model.Data;

public class AlunoController {
	public void inserirAluno(String matricula, String nome, Data dataNasc, char sexo) {
		Data data1 = new Data(07, 01, 1999);
		Aluno a1 = new Aluno(matricula, nome, dataNasc, sexo, nome, nome, null, nome, nome);

//		Data data2 = new Data(02, 12, 1999);
//		Aluno a2 = new Aluno("n5813", "Enrico", data2, 'M');
//
//		Data data3 = new Data(25, 05, 1999);
//		Aluno a3 = new Aluno("n5812", "Guilherme", data3, 'M');
//
//		Data data4 = new Data(11, 04, 1999);
//		Aluno a4 = new Aluno("n5310", "Andre", data4, 'M');
//
//		Data data5 = new Data(14, 06, 1999);
//		Aluno a5 = new Aluno("n5510", "Luiz", data5, 'M');

		try {
			PrintStream gravador = new PrintStream("aluno.txt");
			gravador.print(a1.getMatricula());
			gravador.print(";");
			gravador.print(a1.getNome());
			gravador.print(";");
			gravador.print(a1.getDataNascimentoData());
			gravador.print(";");
			gravador.println(a1.getSexo());
//
//			gravador.print(a2.getMatricula());
//			gravador.print(";");
//			gravador.print(a2.getNome());
//			gravador.print(";");
//			gravador.print(a2.getDataNascimentoData());
//			gravador.print(";");
//			gravador.print(a2.getSexo());
//			gravador.print("\n");
//
//			gravador.print(a3.getMatricula());
//			gravador.print(";");
//			gravador.print(a3.getNome());
//			gravador.print(";");
//			gravador.print(a3.getDataNascimentoData());
//			gravador.print(";");
//			gravador.print(a3.getSexo());
//			gravador.print("\n");
//
//			gravador.print(a4.getMatricula());
//			gravador.print(";");
//			gravador.print(a4.getNome());
//			gravador.print(";");
//			gravador.print(a4.getDataNascimentoData());
//			gravador.print(";");
//			gravador.print(a4.getSexo());
//			gravador.print("\n");
//
//			gravador.print(a5.getMatricula());
//			gravador.print(";");
//			gravador.print(a5.getNome());
//			gravador.print(";");
//			gravador.print(a5.getDataNascimentoData());
//			gravador.print(";");
//			gravador.print(a5.getSexo());
//			gravador.print("\n");

			gravador.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void listarTodos() {
		InputStream is;
		try {
			is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();
			while (texto != null) {
				String dados[] = texto.split(";");

				System.out.println("Matricula do aluno: " + dados[0]);
				System.out.println("Nomde do alinao...: " + dados[1]);
				System.out.println("Data nasc do aluno: " + dados[2]);
				System.out.println("Sexo do aluno.....: " + dados[3] + "\n");
				texto = leitor.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entrada não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listaAniversariantes(int mes) {
		try {
			FileInputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);

			String texto = leitor.readLine();

			while (texto != null) {
				String dados[] = texto.split(";");
				String data[] = dados[2].split("/");
				int mesAniversario = Integer.parseInt(data[1]);

				if (mesAniversario == mes) {
					System.out.println("Matricula do aluno: " + dados[0]);
					System.out.println("Nomde do alinao...: " + dados[1]);
					System.out.println("Data nasc do aluno: " + dados[2]);
					System.out.println("Sexo do aluno.....: " + dados[3] + "\n");
				}

				texto = leitor.readLine();
			}
		} catch (

		FileNotFoundException e) {
			System.out.println("Arquivo de entrada não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
