package com.keyway.clients

import com.keyway.domain.Employee
import java.time.LocalDate
import java.time.format.DateTimeFormatter

// Do not modify this class
class InMemoryDbClient: IDbClient {

    private val employees = listOf(
        Employee("John", "john@keyway.com", "123, 5th Avenue", LocalDate.parse("1900-10-01", DateTimeFormatter.ISO_DATE)),
        Employee("Kevin", "kevin@keyway.com", "183, Bird St", LocalDate.parse("1980-07-20", DateTimeFormatter.ISO_DATE)),
        Employee("Robert", "rob@keyway.com", "725, Queens Ln", LocalDate.parse("1987-01-10", DateTimeFormatter.ISO_DATE)),
        Employee("Monique", "monique@keyway.com", "898, Rocket Ln", LocalDate.parse("1983-03-01", DateTimeFormatter.ISO_DATE))
    )

    override fun findAllEmployees(): List<Employee> {
        if (employees.size > 3) {
            throw Exception("in memory free trial does not support more than 3 elements in the db")
        }
        return employees
    }
}