package com.allaboutscala.chapter.eight

object Size_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to count the number of elements in the sequence using size function")
  println(s"Size of donuts sequence = ${donuts.size}")

  println("\nStep 3: How to use the count function")
  println(s"Number of times element Plain Donut appear in donuts sequence = ${donuts.count(_ == "Plain Donut")}")

}
