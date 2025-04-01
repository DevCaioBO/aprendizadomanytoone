package com.todo.list.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//caio<- comentários para entender tudo

@Entity //caio<- Mapeia a entidade para o spring
@Table(name = "tb_usuario") //caio<- Mapeia a entidade para o banco
public class Usuario {
	
	@Id //caio<- Mapeia a Chave primaria(Primary Key) para o banco
	@GeneratedValue(strategy =GenerationType.IDENTITY) //caio<- minha estratégia para a geração automatica
	private Long id;
	private String nome;
	@Column(unique = true)
	private String email;
	
	@OneToMany(mappedBy="usuario")
	private List<Tarefas> tarefas;
	
	public Usuario() { 
	}
	//caio<- gerei isso com a caixinha lá que comentá constructors automatico
	/**
	 * @param id
	 * @param nome
	 * @param email
	 */
	public Usuario(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	//caio<- GETTERS AND SETTERS um pega e o outro altera é tipo o useState do React const [id,setId] = useState(0)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Tarefas> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefas> tarefas) {
		this.tarefas = tarefas;
	}
	
	
	
	
	
	
	
}
