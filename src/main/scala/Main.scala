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
    println(num)
  }
  reverseDigits(13)


  //4
  def conditionalRemove(removeString: String,list: List[String]) = {
    val length = list.length
    if(removeString.equals(list(length-1))){
      list.patch(length-1, Nil, 1)

    }
    else{
      list
    }
    println(list)
  }

  conditionalRemove("b", List("b", "a"))

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
  def isPerfectNumber(num: Int) = {
    var list = ListBuffer[Int]()

    var sum = 0
    for (i <- 1 to num -1 ){
      if((num % i) == 0){
        sum = sum + i
        list += i

      }

    }
    if(sum == num){
      println((true, list.toList))
    }
    else{
      println((false, list.toList))
    }


  }

  isPerfectNumber(6)

  Stats.mean(List(5.0, 4.0, 3.0))
  Stats.min(List(5.0, 4.0, 3.0))
  Stats.max(List(5.0, 4.0, 3.0))
  Stats.mode(List(5.0, 4.0, 3.0, 3.0))
  Stats.median(List(5.0, 4.0, 3.0, 3.0))



  FoldStats.mean(List(3.0, 2.0, 4.0))
  FoldStats.min(List(3.0, 2.0, 4.0))
  FoldStats.max(List(3.0, 2.0, 4.0))

  val x = new ComplexNumber(5, 3)
  x.Add(new ComplexNumber(3,5))
  println(x.toString)
}

//7
class ComplexNumber (val real: Double, val complex: Double) {

  def Add(addend: ComplexNumber) = new ComplexNumber(this.real + addend.real, this.complex + addend.complex)
  def Subtract(subtrahend: ComplexNumber) = new ComplexNumber(this.real - subtrahend.real, this.complex - subtrahend.complex)
  def Multiply(multiplicand: ComplexNumber) = {
    val realPart = (this.real * multiplicand.real) - (this.complex * multiplicand.complex)
    val complexPart = (this.real * multiplicand.complex) + (this.complex * multiplicand.real)
    new ComplexNumber(realPart, complexPart)
  }

  def Conjugate = new ComplexNumber(this.real, this.complex * -1)

  def Divide (divisor: ComplexNumber) = {
    val numerator = this Multiply  divisor.Conjugate
    val denominator = divisor Multiply  divisor.Conjugate
    new ComplexNumber(numerator.real / denominator.real, numerator.complex / denominator.real)
  }

  def Abs = sqrt(pow(this.real, 2) + (pow(this.complex, 2)))

  def Reciprocal = this.Conjugate Divide  new ComplexNumber(pow(this.Abs, 2), 0)

  override def toString = {
    if(complex > 0) {
      s"$real + ${complex}i"
    }
    else {
      s"$real - ${complex * -1}i"
    }
  }
}


//8
object Stats{
  def mean(list: List[Double]) ={
    println(list.sum / list.length)
  }
  def min(list: List[Double])={
    //val mininimumNumber = list.reduceLeft(FindLeast())
    var minValue = Double.MaxValue
    for(i <- 0 to list.length-1){

      if(list(i) < minValue){
        minValue = list(i)
      }

    }
    println(minValue)
  }
  def max(list: List[Double]) ={
    var maxValue = -Double.MaxValue
    for(i <- 0 to list.length-1){

      if(list(i) > maxValue){
        maxValue = list(i)
      }

    }
    println(maxValue)
  }
  def mode (liOne: List[Double]) = {
    var elements = collection.mutable.Map[Double, Int]()
    var i = 0
    var mostOccurances = 0.0
    while ( i <= (liOne.length - 1)){
      var n = 0
      var acc = 0
      while ( n <= (liOne.length - 1)){
        if (liOne(i) == liOne(n)){
          acc = acc + 1
        }
        n = n + 1
      }
      elements = elements + (liOne(i) -> acc)
      i = i + 1
    }

    mostOccurances = elements.maxBy(_._2)._1

    println(mostOccurances)
  }

  def median (liOne: List[Double])= {
    var middle = 0.0
    var isEven = liOne.length % 2
    if (isEven == 0 ){
      middle = ((liOne((liOne.length / 2) - 1) + liOne(liOne.length / 2)) / 2)

    }
    else {
      middle = (liOne(round(liOne.length / 2)))
    }

    println(middle)
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
  def min(list: List[Double])= {
    var min = Double.MaxValue
    list.fold(Double.MaxValue) {
      (z, i) =>
        if (min > i) {
          min = i
          i
        }
        else {
          i
        }
    }
    println(min)
  }
  def max(list: List[Double]) = {
    var max = Double.MinValue
    list.fold(Double.MinValue) {
      (z, i) =>
        if (max < i) {
          max = i
          i
        }
        else {
          i
        }
    }
    println(max)
  }


}


