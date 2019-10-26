package escola;

import java.util.List;

public class Professor {
    
	private String nome ;
	private List<Professor> ministra;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Professor> getMinistra() {
		return ministra;
	}
	public void setMinistra(List<Professor> ministra) {
		this.ministra = ministra;
	}
	
	
	
}
