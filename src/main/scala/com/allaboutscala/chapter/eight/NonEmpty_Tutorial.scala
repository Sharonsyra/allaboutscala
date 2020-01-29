package com.allaboutscala.chapter.eight

object NonEmpty_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to check if a sequence is not empty using nonEmpty function")
  println(s"Is donuts sequence NOT empty = ${donuts.nonEmpty}")

  println("\nStep 3: How to create an empty sequence")
  val emptyDonuts: Seq[String] = Seq.empty[String]
  println(s"Elements of emptyDonuts = $emptyDonuts")

  println("\nStep 4: How to find out if sequence is empty using nonEmpty function")
  println(s"Is emptyDonuts sequence empty = ${emptyDonuts.nonEmpty}")

}
