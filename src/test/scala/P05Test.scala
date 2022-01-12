import org.scalatest.funsuite.AnyFunSuite
import p05.*

class P05Test extends AnyFunSuite:

  test("Empty list") {
    assert(reverse(List()) == List())
  }

  test("One element list") {
    assert(reverse(List(4)) == List(4))
  }

  test("Reverse list") {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }