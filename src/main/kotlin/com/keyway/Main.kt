package com.keyway

import com.keyway.repositories.EmployeesRepository
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    BirthdaysKata().sendNotifications(LocalDate.parse("1900-10-01", DateTimeFormatter.ISO_DATE))
}

class BirthdaysKata {

    private val repository = EmployeesRepository()

    fun sendNotifications(date: LocalDate) {
        val employees = repository.findAllEmployees()

        //Send notifications, implement here all necessary to accomplish the exercise
    }
}