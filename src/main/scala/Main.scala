import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Main extends App {
  val arr = mutable.ArrayBuffer[Int]()
  arr += 1
  arr.length
  arr.contains(3)
  arr.append(3)
  arr.indexOf(2)
  arr.isEmpty
  arr.nonEmpty
  arr.size
  arr.sortBy(a => a)
}
