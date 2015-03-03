package org.frenchfrie;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;


@SpringBootApplication
public class Application extends WebMvcAutoConfigurationAdapter {

    @Override
    public void addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        //registry.addResourceHandler("/");
    }
}
