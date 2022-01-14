package p11
import p09.* // 'pack' function from problem 9

def encodeModified(l: List[Char]): List[Any] =
  pack(l).map(x => if x.length > 1 then (x.length, x.head) else x.head)
