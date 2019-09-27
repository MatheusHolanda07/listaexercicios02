package sistema;

public class Exercicio {
	public static void main(String[]args){
	
	
		Aluno aluno;
		aluno = new Aluno();
		aluno.nome = "matheus";
		aluno.endereco = "rua dom pedro II";
		aluno.idade = 18;
		aluno.matricula = "123";
	
	//------------------------------
		Professor prof;
		prof = new Professor();
		prof.nome = "Girafalez";
		prof.idade = 45;

	//------------------------------
		Disciplina disci;
		disci = new Disciplina();
		disci.nome = "programação II";
		disci.professor = prof.nome;
		disci.cargaHoraria = 50;
	//------------------------------	
		
		
		
		System.out.println("Aluno: "+aluno.nome+"\nMatricula: "+aluno.matricula+"\nIdade: "+aluno.idade+
				"\nEndereço: "+aluno.endereco+"\nTerá aula  com o professor "+disci.professor+
				"\nQue tem "+prof.idade+" anos e ministrará "+disci.cargaHoraria+" horas da disciplina de "+disci.nome);
	
	
	}
}