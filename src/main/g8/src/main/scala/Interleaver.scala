object Interleaver {
  def interleave[T](a: List[T], b: List[T]): List[T] = {
    if (a.isEmpty) b
    else if (b.isEmpty) a
    else a.head :: b.head :: interleave(b.tail, a.tail)
  }
}
