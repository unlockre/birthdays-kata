import com.keyway.BirthdaysKata
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class BirthdaysKataTest {

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