/**
 * FileName: SwaggerConfig
 * Author:   wyr
 * Date:     2019/1/4 11:38
 * Description: Swagger配置
 */

package com.wyr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2  //启用Swagger
public class SwaggerConfig {
    public ApiInfo createApi(){
        return new ApiInfoBuilder().title("接口文档测试").description("模拟真实开发环境").
                contact(new Contact("java","http://wyr.com","908213292@qq.com")).build();
    }
    @Bean  //等价于<bean>标签
    public Docket createDod(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).select().
                apis(RequestHandlerSelectors.basePackage("com.wyr.controller")).build();
    }
}
