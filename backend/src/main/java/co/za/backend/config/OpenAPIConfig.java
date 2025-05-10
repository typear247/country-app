package co.za.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    OpenAPI openAPI(){
        return new OpenAPI()
                .addServersItem(new Server().url("/backend/api"))
                .info(getInfo());
    }

    @Bean
    Info getInfo(){
        return new Info()
                .title("Old Mutual Country API")
                .description("This is Old Mutual country backend service api")
                .version("1.0.0")
                .contact(new Contact().email("typear247@gmail.com").name("Old Mutual Country backend service API"));
    }

    @Bean
    public GroupedOpenApi usersGroup() {
        return GroupedOpenApi.builder()
                .group("Country Controller")
                .pathsToMatch("/countries/**")
                .build();
    }
}
