package org.telatenko.kotlincrud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "MESSAGES")
data class Message(
    @Id @GeneratedValue var id: UUID?,
    val text: String
)
