import org.scalatest.funsuite.AnyFunSuite
import p03.*

class P03Test extends AnyFunSuite:
  test("Empty List") {
    intercept[NoSuchElementException] {
      nth(2, Nil)
    }
  }

  test("nth element is negative") {
    intercept[NoSuchElementException] {
      nth(-2, List(1, 1, 2, 3, 5, 8))
    }
  }

  test("2nd element of List(1, 1, 2, 3, 5, 8)") {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) === 2)
  }