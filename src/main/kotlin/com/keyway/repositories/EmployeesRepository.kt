package com.keyway.repositories

import com.keyway.clients.InMemoryDbClient
import com.keyway.domain.Employee

class EmployeesRepository {

    private val db = InMemoryDbClient()

    fun findAllEmployees(): List<Employee> {
        return db.findAllEmployees()
    }
}