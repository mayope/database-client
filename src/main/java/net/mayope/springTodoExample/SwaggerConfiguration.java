package net.mayope.springTodoExample;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration public class SwaggerConfiguration {
    private final String projectDescription;

    public SwaggerConfiguration(@Value("${project.description}") String projectDescription){
        this.projectDescription = projectDescription;
    }

    @Bean
    public OpenAPI apiDocket() {
        return new OpenAPI()
                .info(
                        new Info().title("ToDo List App")
                                .description(projectDescription)
                                .version("0.0.1")
                );
    }

}
