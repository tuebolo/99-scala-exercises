import org.scalatest.funsuite.AnyFunSuite
import p13.*

class P13Test extends AnyFunSuite:
  test("List with repeating elements") {
    assert(
      encodeDirect(
        List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
          'e')
      ) == List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    )
  }
