package PacoteDeViagens;

public class Facade {
	
	protected SistemaReservaDePassagem reserva;
	protected SistemaDePagamento pagamento;
	protected SistemaReservaDeHotel hotel;
	protected SistemaAluguelDeVeiculo veiculo;
	
	public void executarSistemas() {
		reserva = new SistemaReservaDePassagem();
		reserva.reservarPassagem();
		
		pagamento = new SistemaDePagamento();
		pagamento.realizarPagamento();
		
		hotel = new SistemaReservaDeHotel();
		hotel.ReservarHotel();
		
		veiculo = new SistemaAluguelDeVeiculo();
		veiculo.AlugarVeiculo();
		
	}

}
