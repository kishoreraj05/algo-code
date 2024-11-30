import scala.collection.mutable

object ValidParentheses extends App {
  println(isValid("()[]{}"))

  private def isValid(s: String): Boolean = {
    var status = true
    val stack = mutable.Stack[Char]()
    val map = Map[Char, Char](')' -> '(', ']' -> '[')
    var idx = 0
    while (idx < s.length && status) {
      val ch = s.charAt(idx)
      if (ch == '(' || ch == '[') {
        stack.push(ch)
      } else {
        val x = if (stack.nonEmpty) stack.pop() else 'A'
        val mapVal = if (map.contains(ch)) map(ch) else 'B'
        if (x != mapVal) {
          status = false
        }
      }
      idx = idx + 1
    }
    status
  }
}
