package com.todo.list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dtos.TarefaDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.services.TarefaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("tarefa")
public class TarefaController {
	
	@Autowired
	TarefaService tarefaService;
	
	@PostMapping // já tomando cuidado para n expor a entidade
	public ResponseEntity<TarefaDTO> criarTarefa(@Valid @RequestBody TarefaDTO dto){
		
		dto = tarefaService.salvarTarefa(dto);
		return ResponseEntity.ok(dto);
		
	}
	@GetMapping
	public ResponseEntity<List<Tarefas>> lsitarTarefas(){
		return ResponseEntity.ok(tarefaService.listarTarefas());
	}
}
