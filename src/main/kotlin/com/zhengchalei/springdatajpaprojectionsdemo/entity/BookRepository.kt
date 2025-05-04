package com.zhengchalei.springdatajpaprojectionsdemo.entity

interface BookRepository: org.springframework.data.jpa.repository.JpaRepository<com.zhengchalei.springdatajpaprojectionsdemo.entity.Book, kotlin.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<com.zhengchalei.springdatajpaprojectionsdemo.entity.Book> {
}