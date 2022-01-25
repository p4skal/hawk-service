package org.datausagetracing.service.usage

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface EndpointPropertyRepository: JpaRepository<EndpointProperty, UUID>