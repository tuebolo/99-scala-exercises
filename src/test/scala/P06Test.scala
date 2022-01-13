import org.scalatest.funsuite.AnyFunSuite
import p06.*

class P06Test extends AnyFunSuite:

  test("List is empty") {
    assert(isPalindrome(List()) == false)
  }

  test("List with one letter") {
    assert(isPalindrome(List(4)) == true)
  }

  test("List is a palindrome") {
    assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }

  test("List is not a palindrome") {
    assert(isPalindrome(List(1, 2, 3, 4, 5)) == false)
  }