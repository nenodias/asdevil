package br.com.supportweb.asdevil.document

import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class Author(@Id val id: String? = null, val name: String, val birthDate: LocalDate, val email: String)

@Document
@Data
data class Post(@Id val id: String?, val title: String, val created: LocalDate, var author: Author, val content: String)