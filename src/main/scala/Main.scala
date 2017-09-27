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

  //6 is Palidrome?

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
