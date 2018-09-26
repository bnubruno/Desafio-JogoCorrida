# Backend para NeedForSpeed

Você é responsável por construir o backend de um novo jogo estilo NeedForSpeed:


    public interface NeedForSpeedInterface {

		@Desafio("novoPiloto")
		public void novoPiloto(Long id, String nome, LocalDate dataNascimento, LocalDate dataInicioCarreira, BigDecimal dinheiro);
	
		@Desafio("comprarCarro")
		public void comprarCarro(Long id, Long idPiloto, String cor, String marca, Integer ano, Integer potencia, BigDecimal preco);
	
		@Desafio("venderCarro")
		public void venderCarro(Long id);
	
		@Desafio("buscarPilotos")
		public List<Long> buscarPilotos();
	
		@Desafio("buscarNomePiloto")
		public String buscarNomePiloto(Long idPiloto);
	
		@Desafio("buscarPilotoMaisExperiente")
		public Long buscarPilotoMaisExperiente();
	
		@Desafio("buscarPilotoMenosExperiente")
		public Long buscarPilotoMenosExperiente();
	
		@Desafio("buscarSaldo")
		public BigDecimal buscarSaldo(Long idPiloto);
	
		@Desafio("buscarCarros")
		public List<Long> buscarCarros(Long idPiloto);
	
		@Desafio("buscarCarroMaisCaro")
		public Long buscarCarroMaisCaro();
	
		@Desafio("buscarCarroMaisPotente")
		public Long buscarCarroMaisPotente();
	
		@Desafio("buscarCarrosPorMarca")
		public List<Long> buscarCarrosPorMarca(String marca);
	
		@Desafio("buscarMarcas")
		public List<String> buscarMarcas();
	
		@Desafio("buscarValorPatrimonio")
		public BigDecimal buscarValorPatrimonio(Long idPiloto);
	
		@Desafio("trocarCor")
		public void trocarCor(Long idCarro, String cor);
	
		@Desafio("buscarCor")
		public String buscarCor(Long idCarro);
	
	}

Os dados devem ficar armazenados na memória.

## Requisitos de Sistema

- Parâmetros com `*` são obrigatórios.
- Os parâmetros, com exceção de identificadores, são sempre íntegros e farão sentido.

### @Desafio("novoPiloto")

Realiza a inclusão de um novo piloto.

- Long `id`* Identificador do Piloto
- String `nome`* Nome do Piloto
- LocalDate `dataNascimento`* Data de nascimento do piloto
- LocalDate `dataInicioCarreira`* Data de início da carreira
- BigDecimal `dinheiro`* Saldo inicial em dinheiro do piloto

**Exceções:**

- Caso o `identificador` já exista, retornar `br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException`

### @Desafio("comprarCarro)"

Realiza a compra de um carro para determinado piloto.

- Long `id`* Identificador do Carro
- Long `idPiloto`* Identificador do Piloto
- String `cor`* Cor do carro
- String `Marca`* Marca do carro
- Integer `Ano`* Ano do carro
- Integer `potencia`* Potencia do carro
- BigDecimal `Preço`* Preço do carro

**Exceções:**

- Caso o `identificador` já exista, retornar `br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException`
- Caso o piloto informado não exista, retornar `br.com.codenation.desafio.exceptions.PilotoNaoEncontradoException`
- Caso o piloto não tenha saldo disponível, retornar `br.com.codenation.desafio.exceptions.SaldoInsuficienteException`


### @Desafio("venderCarro")

 Realiza a venda de um carro. Deve ser considerado o mesmo valor de compra.
 
 - Long `idCarro`* Identificador do carro
 
 **Exceções:**
 
 - Caso o carro informado não exista, retornar `br.com.codenation.desafio.exceptions.CarroNaoEncontradoException`
 
 
### @Desafio("buscarPilotos")

Retorna a lista com o `identificador` de todos os pilotos ordenados pelo `Identificador` em order crescente. Retornar lista vazia caso não encontre ninguém.

### @Desafio("buscarNomePiloto")

 Retorna o nome do piloto.
 
 - Long `idPiloto` Identificador do piloto
 
  **Exceções:**
 
 - Caso o piloto informado não exista, retornar `br.com.codenation.desafio.exceptions.PilotoNaoEncontradoException`
 
### @Desafio("buscarPilotoMaisExperiente")

 Retorna o nome do piloto com maior experiência. Retornar lista vazia caso não encontre ninguém.
 
  
### @Desafio("buscarPilotoMenosExperiente")

 Retorna o nome do piloto com menor experiência. Retornar lista vazia caso não encontre ninguém.
 
### @Desafio("buscarSaldo")

 Retorna o saldo do piloto.
 
 - Long `idPiloto` Identificador do piloto
 
  **Exceções:**
 
 - Caso o piloto informado não exista, retornar `br.com.codenation.desafio.exceptions.PilotoNaoEncontradoException`

### @Desafio("buscarCarros")

 Retorna os carros do piloto. Retornar lista vazia caso não encontre nenhum carro.
 
 - Long `idPiloto` Identificador do piloto
 
  **Exceções:**
 
 - Caso o piloto informado não exista, retornar `br.com.codenation.desafio.exceptions.PilotoNaoEncontradoException`
 
### @Desafio("buscarCarroMaisCaro")

 Retorna o carro mais caro. Utilizar o menor identificador do carro como critério de desempate. 
 
### @Desafio("buscarCarroMaisPotente")

 Retorna o carro mais potente. Utilizar o menor identificador do carro como critério de desempate.

### @Desafio("buscarCarrosPorMarca")

 Retorna os carros por marca. Retornar lista vazia caso não encontre nenhum carro.
 
 - String `marca` Nome da marca
 
### @Desafio("buscarMarcas")

 Retorna as marcas dos carros. Retornar lista vazia caso não encontre nenhuma marca.
 
### @Desafio("buscarValorPatrimonio")

 Retorna o valor do patrimônio do piloto.
 
 - Long `idPiloto` Identificador do piloto
 
  **Exceções:**
 
 - Caso o piloto informado não exista, retornar `br.com.codenation.desafio.exceptions.PilotoNaoEncontradoException`
 
### @Desafio("trocarCor")

 Troca a cor de um carro específico.
 
 - Long `idCarro` Identificador do carro

  **Exceções:**
 
 - Caso o carro informado não exista, retornar `br.com.codenation.desafio.exceptions.CarroNaoEncontradoException`
 
### @Desafio("buscarCor")

 Retorna a cor de um carro específico.
 
 - Long `idCarro` Identificador do carro

  **Exceções:**
 
 - Caso o carro informado não exista, retornar `br.com.codenation.desafio.exceptions.CarroNaoEncontradoException`
 
 
