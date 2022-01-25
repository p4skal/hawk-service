package org.datausagetracing.service.usage

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UsageRepository : JpaRepository<Usage, UUID> {
    fun findAllByIdIn(ids: List<UUID>): List<Usage>
}