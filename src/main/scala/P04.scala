package p04

import java.util.NoSuchElementException
import scala.annotation.tailrec

// Find the number of elements of a list.
def length(l: List[Int]): Int = lengthAcc(l, 0)

@tailrec
def lengthAcc(l: List[Int], acc: Int): Int = l match
  case Nil     => acc
  case x :: xs => lengthAcc(xs, acc + 1)