import org.scalatest.funsuite.AnyFunSuite
import p14.*

class P14Test extends AnyFunSuite:
  test("List of characters") {
    assert(
      duplicate(List('a', 'b', 'c', 'c', 'd')) == List('a', 'a', 'b', 'b', 'c',
        'c', 'c', 'c', 'd', 'd')
    )
  }