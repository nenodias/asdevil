package br.com.supportweb.asdevil.controller

import br.com.supportweb.asdevil.document.Post
import br.com.supportweb.asdevil.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class PostController {

    @Autowired
    lateinit var postService: PostService

    @GetMapping("/")
    fun index(): Mono<String> {
        return Mono.just("Hello")
    }

    @GetMapping("/post")
    fun findAll(): Flux<Post> {
        return postService.findAll()
    }

    @GetMapping("/post/{id}")
    fun findOne(@PathVariable id:String): Mono<Post> {
        return postService.findById(id)
    }

    @PostMapping("/post")
    fun save(@RequestBody post :Post) : Mono<Post> {
        return postService.save(post)
    }

    @DeleteMapping("/post/{id}")
    fun delete(@PathVariable id:String): Mono<Post> {
        return postService.delete(id)
    }

}