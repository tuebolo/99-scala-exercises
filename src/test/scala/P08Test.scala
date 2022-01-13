import org.scalatest.funsuite.AnyFunSuite
import p08.*

class P08Test extends AnyFunSuite:
  test("List with duplicate elements") {
    assert(
      compress(
        List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
          'e')
      ) == List('a', 'b', 'c', 'a', 'd', 'e')
    )
  }
