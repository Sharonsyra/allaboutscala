package com.allaboutscala.chapter.eight

object WithFilter_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to filter elements using the withFilter function")
  donuts
    .withFilter(_.charAt(0) == 'P')
    .foreach(donut => println(s"Donut starting with letter P = $donut"))
}