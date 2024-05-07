package fr.epsiflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// L'appel à SpringApplication.run(ArcitectureApplicative2024Application.class, args) permet de lancer l'application Spring Boot.
// Cette méthode statique démarre l'application Spring Boot, qui à son tour démarre le serveur Tomcat embarqué.

@SpringBootApplication
public class ArcitectureApplicative2024Application {

	public static void main(String[] args) {
		SpringApplication.run(ArcitectureApplicative2024Application.class, args);
	}
}
