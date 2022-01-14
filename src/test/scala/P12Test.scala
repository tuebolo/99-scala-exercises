import org.scalatest.funsuite.AnyFunSuite
import p12.*

class P12Test extends AnyFunSuite:
  test("List with tuples of Int and Char") {
    assert(
      decode(
        List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
      ) ==
        List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
          'e')
    )
  }
