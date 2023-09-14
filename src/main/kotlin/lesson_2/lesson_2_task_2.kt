package lesson_2

fun main() {
    val employees = 50
    val employeesSalary = 30000
    val interns = 30
    val internsSalary = 20000
    val employeesSalaryExpenses = employees * employeesSalary
    val internsSalaryExpenses = interns * internsSalary
    val fullSalaryExpenses = employeesSalaryExpenses + internsSalaryExpenses
    val averageSalaryExpenses = (employeesSalaryExpenses + internsSalaryExpenses) / (employees + interns)
    println("Расходы на выплату зарплаты постоянных сотрудников: $employeesSalaryExpenses")
    println("Общие расходы по ЗП после прихода стажеров: $fullSalaryExpenses")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalaryExpenses")
}