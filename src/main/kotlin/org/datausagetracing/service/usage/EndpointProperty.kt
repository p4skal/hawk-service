package org.datausagetracing.service.usage

import java.util.*
import javax.persistence.*

@Entity
class EndpointProperty {
    @Id
    lateinit var id: UUID

    @Column(nullable = false)
    lateinit var side: String

    @Column(nullable = false)
    lateinit var phase: String

    @Column(nullable = false)
    lateinit var key: String

    @Column(nullable = false)
    lateinit var value: String

    @ManyToOne
    @JoinColumn(name = "usage_id")
    lateinit var usage: Usage
}

fun List<EndpointProperty>.toMap(): Map<String, String> = this
    .map { it.key to it.value }
    .distinctBy { it.first }
    .toMap()