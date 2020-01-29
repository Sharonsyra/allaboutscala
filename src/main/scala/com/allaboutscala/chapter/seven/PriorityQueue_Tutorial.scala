package com.allaboutscala.chapter.seven

import scala.collection.mutable.PriorityQueue

object PriorityQueue_Tutorial extends App {

  println("Step 1: How to declare a case class to represent Donut object")
  case class Donut(name: String, price: Double)

  println("\nStep 2: How to declare a function which defines the ordering of a PriorityQueue of Donut objects")
  def donutOrder(d: Donut) = d.price
  // - orders from lowest + orders from highest

  println("\nStep 3: How to initialize a PriorityQueue of Donut objects and specify the Ordering")
  val priorityQueue1: PriorityQueue[Donut] = PriorityQueue(
    Donut("Plain Donut", 1.50),
    Donut("Strawberry Donut", 2.0),
    Donut("Chocolate Donut", 2.50)
    )(Ordering.by(donutOrder))
   println(s"Elements of priorityQueue1 = $priorityQueue1")

  println("\nStep 4: How to add an element to PriorityQueue using enqueue function")
  priorityQueue1.enqueue(Donut("Vanilla Donut", 1.0))
  println(s"Elements of priorityQueue1 after enqueue function is called = $priorityQueue1")

  println("\nStep 5: How to add an element to PriorityQueue using +=")
  priorityQueue1 += (Donut("Krispy Kreme Donut", 1.0))
  println(s"Elements of priorityQueue1 after enqueue function is called = $priorityQueue1")

  println("\nStep 6: How to remove an element from PriorityQueue using the dequeue function")
  val donutDequeued: Donut = priorityQueue1.dequeue()
  println(s"Donut element dequeued = $donutDequeued")
  println(s"Elements of priorityQueue1 after dequeued function is called = $priorityQueue1")

  println("\nStep 7: How to initialize an empty PriorityQueue")
  val emptyPriorityQueue: PriorityQueue[String] = PriorityQueue.empty[String]
  println(s"Empty emptyPriorityQueue = $emptyPriorityQueue")

}
