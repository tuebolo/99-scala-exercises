package p08

// Eliminate consecutive duplicates of list elements.
def compress(l: List[Any]): List[Any] = l match
  case Nil                       => Nil
  case x :: Nil                  => List(x)
  case x :: xs if (x == xs.head) => compress(xs)
  case x :: xs                   => x :: compress(xs)
