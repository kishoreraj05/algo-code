import scala.collection.mutable.ListBuffer
object MergedIntervals extends App {
  val array = Array(
    Array(1,5),
    Array(2, 4),
    Array(6, 8),
    Array(0, 2)
  )
  val output = merge(array)
  output.foreach(arr => {
    arr.foreach(a => print(a+","))
    println("")
  })
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    val sortedIntervals = intervals.sortWith(_(0) < _(0))
    val linkedList = new ListBuffer[Array[Int]]()
    sortedIntervals.foreach(arr => {
      if (linkedList.isEmpty || linkedList.last(1) < arr(0)) {
        linkedList.append(arr)
      } else {
        linkedList.last(1) = math.max(linkedList.last(1), arr(1))
      }
    })
    linkedList.toArray
  }
}
