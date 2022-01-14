package p15

import scala.annotation.tailrec

def duplicateN(n: Int, l: List[Char]): List[Char] =

  @tailrec
  def duplNAcc(n: Int, l: List[Char], acc: List[Char]): List[Char] =
    l match
      case Nil => acc.reverse
      case x :: xs =>
        duplNAcc(n, xs, repeat(x, n, acc))

  @tailrec
  def repeat(x: Char, n: Int, acc: List[Char]): List[Char] =
    if n == 0 then acc
    else repeat(x, n - 1, x :: acc)

  duplNAcc(n, l, Nil)