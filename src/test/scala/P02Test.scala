import org.scalatest.funsuite.AnyFunSuite
import p02.*

class P02Test extends AnyFunSuite:
  test("Empty List") {
    intercept[NoSuchElementException] {
      penultimate(Nil)
    }
  }

  test("Second last element in List(1, 1, 2, 3, 5, 8) is 5") {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  test("Second last element in List(3, 6, 1) is 6") {
    assert(penultimate(List(3, 6, 1)) === 6)
  }