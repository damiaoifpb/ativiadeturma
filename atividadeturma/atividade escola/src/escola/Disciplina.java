package escola;

import java.util.List;

public class Disciplina {
    
	private String nome;
	private List<Disciplina> ensinada;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Disciplina> getEnsinada() {
		return ensinada;
	}
	public void setEnsinada(List<Disciplina> ensinada) {
		this.ensinada = ensinada;
	}
	
}
