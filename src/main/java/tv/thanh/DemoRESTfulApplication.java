package tv.thanh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages="tv.thanh.repository")
@SpringBootApplication(scanBasePackages= {"tv.thanh"})
public class DemoRESTfulApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoRESTfulApplication.class, args);
	}
}
