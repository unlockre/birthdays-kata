import com.keyway.repositories.EmployeesRepository
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EmployeesRepositoryTest {

    @Test
    fun `find employees from db returns the expected initial amount`() {
        val repository = EmployeesRepository()
        val employees = repository.findAllEmployees()

        assertEquals(4, employees.size)
    }
}