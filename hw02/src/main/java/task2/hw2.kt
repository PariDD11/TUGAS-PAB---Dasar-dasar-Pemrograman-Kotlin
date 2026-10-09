package com.example.hw02.task2

// Part A
fun printDeadlineStatus(daysRemaining: Int) {
    if (daysRemaining < 0) {
        println("Overdue")
    } else if (daysRemaining == 0) {
        println("Due today")
    } else {
        println("Upcoming")
    }
}

// Part B
fun printMonth(month: Int) {
    val monthName = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }
    println("Month $month: $monthName")
}

fun main() {
    // Part A: tes dengan -1, 0, dan 2
    printDeadlineStatus(-1)
    printDeadlineStatus(0)
    printDeadlineStatus(2)

    // Part B: tes dengan 9 dan 13
    printMonth(9)
    printMonth(13)
}