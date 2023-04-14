package es.tena.lab.spring.operator;

import es.tena.lab.spring.operator.aot.CrdModelRuntimeHints;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(CrdModelRuntimeHints.class)
public class OperatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperatorApplication.class, args);
	}

}