import java.util.ArrayList;
import java.util.List;

public class Categoria {

	//Jean Pablo Bosso   R.A: 12246559
	//Priscilla Ormedo Rockenbach   R.A: 12023883
	
	private String nome;
	private String alias;
	private List<Categoria> subCategoria;
	
	public Categoria(){
		this.subCategoria = new ArrayList<Categoria>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public List<Categoria> getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(Categoria categoria) 
	
	{
		this.subCategoria.add(categoria);
	}

}
