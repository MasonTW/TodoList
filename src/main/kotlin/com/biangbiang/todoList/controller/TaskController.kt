package com.biangbiang.todoList.controller

import com.biangbiang.todoList.entity.User
import org.springframework.beans.factory.annotation.Autowired
import com.biangbiang.todoList.service.TaskService
import org.springframework.scheduling.config.Task
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Collections.emptyList

@RestController
@RequestMapping("/user")
class TaskController {


    @GetMapping("/all")
    fun getTasksByUser(): String {
        return "dsdsda"
    }
}