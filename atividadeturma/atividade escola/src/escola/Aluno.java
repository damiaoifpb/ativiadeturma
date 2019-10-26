package escola;


import java.util.Calendar;
import java.util.List;

public class Aluno {
	
	private Integer matricula;
	private String nome;
	private Calendar nascimento;
	private List<Aluno> matriculado ;
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public List<Aluno> getMatriculado() {
		return matriculado;
	}
	public void setMatriculado(List<Aluno> matriculado) {
		this.matriculado = matriculado;
	}

} 

