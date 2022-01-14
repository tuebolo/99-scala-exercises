import p11.*
import org.scalatest.funsuite.AnyFunSuite

class P11Test extends AnyFunSuite:
  test("List with duplicate values") {
    assert(
      encodeModified(
        List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
          'e')
      ) == List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e'))
    )
  }
