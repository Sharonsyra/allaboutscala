package com.allaboutscala.chapter.eight

object Sorted_Tutorial extends App {

  println("Step 1: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")



  println("\nStep 2: How to sort a sequence of type Double using the sorted function")
  println(s"Sort a sequence of type Double by their natural ordering = ${prices.sorted}")



  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 4: How to sort a sequence of type String using the sorted function")
  println(s"Sort a sequence of type String by their natural ordering = ${donuts.sorted}")
}