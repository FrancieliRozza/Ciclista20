import java.util.Scanner;


public class Ciclista {
	
	public static void main(String[] args) throws CiclistaException{
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite sua preferência para informar a distância percorrida: (1)Kilometro (2)metros");
			String valoresOpcaoEntradaDistancia = entrada.nextLine();
			System.out.println("Digite a distância percorrida");
			String valoresDistancia = entrada.nextLine();
			double distancia = converteMetrosParaKilometros(Double.parseDouble(valoresOpcaoEntradaDistancia),Double.parseDouble(valoresDistancia));
			System.out.println("Digite sua preferência para informar o tempo gasto: (1)horas (2)minutos (3)segundos");
			String valoresOpcaoEntradaTempo = entrada.nextLine();
			System.out.println("Digite o tempo gasto");
			String valoresTempo = entrada.nextLine();
			double tempo = converteMinutosOuSegundosParaHoras(Double.parseDouble(valoresOpcaoEntradaTempo),Double.parseDouble(valoresTempo));
			System.out.println("Digite sua preferência para visualização do resultado: (1)kilometros por hora (2)metros por segundo");
			String valoresOpcaoEntradaResultado = entrada.nextLine();
			if("1".equals(valoresOpcaoEntradaResultado)){
				System.out.println("Você percorreu:"+ calcularVelocidadeMedia(distancia,tempo) + " Km/h");
			} else {
				double media = calcularVelocidadeMedia(distancia,tempo);
				System.out.println("Você percorreu:"+(converteKilometrosPorHoraParaMetrosPorSegundo(media)) + " m/s");
			}
		}
	}
	
	
	public static double calcularVelocidadeMedia (double distancia, double tempo){
		
		double media = (distancia / tempo);
		
		return media;
	}
	
	public static void validaValoresDeEntrada (double tempo) throws CiclistaException{
		
		if(tempo == 0){
			throw new CiclistaException("O tempo não pode ser igual a 0");
		}
		
	}


	public static double converteMetrosParaKilometros(double valoresOpcaoEntradaDistancia, double valoresDistancia) {
		double distancia = 0;
		if(valoresOpcaoEntradaDistancia == 2){
			distancia = (valoresDistancia / 1000);
		} else {
			distancia = valoresDistancia;
		}
	
		return distancia;
		
	}
	
	public static double converteMinutosOuSegundosParaHoras(double valoresOpcaoEntradaTempo , double valoresTempo) {
		double tempo = 0;
		
		if(valoresOpcaoEntradaTempo == 2){
			tempo = (valoresTempo / 60);	
		} else if(valoresOpcaoEntradaTempo == 3) {
			tempo = (valoresTempo / 3600);
		} else {
			tempo = valoresTempo;
		}
	
		return tempo;
		
	}
	
	public static double converteKilometrosPorHoraParaMetrosPorSegundo (double media){
		
		double metrosPorSegundo = ( media / 3.6);
		
		return metrosPorSegundo;
	}

}

