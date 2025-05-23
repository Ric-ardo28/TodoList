package br.com.ricardo.todolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.GenericArrayType;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "todos")
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	private boolean realizado;
	private int prioridade;

	public Todo(String nome, String descricao, boolean realizado, int prioridade) {
		this.nome = nome;
		this.descricao = descricao;
		this.realizado = realizado;
		this.prioridade = prioridade;
	}
}
