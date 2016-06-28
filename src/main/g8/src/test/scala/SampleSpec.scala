import org.scalatest._
import prop._
import Matchers._

class ExampleSpec extends PropSpec with PropertyChecks {

  property("the interleave method must interleave lists") {
    forAll { (a: List[Int], b: List[Int]) =>
      val interleaved = Interleaver.interleave(a, b)

      a.length + b.length shouldBe interleaved.length
    }
  }

}
