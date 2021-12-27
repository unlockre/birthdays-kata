package com.keyway.clients

import com.keyway.domain.Employee

interface IDbClient {
    fun findAllEmployees(): List<Employee>
}
