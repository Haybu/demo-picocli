package io.agilehandy.picocli;

import picocli.CommandLine;
import picocli.spring.boot.autoconfigure.PicocliAutoConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.AccessBits;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;

@NativeHint (
		trigger = PicocliAutoConfiguration.class,
		types = {
				@TypeHint(
						types = { CommandLine.class },
						access = AccessBits.CLASS | AccessBits.DECLARED_CONSTRUCTORS
				)
		}
)
@SpringBootApplication
public class DemoPicocliApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPicocliApplication.class, args);
	}

}
