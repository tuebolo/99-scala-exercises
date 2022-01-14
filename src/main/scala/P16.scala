package p16

import scala.annotation.tailrec

def drop(n: Int, l: List[Char]): List[Char] =
  dropAcc(n, n, l, List())

@tailrec
def dropAcc(n: Int, i: Int, l: List[Char], acc: List[Char]): List[Char] =
  l match
    case Nil => acc.reverse
    case x :: xs =>
      if i == 1 then dropAcc(n, n, xs, acc)
      else dropAcc(n, i - 1, xs, x :: acc)
