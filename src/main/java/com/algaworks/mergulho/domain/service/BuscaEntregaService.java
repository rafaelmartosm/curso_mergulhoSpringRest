package com.algaworks.mergulho.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.mergulho.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.mergulho.domain.model.Entrega;
import com.algaworks.mergulho.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}

}