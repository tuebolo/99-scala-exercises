package p05

import java.util.NoSuchElementException
import scala.annotation.tailrec

//@tailrec
def reverse(l: List[Int]): List[Int] = reverseAcc(l, List())

@tailrec
def reverseAcc(l: List[Int], nl: List[Int]): List[Int] = l match
  case Nil     => nl
  case x :: xs => reverseAcc(xs, x :: nl)