
object Q1 extends App{
  val P1 = Point(2,3)
  val P2 = Point(5,6)
  val P3 = P1.move(2,3)

  println(P1)
  println(P2)
  println(P3)

  val P4 = P1+P2
  println(P4)

  println(P1.distance(P2))
  println(P1.invert)

}
case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)
  def +(n1:Point) = Point(n1.x + this.x, n1.y + this.y)
  def distance(n1:Point) = Point(this.x - n1.x, this.y - n1.y)
  def invert() = Point(this.y, this.x)
}
