package com.zhengchalei.springdatajpaprojectionsdemo

import com.zhengchalei.springdatajpaprojectionsdemo.entity.*
import jakarta.transaction.Transactional
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpringDataJpaProjectionsDemoApplicationTests {

    @Autowired
    lateinit var authorRepository: AuthorRepository

    @Autowired
    lateinit var bookRepository: BookRepository

    @Transactional
    @Test
    fun contextLoads() {
        // 创建 author 实体
        val author = Author(name = "张三")
        authorRepository.saveAndFlush(author)

        // 创建 book 实体
        val book = Book(title = "Spring Data JPA 教程", author = author)
        bookRepository.saveAndFlush(book)
        
        // 根据 author 的 id 查询 book 实体
        val books = bookRepository.findByAuthorId(author.id)
        println("books: ${books.size}")
        assert(books.size == 1)
        assert(books[0].title == "Spring Data JPA 教程")
        assert(books[0].author.id == author.id)

        // 查询 book 实体
        val bookDTO = bookRepository.findDtoById(book.id)
        println("bookDTO.title: ${bookDTO.title}")
        println("bookDTO.author.name: ${bookDTO.author?.name}")
        assert(bookDTO.title == "Spring Data JPA 教程")
        assert(bookDTO.author?.name == "张三")

        // 查询 author 实体
        val authorDTO = authorRepository.findDtoById(author.id)
        println("authorDTO.name: ${authorDTO.name}")
        println("authorDTO.books: ${authorDTO.books?.size}")
        assert(authorDTO.name == "张三")
        assert(authorDTO.books?.size == 1)
        assert(authorDTO.books?.get(0)?.title == "Spring Data JPA 教程")
    }

}