package com.zhengchalei.springdatajpaprojectionsdemo.entity

/**
 * Projection for {@link com.zhengchalei.springdatajpaprojectionsdemo.entity.Book}
 */
interface BookInfo {
    val id: Long?
    val title: String?
    val author: AuthorInfo?
}
