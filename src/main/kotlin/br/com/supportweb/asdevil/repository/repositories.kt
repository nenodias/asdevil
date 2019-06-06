package br.com.supportweb.asdevil.repository

import br.com.supportweb.asdevil.document.Post
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PostRepository : ReactiveMongoRepository<Post, String> {

}