package expedia

/**
 * You are given two string (like two statements). Y
 * ou have to remove all the words of second-string from first string and print
 * the remaining first string. Please maintain the order of the remaining words
 * from the first string. You will be only removing the first word, not all
 * occurrence of a word. Example:
 * Str1   = "A Statement is a Statement"
 * Str2   = "Statement a"
 * Output = "A is Statement"
 */
import scala.collection.mutable
object RemoveMatchingWordBtwTwoLine extends App {
  println(removeMatchString("A Statement is a Statement", "Statement a"))
  def removeMatchString(str1: String, str2: String): String = {
    val split1 = str1.split(" ")
    val split2 = str2.split(" ")
    val list = mutable.ListBuffer[String]()
    split1.foreach(str => {
      if (str.nonEmpty){
        if (!split2.contains(str)){
          list.append(str)
        } else {
          split2(split2.indexOf(str)) = ""
        }
      }
    })
    list.mkString(" ")
  }
}
