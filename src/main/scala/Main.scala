object Main extends App {

  //1
  def circleArea ( radius: Double) = {
    var area = math.Pi * radius * radius
    println(area)
  }

  circleArea(6)


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
