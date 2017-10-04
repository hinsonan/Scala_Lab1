import math._
import scala.collection.mutable.ListBuffer
object Main extends App {

  //1
  def circleArea ( radius: Double) = {
    math.Pi * radius * radius
  }

  println(circleArea(6))

  //2
  def hypotenuse(side1: Double, side2:Double) ={
    sqrt((side1 * side1) + (side2 * side2))
  }

  println(hypotenuse(3,4))

  //3
  def reverseDigits(num: Int) = {

      def reverset(x : Int, acc : Int =0):Int = {
        if(x == 0)
          acc
        else{
          if(Math.abs(Int.MaxValue / 10)  < Math.abs(acc)) 0 else
            reverset(x/10,acc*10+(x%10))
        }
      }
      reverset(num)

  }

  println(reverseDigits(13))

  //4
  def conditionalRemove(removeString: String,list: List[String]) = {
    val length = list.length
    if(removeString.equals(list(length-1))){
      list.patch(length-1, Nil, 1)

    }
    else{
      list
    }

  }

  println(conditionalRemove("b", List("b", "a")))

  //5

  def isPalidrome( s: String) = {
    val sanitized = s.toLowerCase.replace(" ","").replaceAll("""[\p{Punct}]""", "")
    if (sanitized.reverse == sanitized){
      println(true)
    }
    else{
      println(false)
    }


  }
  isPalidrome("racecar")
  isPalidrome("evee")

  //6
  def isPerfectNumber(num: Int) : (Boolean, List[Int]) = {
    var list = ListBuffer[Int]()

    var sum = 0
    for (i <- 1 to num -1 ){
      if((num % i) == 0){
        sum = sum + i
        list += i

      }

    }
    if(sum == num){
      return (true, list.toList)
    }
    else{
      return (false, list.toList)
    }


  }

  println(isPerfectNumber(6))

  println(Stats.mean(List(5.0, 4.0, 3.0)))
  println(Stats.min(List(5.0, 4.0, 3.0)))
  println(Stats.max(List(5.0, 4.0, 3.0)))
  println(Stats.mode(List(5.0, 4.0, 3.0, 3.0)))



  FoldStats.mean(List(3.0, 2.0, 4.0))
}

//7
/*class ComplexNumber(x: Int){
  var num = x
  def get(): Int ={
    return num
  }
  def set(newNum: ComplexNumber) ={
    num = newNum
  }
  def Add(x: ComplexNumber) = {

  }
}*/

//8
object Stats{
  def mean(list: List[Double]) ={
    list.sum / list.length
  }
  def min(list: List[Double])={
    //val mininimumNumber = list.reduceLeft(FindLeast())
    var minValue = Double.MaxValue
    for(i <- 0 to list.length-1){

      if(list(i) < minValue){
        minValue = list(i)
      }

    }
    minValue
  }
  def max(list: List[Double]) ={
    var maxValue = -Double.MaxValue
    for(i <- 0 to list.length-1){

      if(list(i) > maxValue){
        maxValue = list(i)
      }

    }
    maxValue
  }
  def mode(list: List[Double])={
    var maxValue = 0.0
    var maxCount = 0.0
    var i = 0
    while (i < list.length - 1) {
      var count = 0
      var j = 0
      while (j < list.length - 1) {
        if (list(j) == list(i)) {
          count += 1; count
        }

        {
          j += 1; j
        }
      }
      if (count > maxCount) {
        maxCount = count
        maxValue = list(i)
      }

      {
        i += 1; i
      }
    }
    maxValue
  }



}



//9
object FoldStats{
  def mean(list: List[Double]) ={
    var total = list.fold(0.0){
      (z, i) => z + i
    }
    println(total / list.length)
  }
  /*def min(list: List[Double])={
    var min = 0
    list.fold(list(0)){
      (z, i) => if(i < z)  else 0
    }
  }*/
}


