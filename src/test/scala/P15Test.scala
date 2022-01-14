import org.scalatest.funsuite.AnyFunSuite
import p15.*

class P15Test extends AnyFunSuite:
  test("List with repeated elements") {
    assert(
      duplicateN(3, List('a', 'b', 'c', 'c', 'd')) == List('a', 'a', 'a', 'b',
        'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')
    )
  }
