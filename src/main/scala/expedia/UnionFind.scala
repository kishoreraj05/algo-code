package expedia

class UnionFind(n: Int) {
  val parent = (0 until n).toArray
  val rank = Array.fill(n)(0)

  def find(x: Int): Int = {
    if (parent(x) != x) {
      parent(x) = find(parent(x))
    }
    parent(x)
  }

  def union(x: Int, y: Int): Boolean = {
    val parentX = find(x)
    val parentY = find(y)
    if (parentX == parentY)
      return false
    if (rank(parentX) > rank(parentY)) {
      parent(parentY) = parentX
    } else if (rank(parentY) > rank(parentX)) {
      parent(parentX) = parentY
    } else {
      parent(parentX) = parentY
      rank(parentY) =  rank(parentY) + 1
    }
    true
  }
}
