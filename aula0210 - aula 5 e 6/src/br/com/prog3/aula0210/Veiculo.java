package br.com.prog3.aula0210;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Veiculo {
	protected String descricaoVeiculo = null;

	@Getter
	public String getDescricaoVeiculo() {
		return descricaoVeiculo;
	}

	public void setDescricaoVeiculo(@Optional String descricaoVeiculo) {
		this.descricaoVeiculo = descricaoVeiculo;
	}

	public List<String> adicionaVeiculoLista(List<String> descricaoVeiculos) {
		@Optional
		List<String> descricoes = descricaoVeiculos;
		if (descricoes == null) {
			descricoes = new ArrayList<>();
		}
		descricoes.add(getDescricaoVeiculo());
		return descricoes;

	}

}
