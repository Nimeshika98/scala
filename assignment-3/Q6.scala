import scala.io.StdIn.readInt
object Q6 extends App {
  println(" Enter the limit :")
  var n = readInt()
  def fib(n:Int):Int= n match{
    case n if n==0 => 0
    case n if n==1 => 1
    case n  => fib(n-1)+fib(n-2)
  }
  
  def fibSeq(n:Int):Any={
    if(n>0)  fibSeq(n-1)
    println(fib(n))
  }
  println(fibSeq(n))
  
}

