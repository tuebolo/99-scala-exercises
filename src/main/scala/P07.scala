package p07

//  Flatten a nested list structure.
def flatten(l: List[Any]): List[Any] = l match
  case Nil                  => Nil
  case (x: List[Any]) :: xs => flatten(x ::: flatten(xs))
  case x :: xs              => List(x) ::: flatten(xs)