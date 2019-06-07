package br.com.supportweb.asdevil.service

import br.com.supportweb.asdevil.document.Post
import br.com.supportweb.asdevil.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface GenericService<T> {
    fun findAll(): Flux<T>

    fun findById(rating: String): Mono<T>

    fun save(entity: T): Mono<T>

    fun delete(id: String): Mono<T>
}

interface PostService : GenericService<Post> {
}

@Service
class PostServiceImpl : PostService {

    @Autowired
    lateinit  var postRepository: PostRepository

    override fun findAll(): Flux<Post> {
        return postRepository.findAll()
    }

    override fun findById(id: String): Mono<Post> {
        return postRepository.findById(id)
    }

    override fun save(post: Post): Mono<Post> {
        return postRepository.save(post)
    }

    override fun delete(id: String): Mono<Post> {
        val model : Mono<Post> = postRepository.findById(id)
        postRepository.deleteById(id)
        return model
    }

}