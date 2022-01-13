import org.scalatest.funsuite.AnyFunSuite
import p07.*

class P07Test extends AnyFunSuite:

  test("List with one element") {
    assert(flatten(List(1)) == List(1))
  }

  test("List with one layer") {
    assert(flatten(List(1, 2, 3)) == List(1, 2, 3))
  }

  test("List with multiple layers") {
    assert(
      flatten(List(List(1, 1), 2, List(3, List(5, 8))))
        == List(1, 1, 2, 3, 5, 8)
    )
  }