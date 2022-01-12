import org.scalatest.funsuite.AnyFunSuite
import p01.*

class P01Test extends AnyFunSuite:
  test("Last element in List(1, 1, 2, 3, 5, 8) is 8") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }