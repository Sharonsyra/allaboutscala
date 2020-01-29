package com.allaboutscala.chapter.eight

object Tail_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to return all elements in the sequence except the head using the tail function")
  println(s"Elements of donuts excluding the head = ${donuts.tail}")



  println("\nStep 3: How to access the last element of the donut sequence by using the last function")
  println(s"Last element of donut sequence = ${donuts.last}")



  println("\nStep 4: How to access the first element of the donut sequence by using the head function")
  println(s"First element of donut sequence = ${donuts.head}")
}
