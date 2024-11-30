import scala.collection.mutable.ListBuffer
object ReverseWords extends App {
println(reverseWords("the sky is blue"))
  def reverseWords(s: String): String = {
    val splits = s.split(" ")
    var ind = splits.length - 1
    val output = new ListBuffer[String]
    while (ind >= 0){
      if (splits(ind).nonEmpty){
        output.append(splits(ind))
      }
      ind -= 1
    }
    output.mkString(" ")
  }

}
