package task5

import kotlin.math.round

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)

fun main() {
    // 1. partition: lulus (>= 70) dan gagal
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    // 2. tertinggi dan terendah, null ditangani dengan ?.let
    students.maxByOrNull { it.score }
        ?.let { println("Top scorer : ${it.name} (${it.score})") }
    students.minByOrNull { it.score }
        ?.let { println("Low scorer : ${it.name} (${it.score})") }

    // 3. rata-rata dengan fold, dibulatkan 1 desimal
    val total = students.fold(0) { acc, s -> acc + s.score }
    val average = round(total.toDouble() / students.size * 10) / 10
    println("Class average: $average")

    // 4. ringkasan dengan buildString
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach {
            val status = if (it.score >= 70) "PASS" else "FAIL"
            appendLine("${it.name.padEnd(9)}${it.score}  $status")
        }
    }
    print(report)
}