package controller;

import model.Professor;

public class ProfessorController {
	public void testeProfessor() {
		Professor p1 = new Professor();
		p1.setNome("Claudio");
		p1.setCpf("489.137.598.10");
		p1.setSalario(1000);
		p1.setMateria("Java");
		
		p1.exibi();
	}
}
