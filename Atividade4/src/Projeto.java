import java.sql.Date;
import java.util.Objects;

public class Projeto {

	private String nome;
	private Date dt_inicio;
	private Date dt_Termino;

	public Projeto(String nome, Date dt_inicio, Date dt_Termino) {
		this.nome = nome;
		this.dt_inicio = dt_inicio;
		this.dt_Termino = dt_Termino;
	}
	
	public Projeto(String nome2, java.util.Date date, java.util.Date date2) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_inicio() {
		return dt_inicio;
	}
	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	public Date getDt_Termino() {
		return dt_Termino;
	}
	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}

	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_inicio=" + dt_inicio + ", dt_Termino=" + dt_Termino + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dt_Termino, dt_inicio, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		return Objects.equals(dt_Termino, other.dt_Termino) && Objects.equals(dt_inicio, other.dt_inicio)
				&& Objects.equals(nome, other.nome);
	}
	
	public void listarContratacoes() {
        System.out.println("Contratações do Projeto: " + nome);
        Contratacao[] contratacoes = null;
		for (Contratacao contratacao : contratacoes) {
            System.out.println(contratacao);
        }
        System.out.println();
    }
	
}
