package com.zhengchalei.springdatajpaprojectionsdemo.entity

/**
 * Projection for {@link com.zhengchalei.springdatajpaprojectionsdemo.entity.Author}
 */
interface AuthorInfo {
    val id: Long?
    val name: String?
    val books: List<BookInfo>?
}
