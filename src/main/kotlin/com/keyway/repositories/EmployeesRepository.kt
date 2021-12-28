package com.keyway.repositories

import com.keyway.clients.IDbClient
import com.keyway.clients.PostgreDbClient
import com.keyway.domain.Employee

class EmployeesRepository {

    private val db: IDbClient = PostgreDbClient()

    fun findAllEmployees(): List<Employee> {
        return db.findAllEmployees()
    }
}