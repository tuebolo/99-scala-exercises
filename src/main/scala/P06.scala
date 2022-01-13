package p06

import p05.*

def isPalindrome(l: List[Int]): Boolean = l match
  case Nil      => false
  case x :: Nil => true
  case x :: xs  => l == reverse(l)