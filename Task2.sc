var player = Array((2021, "Sam", "India", 23, 2300, 3),(2021, "Ram", "India", 23, 300, 3), (2021, "Mano", "India", 23, 300, 13))
//1. Player with the best highest run scored.
player.sortWith(_._5 > _._5).take(1)(0)._2  // Output : Sam

//2. Top 5 players by run scored.

for(x <- player.sortWith(_._5 > _._5).take(5)){
  println(x._2)
}  // Output : Sam \n Ram \n Mano


//3. Top 5 players by wicket taken.

for(x <- player.sortWith(_._6 > _._6).take(5)){
  println(x._2)
}  // Output : Mano \n Sam \n Ram

//4. Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored.

player.sortBy(x => x._5 * 0.05 + x._6 * 5).reverse

// Output :
// val res11: Array[(Int, String, String, Int, Int, Int)] = 
// Array( (2021,Sam,India,23,2300,3), 
//        (2021,Mano,India,23,300,13), 
//        (2021,Ram,India,23,300,3))