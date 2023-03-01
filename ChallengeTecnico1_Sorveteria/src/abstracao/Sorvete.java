package abstracao;

public abstract class Sorvete {
	protected String sabor;
	protected int votos;
	protected int codigo;
	
	
	public int getCodigo() {
		return codigo;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos() {
		votos++;
	}
	public String getSabor() {
		return sabor;
	}
}
