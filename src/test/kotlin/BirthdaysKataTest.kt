import com.keyway.BirthdaysKata
import com.keyway.domain.Employee
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class BirthdaysKataTest {

    private val employees = listOf(
        Employee("John", "john@keyway.com", "123, 5th Avenue", LocalDate.parse("1900-10-01", DateTimeFormatter.ISO_DATE)),
        Employee("Kevin", "kevin@keyway.com", "183, Bird St", LocalDate.parse("1980-07-20", DateTimeFormatter.ISO_DATE)),
        Employee("Robert", "rob@keyway.com", "725, Queens Ln", LocalDate.parse("1987-01-10", DateTimeFormatter.ISO_DATE)),
        Employee("Monique", "monique@keyway.com", "898, Rocket Ln", LocalDate.parse("1983-03-01", DateTimeFormatter.ISO_DATE))
    )

    @Test
    fun `given a date that matches with one employee birthday must send one greetings email`() {
        val date = LocalDate.parse("1980-07-20", DateTimeFormatter.ISO_DATE)
        val birthdaysKata = BirthdaysKata()
        birthdaysKata.sendNotifications(date)

        Assertions.fail<RuntimeException>("Implement this test")
    }

    @Test
    fun `given a date that matches with one employee birthday must no send greetings email`() {
        val date = LocalDate.parse("1966-09-23", DateTimeFormatter.ISO_DATE)
        val birthdaysKata = BirthdaysKata()
        birthdaysKata.sendNotifications(date)

        Assertions.fail<RuntimeException>("Implement this test")
    }
}