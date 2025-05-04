package com.zhengchalei.springdatajpaprojectionsdemo.entity

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface BookRepository : JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {

    // 投影查询
    fun findDtoById(id: Long): BookInfo

    // 根据 author 的 id 查询 book 实体
    fun findByAuthorId(authorId: Long): List<Book>
}