package org.telatenko.kotlincrud.service

import org.springframework.stereotype.Service
import org.telatenko.kotlincrud.repository.MessageRepository
import org.telatenko.kotlincrud.model.Message
import java.util.*

@Service
class MessageService(val db: MessageRepository) {

    fun findMesseges(): List<Message> = db.findAll()

    fun findMessageById(id: UUID): Message = db.findById(id).orElseThrow()

    fun save(message: Message) {
        db.save(message)
    }
}