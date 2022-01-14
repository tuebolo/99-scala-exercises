import org.scalatest.funsuite.AnyFunSuite
import p16.*

class P16Test extends AnyFunSuite:
  test("Long list") {
    assert(
      drop(
        3,
        List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
      ) == List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')
    )
  }