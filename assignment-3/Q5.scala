import scala.io.StdIn.readInt
object Q5 extends App {
  println("Enter a limit =");
  var n = readInt()
  def  iseven(n:Int):Boolean = n%2 match{
    case 0 => true
    case 1 => false
  }
  def evenSeq(n:Int):Any={
    if(n>0) evenSeq(n-1)
    if(iseven(n)== true){
      if(n>0) println(n)
    }
    
  }
  println(evenSeq(n))
  
}
