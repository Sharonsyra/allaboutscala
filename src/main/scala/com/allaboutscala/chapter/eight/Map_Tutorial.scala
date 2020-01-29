package com.allaboutscala.chapter.eight

object Map_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts1")

  println("\nStep 2: How to append the word Donut to each element using the map function")
  val donuts2: Seq[String] = donuts1.map(_ + " Donut")
  println(s"Elements of donuts2 = $donuts2")

  println("\nStep 3: How to create a donut sequence with one None element")
  val donuts3: Seq[AnyRef] = Seq("Plain", "Strawberry", None)
  donuts3.foreach(println(_))

  println("\nStep 4: How to filter out the None element using map function")
  val donuts4: Seq[String] = donuts3.map {
    case donut: String => donut + " Donut"
    case None => "Unknown Donut"
  }
  println(s"Elements of donuts4 = $donuts4")

  println("\nStep 5: How to define couple of functions which returns an Option of type String")
  def favoriteDonut: Option[String] = Some("Glazed Donut")

  def leastFavoriteDonut: Option[String] = None

  println("\nStep 6: How to use map function to filter out None values")
  favoriteDonut.map(donut => println(s"Favorite donut = $donut"))
  leastFavoriteDonut.map(donut=> println(s"Least favorite donut = $donut"))

}
