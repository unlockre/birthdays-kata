package com.keyway

import com.keyway.repositories.EmployeesRepository
import java.time.LocalDate

class BirthdaysKata {

    private val repository = EmployeesRepository()

    fun sendNotifications(date: LocalDate) {
        val employees = repository.findAllEmployees()

        //Send notifications, implement here all necessary to accomplish the exercise
    }
}