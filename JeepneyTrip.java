class JeepneyTrip {
  int discoutPassengers;
  int totalpassengers;
  double distance;
  
  JeepneyTrip(int discoutPassengers, int totalpassengers, double distance){
    this.discoutPassengers = discoutPassengers;
    this.totalpassengers = totalpassengers;
    this.distance = distance;
  }
}

//signature = double -> double
//purpose = Computes the fare change given fairPaid, number of passengers & distance
//stub
/*double fareChange(){
  return 0;
}
*/

//Examples
class ExamplesfareChange{
  ExamplesfareChange() {
    fareChange a = new fareChange(50, 7, 3);
    fareChange b = new fareChange(15.0, 1, 6);
    fareChange c = new fareChange(100, 10, 7);
  }
}

boolean testJeepneyTrip(Tester t){
  t.checkExpect(this.a.fareChange(1));
  t.checkExpect(this.b.fareChange(7.50));
  t.checkExpect(this.c.fareChange(20));
}

//template
//this.discountPassengers    - double
//this.totalPassengers  - int
//this.distance    - double
  
//body
double fareChange(){
  double totalFare()
    return this.farePaid- totalFare();
}

//totalFare
//signature = -> double
//purpose = Computes the total fare given the number of passengers 
//stub 
double totalFare(){
  double totalFare = 0;
  if (this.distance > 5)
    return totalFare += 0.50(this.distance - BASE_KM);
  else
    return 0;
}






  
