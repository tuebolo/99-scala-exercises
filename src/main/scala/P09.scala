package p09
import scala.annotation.tailrec
import p01.* // Last function from P01

// Pack consecutive duplicates of list elements into sublists.
def pack(l: List[Char]): List[List[Char]] =
  packHelper(l, List())

@tailrec
def packHelper(rem: List[Char], res: List[List[Char]]): List[List[Char]] =
  rem match
    case Nil => res.reverse
    case x :: xs =>
      res match
        case Nil => packHelper(xs, List(List(x)))
        case y :: ys =>
          if x == y.head then
            val newHead = x :: y
            packHelper(xs, newHead :: ys)
          else packHelper(xs, List(x) :: res)