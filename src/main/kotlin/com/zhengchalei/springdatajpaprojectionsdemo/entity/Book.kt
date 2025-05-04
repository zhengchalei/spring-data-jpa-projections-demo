package com.zhengchalei.springdatajpaprojectionsdemo.entity

import jakarta.persistence.*

@Entity
class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long = 0,

    @Column(nullable = false)
    var title: String,

    @ManyToOne
    @JoinColumn(name = "author_id")
    var author: Author
)