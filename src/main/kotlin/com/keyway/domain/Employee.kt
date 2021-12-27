package com.keyway.domain

import java.time.LocalDate

data class Employee(
    val name: String,
    val email: String,
    val phoneNumber: String,
    val birthday: LocalDate
)
