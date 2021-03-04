package com.easybiidemo.mybatisplusdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: czs
 * @Date: 2021-03-04 13:44
 * @ClassName: com.easybiidemo.mybatisplusdemo.config.SwaggerConfig
 * @Description:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * swagger文档地址
     * http://localhost:8090/swagger-ui.html#/
     * @return
     */

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.easybiidemo.mybatisplusdemo.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("练手项目")
                        .description("SpringBoot整合Swagger，详细信息......")
                        .version("1.0")
                        .contact(new Contact("啊啊啊啊","blog.csdn.net","aaa@gmail.com"))
                        .license("The Apache License")
                        .licenseUrl("http://www.baidu.com")
                        .build());
    }
}
