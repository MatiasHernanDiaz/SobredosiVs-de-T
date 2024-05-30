import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec

class sobredosisSpec : DescribeSpec({
    isolationMode = IsolationMode.InstancePerTest

    //Arrange

    describe("Dado un programa"){
    val programaMayorRating = Programa(titulo = "Casados con hijos")
        it("Si tiene rating semanal maryor al valor"){
            //act

        }
    }
})