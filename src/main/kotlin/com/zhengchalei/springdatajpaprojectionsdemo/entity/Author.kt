package com.zhengchalei.springdatajpaprojectionsdemo.entity

import jakarta.persistence.*

@Entity
class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long = 0,

    var name: String = "",

    @OneToMany(mappedBy = "author")
    var books: MutableList<Book> = mutableListOf()
)