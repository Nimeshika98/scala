import scala.io.StdIn.readInt
object Q1 extends App {
  println("Enter a number : ");
  var p = readInt()
  def Gcd (a:Int,b:Int):Int=b match{
    case 0 => a
    case b if b>a => Gcd(b,a)
    case _ => Gcd(b, a%b)
  }
  def prime(p:Int, n:Int=2):Boolean = n match {
    case x if (p==x) => true
    case x  if (Gcd(p,x)>1) => false
    case x => prime(p,x+1)
  }
  println(prime(p));
}
 
