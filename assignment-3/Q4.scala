
import scala.io.StdIn.readInt
object Q4 extends App {
  println("Enter a number: ")
  var n = readInt()
  def iseven(n:Int):String= n%2 match{
    case 0 =>"even"
    case 1 =>"odd"
  }
  println(iseven(n));
}
