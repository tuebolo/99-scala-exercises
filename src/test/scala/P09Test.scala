import org.scalatest.funsuite.AnyFunSuite
import p09.*

class P09Test extends AnyFunSuite:
  test("List with repeated elements") {
    assert(
      pack(
        List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
          'e')
      ) == List(
        List('a', 'a', 'a', 'a'),
        List('b'),
        List('c', 'c'),
        List('a', 'a'),
        List('d'),
        List('e', 'e', 'e', 'e')
      )
    )
  }
