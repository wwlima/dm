package br.com.ww.dm.resources.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.ww.dm.domains.Requisicao;
import br.com.ww.dm.repositories.RequisicaoRepository;

/**
 * @author William Lima (wwlima@gmail.com)
 *
 */
@Controller
@RequestMapping("/v1/requisicoes")
public class RequisicaoController {
	
	@Autowired
	private RequisicaoRepository repo;
	
	@GetMapping
	public List<Requisicao> findAll(){
		return  repo.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody Requisicao requisicao ) {
		requisicao.setId(null);
		Requisicao novaRequisicao = repo.save(requisicao);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novaRequisicao.getId()).toUri();
		return ResponseEntity.created(uri).build();		
	}

	@DeleteMapping(value="/{1}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) { 
		Optional<Requisicao> delecao = repo.findById(id);
		repo.delete(delecao.get());
		return ResponseEntity.noContent().build();
	}
	
}
