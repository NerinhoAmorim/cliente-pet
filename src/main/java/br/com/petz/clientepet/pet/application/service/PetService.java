package br.com.petz.clientepet.pet.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.petz.clientepet.pet.application.api.PetAlteracaoRequest;
import br.com.petz.clientepet.pet.application.api.PetClienteDetalhesResponse;
import br.com.petz.clientepet.pet.application.api.PetClienteListResponse;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;

public interface PetService {

	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente);
	PetClienteDetalhesResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);
	void deletePetDoClienteComId(UUID idCliente, UUID idPet);
	void alteracaoPetDoClienteComId(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest);


}
