import scala.collection.mutable

/**
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
 *
 * Return the sorted array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,2,2,3]
 * Output: [3,1,1,2,2,2]
 * Explanation: "3" has a frequency of 1, "1" has a frequency of 2, and "2" has a frequency of 3.
 * Example 2:
 *
 * Input: nums = [2,3,1,3,2]
 * Output: [1,3,3,2,2]
 * Explanation: "2" and "3" both have a frequency of 2, so they are sorted in decreasing order.
 * Example 3:
 *
 * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
 * Output: [5,-1,4,4,-6,-6,1,1,1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * -100 <= nums[i] <= 100
 */
object SortArrayByFreq extends App {
  val output = frequencySort(Array(2,3,1,3,2))
  println(output.mkString(", "))
  def frequencySort(nums: Array[Int]): Array[Int] = {
    val map = new mutable.HashMap[Int, Int]()
    nums.foreach(num => {
      if (map.contains(num)) {
        map.put(num, map(num) + 1)
      } else {
        map.put(num, 1)
      }
    })
    val output = new Array[Int](nums.length)
    var j = 0
    map.toSeq.sortBy(t => (t._2, -t._1)).foreach(t => {
      var i = t._2
      while (i > 0){
        output(j) = t._1
        j += 1
        i -= 1
      }
    })
    output
  }
}
