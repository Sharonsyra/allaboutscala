package com.allaboutscala.chapter.eight

object FoldLeft_Tutorial extends App {

  println("Step 1: How to initialize a sequence of donut prices")
  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Donut prices = $prices")

  println("\nStep 2: How to sum all the donut prices using foldLeft function")
  val sum = prices.foldLeft(0.0)(_ + _)
  println(s"Sum = $sum")

  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts")

  println("\nStep 4: How to create a String of all donuts using foldLeft function")
  println(s"All donuts = ${donuts.foldLeft("")((a, b) => a + b + " Donut ")}")

  println("\nStep 5: How to declare a value function to create the donut string")
  val concatDonuts: (String, String) => String = (a, b) => a + b + " Donut "
  println(s"Value function concatDonuts = $concatDonuts")

  println("\nStep 6: How to create a String of all donuts using value function from Step 5 and foldLeft function")
  println(s"All donuts = ${donuts.foldLeft("")(concatDonuts)}")

}
