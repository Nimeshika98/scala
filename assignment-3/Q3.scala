
import scala.io.StdIn.readInt
object Q3 extends App {
  println("Enter a number ");
  var n = readInt()
  def sum(n:Int):Int={
    n match{
      case 1 => n
      case _ => n + sum(n-1);
    }
  }
  println("sum = " + sum(n));
}
