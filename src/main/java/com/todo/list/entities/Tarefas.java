package com.todo.list.entities;

import java.time.LocalDate;

import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_tarefa")
public class Tarefas {
	@Id //caio<- Mapeia a Chave primaria(Primary Key) para o banco
	@GeneratedValue(strategy =GenerationType.IDENTITY) //caio<- minha estratégia para a geração automatica
	private Long id;
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro;
	private Status status; //ENUM: A FAZER,FAZENDO,FEITO;

		@ManyToOne //caio<- assumindo que tenho muitas tarefas para um usuário
		@JoinTable(name="usuario_id")//caio<- definindo a coluna que representa o usuário vinculado a essa atividade
		private Usuario usuario;
		
		/**
		 * 
		 */
		public Tarefas() {
		}
		//caio<- gerei isso com a caixinha lá que comentá constructors automatico
		/**
		 * @param id
		 * @param descricao
		 * @param setor
		 * @param prioridade
		 * @param dataCadastro
		 * @param status
		 * @param usuario
		 */
		
		public Tarefas(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
				Status status, Usuario usuario) {
			this.id = id;
			this.descricao = descricao;
			this.setor = setor;
			this.prioridade = prioridade;
			this.dataCadastro = dataCadastro;
			this.status = status;
			this.usuario = usuario;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getSetor() {
			return setor;
		}

		public void setSetor(String setor) {
			this.setor = setor;
		}

		public Prioridade getPrioridade() {
			return prioridade;
		}

		public void setPrioridade(Prioridade prioridade) {
			this.prioridade = prioridade;
		}

		public LocalDate getDataCadastro() {
			return dataCadastro;
		}

		public void setDataCadastro(LocalDate dataCadastro) {
			this.dataCadastro = dataCadastro;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		

	
		
		
}
