import org.scalatest.funsuite.AnyFunSuite
import p04.*

class P04Test extends AnyFunSuite:
  test("Empty List") {
    assert(length(List()) === 0)
  }

  test("2nd element of List(1, 1, 2, 3, 5, 8)") {
    assert(length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  test("Long list") {
    assert(length(List.range(0, 10000)) === 10000)
  }