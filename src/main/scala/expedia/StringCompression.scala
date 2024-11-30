object StringCompression extends App {
  val arr = Array[Char]('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')
  val result = compress(arr)
  println(result)
  arr.foreach(c => print(c+", "))

  private def compress(chars: Array[Char]): Int = {
    val l = chars.length
    var result = 0
    var prevCh = chars(0)
    var cnt = 1
    var i = 1
    while (i < l) {
      val ch = chars(i)
      if (ch == prevCh) {
        cnt += 1
      } else {
        result = updateArray(chars, result, prevCh, cnt)
        prevCh = ch
        cnt = 1
      }
      i += 1
    }
    result = updateArray(chars, result, prevCh, cnt)
    result
  }

  private def updateArray(chars: Array[Char], idx: Int, ch: Char, cnt: Int): Int = {
    var tIdx = idx
    chars(tIdx) = ch
    tIdx += 1
    var tCnt = cnt
    if (cnt > 1) {
      cnt.toString.toCharArray.foreach(ch => {
        chars(tIdx) = ch
        tIdx += 1
      })

    }
    tIdx
  }
}
