package com.keyway.clients

import com.keyway.domain.Employee
import java.time.LocalDate
import java.time.format.DateTimeFormatter

// Do not modify this class
class PostgreDbClient: IDbClient {

    override fun findAllEmployees(): List<Employee> {
        throw RuntimeException("No server found")
    }
}