package br.com.supportweb.asdevil

import br.com.supportweb.asdevil.document.Author
import br.com.supportweb.asdevil.document.Post
import br.com.supportweb.asdevil.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.time.LocalDate
import java.util.*

@Component
class DummyData : CommandLineRunner {

    @Autowired
    lateinit var postRepository: PostRepository

    override fun run(vararg args: String?) {
        val author: Author = Author(id = null, birthDate = LocalDate.of(1992, 11, 17), email = "horacio.dias92@gmail.com", name = "Horácio Dias")
        postRepository.deleteAll()
                .thenMany(Flux.just("API REST SPRINGBOOT", "Deploy de uma aplicação", "Java 8", "Github")
                        .map { title: String ->
                            Post(
                                    title = title,
                                    author = author,
                                    content = "EITA GIOVANA".toByteArray(),
                                    created = LocalDate.now(),
                                    id = UUID.randomUUID().toString()
                            )
                        }.flatMap(postRepository::save)).subscribe(System.out::println)
    }

}
