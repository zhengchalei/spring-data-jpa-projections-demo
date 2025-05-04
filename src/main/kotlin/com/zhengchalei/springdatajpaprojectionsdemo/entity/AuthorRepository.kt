package com.zhengchalei.springdatajpaprojectionsdemo.entity

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import java.util.Optional

interface AuthorRepository : JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {

    // 投影查询
    fun findDtoById(id: Long): AuthorInfo

}