package com.allaboutscala.chapter.seven

import scala.collection.mutable.ArrayStack

object MutableArrayStack_Tutorial extends App {

  println("Step 1: How to initialize ArrayStack with 3 elements")
  val arrayStack1: ArrayStack[String] = ArrayStack("Plain Donut", "Strawberry Donut", "Chocolate Donut")

  println(s"Elements of arrayStack1 = $arrayStack1")

  println("\nStep 2: How to check elements at specific index of an ArrayStack")
  println(s"Element at index 0 = ${arrayStack1(0)}")
  println(s"Element at index 1 = ${arrayStack1(1)}")
  println(s"Element at index 2 = ${arrayStack1(2)}")

  println("\nStep 3: How to add elements to an ArrayStack using +=")
  arrayStack1 += "Vanilla Donut"
  println(s"Elements of arrayStack1 = $arrayStack1")

  println("\nStep 4: How to add elements from a List to an ArrayStack using ++=")
  arrayStack1 ++= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of arrayStack1 = $arrayStack1")

  println("\nStep 5: How to take an element from an ArrayStack using pop function")
  println(s"Pop element from stack = ${arrayStack1.pop}")
  println(s"Elements of stack1 = $arrayStack1")

  println("\nStep 6: How to push one element at the top of the ArrayStack using push function")
  arrayStack1.push("Krispy Creme")
  println(s"Elements after push = $arrayStack1")

  println("\nStep 7: How to initialize an empty ArrayStack")
  val emptyArrayStack: ArrayStack[Nothing] = ArrayStack.empty
  println(s"Empty Stack = $emptyArrayStack")

}
