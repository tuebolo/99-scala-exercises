import org.scalatest.funsuite.AnyFunSuite
import p17.*

class P17Test extends AnyFunSuite:
  test("Long list") {
    assert(
      split(
        3,
        List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
      ) == (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    )
  }
