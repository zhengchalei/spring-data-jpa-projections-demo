package com.zhengchalei.springdatajpaprojectionsdemo.entity

interface AuthorRepository: org.springframework.data.jpa.repository.JpaRepository<com.zhengchalei.springdatajpaprojectionsdemo.entity.Author, kotlin.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<com.zhengchalei.springdatajpaprojectionsdemo.entity.Author> {
}