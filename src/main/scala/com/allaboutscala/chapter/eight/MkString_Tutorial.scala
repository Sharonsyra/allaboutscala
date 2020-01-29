package com.allaboutscala.chapter.eight

object MkString_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to concatenate the elements of a sequence into a String using mkString function")
  val donutsAsString: String = donuts.mkString(" and ")
  println(s"Donuts elements using mkString function = $donutsAsString")

  println("\nStep 3: How to concatenate the elements of a sequence into a String using mkString and specifying prefix and suffix")
  val donutsWithPrefixAndSuffix: String = donuts.mkString("My favorite donuts are namely ", " and ", " are very tasty!")
  println(s"$donutsWithPrefixAndSuffix")

}
