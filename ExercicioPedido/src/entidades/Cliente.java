package entidades;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String email;
	private LocalDate dataNascimeto;
	
	public Cliente(String nome, String email, LocalDate dataNascimeto) {
		this.nome = nome;
		this.email = email;
		this.dataNascimeto = dataNascimeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimeto() {
		return dataNascimeto;
	}

	public void setDataNascimeto(LocalDate dataNascimeto) {
		this.dataNascimeto = dataNascimeto;
	}
	
	
}
