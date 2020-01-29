package com.allaboutscala.chapter.eight

object TakeRight_Tutorial extends App {

  println("Step 1: How to initialize a List of donuts")
  val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to take the last N elements using the takeRight function")
  println(s"Take the last donut element in the sequence =  ${donuts.takeRight(1)}")
  println(s"Take the last two donut elements in the sequence =  ${donuts.takeRight(2)}")
  println(s"Take the last three donut elements in the sequence =  ${donuts.takeRight(3)}")

}
