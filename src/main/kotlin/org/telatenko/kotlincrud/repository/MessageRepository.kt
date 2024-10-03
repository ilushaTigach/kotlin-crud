package org.telatenko.kotlincrud.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.telatenko.kotlincrud.model.Message
import java.util.UUID

interface MessageRepository: JpaRepository<Message, UUID>