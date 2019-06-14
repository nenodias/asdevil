package br.com.supportweb.asdevil.controller

import br.com.supportweb.asdevil.document.Post
import br.com.supportweb.asdevil.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

/*
@Component
class PostHandler {

    @Autowired
    lateinit var postService:PostService

    fun findAll() = ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(postService.findAll(), Post::class.java)

    fun findById(request: ServerRequest):Mono<ServerResponse>{
        val id : String = request.pathVariable("id")
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(postService.findById(id), Post::class.java)
    }

    fun save(request: ServerRequest):Mono<ServerResponse>{
        val  entidade: Mono<Post> = request.bodyToMono(Post::class.java)
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(entidade.flatMap(postService::save), Post::class.java))
    }

    fun delete(request: ServerRequest):Mono<ServerResponse>{
        val id : String = request.pathVariable("id")
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(postService.delete(id), Post::class.java)
    }
}

 */