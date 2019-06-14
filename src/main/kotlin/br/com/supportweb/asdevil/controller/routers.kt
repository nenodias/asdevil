package br.com.supportweb.asdevil.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.*

/*
@Configuration
class PostRouter {

    @Bean
    fun route(@Autowired handler: PostHandler): RouterFunction<out ServerResponse> {
        val findAll = (handler::findAll as HandlerFunction<*>)!!
        val findById = (handler::findById as HandlerFunction<*>)!!
        val save = (handler::save as HandlerFunction<*>)!!
        return  RouterFunctions.route(RequestPredicates.GET("/post").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),findAll )
                .andRoute(RequestPredicates.GET("/post/{id}").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), findById)
                .andRoute(RequestPredicates.POST("/post").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), save) as RouterFunction<ServerResponse>

    }
}

 */