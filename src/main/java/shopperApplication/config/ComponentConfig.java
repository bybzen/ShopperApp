package shopperApplication.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.client.RestTemplate;
import shopperApplication.ShopperAPIService.CustomRestTemplateCustomizer;
import shopperApplication.ShopperAPIService.ShopperAPIService;

public class ComponentConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
//
//    @Bean
//    public ShopperAPIService service (RestTemplate restTemplate ){
//        return new ShopperAPIService(restTemplate);
//    }


    @Bean
    public CustomRestTemplateCustomizer customRestTemplateCustomizer() {
        return new CustomRestTemplateCustomizer();
    }

    @Bean
    @DependsOn(value = {"customRestTemplateCustomizer"})
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder(customRestTemplateCustomizer());
    }

}
