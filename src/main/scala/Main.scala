import math._

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

  //6

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



}


