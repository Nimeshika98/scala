
object Q3 extends App{
  def price(Nobooks:Int):Double = {
    var cover_price : Double = (24.95)*(0.6)*Nobooks;
    var shipping_costs : Double = 0.0;
    if(Nobooks > 50) {
      shipping_costs= (50*3)+((Nobooks-50)*(3.75));
    }
    else{
      shipping_costs= (Nobooks * 3);
    }
    var Total_cost : Double = cover_price + shipping_costs ;
    return Total_cost;
  }
  println("The total cost of books = " + price(60) );
}
