package clock.clock;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.ZonedDateTime;

@SpringBootApplication
public class ClockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClockApplication.class, args);
	}
	@PostConstruct
	public void logServerTime() {
		System.out.println("Server startup time (UTC): " + Instant.now());
		System.out.println("Server startup time (default timezone): " + ZonedDateTime.now());
	}
}
