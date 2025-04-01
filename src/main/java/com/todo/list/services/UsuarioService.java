package com.todo.list.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dtos.UsuarioDTO;
import com.todo.list.entities.Usuario;
import com.todo.list.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	// Aqui para salvar nosso usuário entendemos aqui que nossa entidade 
	//é o armazén e o dto é o que vai ser armazenado
	public UsuarioDTO salvar(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setNome(dto.getNome());
		usuario.setEmail(dto.getEmail());
		
		usuario = usuarioRepository.save(usuario);
		return new UsuarioDTO(usuario);
	}
}
