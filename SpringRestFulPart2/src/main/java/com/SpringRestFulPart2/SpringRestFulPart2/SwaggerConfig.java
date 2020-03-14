package com.SpringRestFulPart2.SpringRestFulPart2;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@Configuration
@EnableSwagger2
public class SwaggerConfig{
    public static final Contact DEFAULT_CONTACT =
            new Contact("Aman Sharma",
                    "http://www.tothenew.com",
                    "aman.sharma@tothenew.com");
    public static final ApiInfo Default =
            new ApiInfo("Api to Manage Different Users",
                    "Database for Users",
                    "1.0",
                    "urn:tos",
                    DEFAULT_CONTACT,
                    "Apache 2.0",
                    "http://www.apache.org/licenses/LICENSE-2.0",
                    new ArrayList<VendorExtension>());
  private static final Set<String> DEFAULT_PRODUCER_AND_COMSUMER=
            new HashSet<String>(Arrays.asList("application/json","application/xml"));
    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(Default)
                .produces(DEFAULT_PRODUCER_AND_COMSUMER)
                .consumes(DEFAULT_PRODUCER_AND_COMSUMER);
    }
}
