package com.biangbiang.todoList.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User (
    @Id @GeneratedValue var id: Long? = null,
    var login: String,
    var firstname: String,
    var lastname: String,
    var is_delete: Boolean,
    var account: String,
    var password: String
    )

