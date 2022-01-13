package p10
import p09.* // 'pack' function from problem 9

// Run-length encoding of a list.
def encode(l: List[Char]): List[(Int, Char)] =
  pack(l).map(x => (x.length, x.head))