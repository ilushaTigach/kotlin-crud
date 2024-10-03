package org.telatenko.kotlincrud.controller

import org.springframework.web.bind.annotation.*
import org.telatenko.kotlincrud.model.Message
import org.telatenko.kotlincrud.service.MessageService
import java.util.UUID

@RestController
class MessageController(val service: MessageService) {

    @GetMapping("/")
    fun index(): List<Message> {
        return service.findMesseges()
    }

    @GetMapping("/{id}")
    fun index(@PathVariable("id") id:UUID): Message {
        return service.findMessageById(id)
    }

    @PostMapping("/")
    fun post(@RequestBody message: Message){
        service.save(message)
    }
}