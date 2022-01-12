import org.scalatest.funsuite.AnyFunSuite

class P03Test extends AnyFunSuite:
  test("Last element in List(1, 1, 2, 3, 5, 8) is 8") {
    assert(p03.last(List(1, 1, 2, 3, 5, 8)) === 8)
  }
