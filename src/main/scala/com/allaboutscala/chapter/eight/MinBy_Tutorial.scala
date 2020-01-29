package com.allaboutscala.chapter.eight

object MinBy_Tutorial extends App {

  println("Step 1: How to create case class to represent Donut object")
  case class Donut(name: String, price: Double)

  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")

  println("\nStep 3: How to find the minimum element in a sequence of case classes using the minBy function")
  println(s"Minimum element in sequence of case class of type Donut, ordered by price = ${donuts.minBy(donut => donut.price)}")

  println("\nStep 4: How to declare a value predicate function for minBy function")
  val donutsMinBy: (Donut) => Double = (donut) => donut.price
  println(s"Value function donutMinBy = $donutsMinBy")

  println("\nStep 5: How to find the minimum element using minBy function and passing through the predicate function from Step 4")
  println(s"Minimum element in sequence using function from Step 3 = ${donuts.minBy(donutsMinBy)}")

}
