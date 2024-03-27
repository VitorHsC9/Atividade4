import java.util.Objects;

public class Funcionario {

	private String nome;
	private String numeroDOcumento;
	private TipoDeDocumento documento;

	public Funcionario(String nome, String numeroDOcumento, TipoDeDocumento documento) {
		this.nome = nome;
		this.numeroDOcumento = numeroDOcumento;
		this.documento = documento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroDOcumento() {
		return numeroDOcumento;
	}
	public void setNumeroDOcumento(String numeroDocumento) {
		this.numeroDOcumento = numeroDocumento;
	}
	public TipoDeDocumento getDocumento() {
		return documento;
	}
	public void setDocumento(TipoDeDocumento documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", numeroDOcumento=" + numeroDOcumento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, getDocumento());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroDOcumento, other.numeroDOcumento);
	}
	
	
	
}
