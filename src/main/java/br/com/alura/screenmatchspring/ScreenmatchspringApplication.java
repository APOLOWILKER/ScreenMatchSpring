package br.com.alura.screenmatchspring;

import br.com.alura.screenmatchspring.Service.ConvertDados;
import br.com.alura.screenmatchspring.Service.RequestManager;
import br.com.alura.screenmatchspring.model.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchspringApplication implements CommandLineRunner {

	// apiKey = 4eb6c41b

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro Projeto Spring sem Web");
		RequestManager requestManager = new RequestManager();
		var json = requestManager.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=4eb6c41b");
		System.out.println(json);

//		json = requestManager.getData("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);

		System.out.println("|-----DADOS CONVERTIDOS------|");

		ConvertDados convertDados = new ConvertDados();
		DadosSerie dados = convertDados.obeterDados(json, DadosSerie.class);

		System.out.println(dados);
	}
}
