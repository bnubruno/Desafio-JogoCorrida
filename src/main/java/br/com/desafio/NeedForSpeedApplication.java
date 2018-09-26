package br.com.desafio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.desafio.annotation.Desafio;
import br.com.desafio.app.NeedForSpeedInterface;

public class NeedForSpeedApplication implements NeedForSpeedInterface {

	@Override
	@Desafio("novoPiloto")
	public void novoPiloto(Long id, String nome, LocalDate dataNascimento, LocalDate dataInicioCarreira, BigDecimal dinheiro) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("comprarCarro")
	public void comprarCarro(Long id, Long idPiloto, String cor, String marca, Integer ano, Integer potencia, BigDecimal preco) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("venderCarro")
	public void venderCarro(Long idCarro) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarCarroMaisCaro")
	public Long buscarCarroMaisCaro() {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarCarroMaisPotente")
	public Long buscarCarroMaisPotente() {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarCarros")
	public List<Long> buscarCarros(Long idPiloto) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarCarrosPorMarca")
	public List<Long> buscarCarrosPorMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarCor")
	public String buscarCor(Long idCarro) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarMarcas")
	public List<String> buscarMarcas() {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarNomePiloto")
	public String buscarNomePiloto(Long idPiloto) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarPilotoMaisExperiente")
	public Long buscarPilotoMaisExperiente() {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarPilotoMenosExperiente")
	public Long buscarPilotoMenosExperiente() {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarPilotos")
	public List<Long> buscarPilotos() {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarSaldo")
	public BigDecimal buscarSaldo(Long idPiloto) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("buscarValorPatrimonio")
	public BigDecimal buscarValorPatrimonio(Long idPiloto) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Desafio("trocarCor")
	public void trocarCor(Long idCarro, String cor) {
		throw new UnsupportedOperationException();
	}

}
