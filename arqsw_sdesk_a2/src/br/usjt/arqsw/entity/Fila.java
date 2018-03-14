package br.usjt.arqsw.entity;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author RA81617543 Igor Almeida
 * CCP3AN-MCA 
 * Arquitetura de software
 *
 */
public class Fila implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message="A fila n�o pode ser vazia.")
	@Min(value=1, message="A fila n�o pode ser vazia.")
	private int id;
	
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
	
}