package com.biangbiang.todoList.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne


@Entity
class Task (
    @Id @GeneratedValue var id: Long? = null,
    var title: String,
    var content: String,
    var Created_time: LocalDateTime = LocalDateTime.now(),
    var Update_time: LocalDateTime,
    @ManyToOne var author: User,
    @ManyToOne var assignee: User,
    var deadline: LocalDateTime,
    var overdue: Boolean = true
    )

