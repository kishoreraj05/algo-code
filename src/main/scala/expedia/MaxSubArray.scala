object MaxSubArray extends App {
  println(maxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4)))
  def maxSubArray(nums: Array[Int]): Int = {
    var maxSum = nums(0)
    var currSub = nums(0)
    var i = 1
    while (i < nums.length){
      currSub = math.max(0, currSub) + nums(i)
      maxSum = math.max(maxSum, currSub)
      i += 1
    }
    maxSum
  }
}
