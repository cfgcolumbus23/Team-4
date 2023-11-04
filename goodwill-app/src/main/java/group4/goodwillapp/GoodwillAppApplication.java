package group4.goodwillapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GoodwillAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodwillAppApplication.class, args);
	}

	@Bean
    public WebMvcConfigurer corsConfigurer() {

		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowCredentials(true)
						.allowedOrigins("https://localhost:3000") // Replace with your allowed origins
						.allowedMethods("*");
			}
		};
	}
}
