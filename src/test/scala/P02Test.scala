import org.scalatest.funsuite.AnyFunSuite
import p02.*

class P02Test extends AnyFunSuite:
  test("Last element in List(1, 1, 2, 3, 5, 8) is 8") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }