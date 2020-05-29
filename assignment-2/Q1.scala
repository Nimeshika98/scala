
object Q1 extends App{
  def nomal(h1:Int):Int = h1*150;
  def ot(h2:Int):Int = h2*75;
  def income(h1:Int,h2:Int):Int = nomal(h1)+ot(h2);
  def tax(income:Int):Double= income*0.1;
  def take_home(h1:Int,h2:Int):Double= income(h1,h2) - tax(income(h1,h2));
  println("take home salary per week = " + take_home(40,20));
}
