import p10.*
import org.scalatest.funsuite.AnyFunSuite

class P10Test extends AnyFunSuite:
  test("List with duplicate values") {
    assert(
      encode(
        List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
          'e')
      ) == List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    )
  }
