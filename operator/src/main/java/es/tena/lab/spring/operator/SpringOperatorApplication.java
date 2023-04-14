package es.tena.lab.spring.operator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

import es.tena.lab.spring.operator.aot.CrdModelRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(CrdModelRuntimeHints.class)
public class SpringOperatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOperatorApplication.class, args);
	}

}
