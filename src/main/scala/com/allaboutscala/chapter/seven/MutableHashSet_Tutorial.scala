package com.allaboutscala.chapter.seven

import scala.collection.mutable.HashSet

object MutableHashSet_Tutorial extends App {

  println("\nStep 1: How to initialize a HashSet with 3 elements")
  val hashSet1: HashSet[String] = HashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of hashSet1 = $hashSet1")

  println("\nStep 2: How to check specific elements in HashSet")
  println(s"Element Plain Donut = ${hashSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${hashSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${hashSet1("Chocolate Donut")}")

  println("\nStep 3: How to add elements to HashSet using +=")
  hashSet1 += "Vanilla Donut"
  println(s"Elements of hashSet1 after adding Vanilla Donut element = $hashSet1")

  println("\nStep 4: How to add two HashSets together using ++=")
  hashSet1 ++= HashSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of hashSet1 after adding another HashSet = $hashSet1")

  println("\nStep 5: How to remove element from HashSet using -=")
  hashSet1 -= "Plain Donut"
  println(s"HashSet without Plain Donut element = $hashSet1")

  println("\nStep 6: How to find the intersection between two HashSet using &")
  val hashSet2: HashSet[String] = HashSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of hashSet1 and hashSet2 = ${hashSet1 & hashSet2}")

  println("\nStep 7: How to find the difference between two HashSets using &~")
  println(s"Difference of hashSet1 and hashSet5 = ${hashSet1 &~ hashSet2}")

  println("\nStep 8: How to initialize an empty HashSet")
  val emptyHashSet: HashSet[String] = HashSet.empty[String]
  println(s"Empty HashSet = $emptyHashSet")

}
