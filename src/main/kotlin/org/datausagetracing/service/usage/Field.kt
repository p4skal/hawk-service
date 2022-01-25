package org.datausagetracing.service.usage

import java.util.*
import javax.persistence.*

@Entity
class Field {
    @Id
    lateinit var id: UUID

    @Column(nullable = false)
    lateinit var side: String

    @Column(nullable = false)
    lateinit var phase: String

    @Column(nullable = false)
    lateinit var namespace: String

    @Column(nullable = false)
    lateinit var format: String

    @Column(nullable = false)
    lateinit var path: String

    @Column(nullable = false)
    var count: Int = 0

    @ManyToOne
    @JoinColumn(name = "usageId")
    lateinit var usage: Usage
}