package com.allaboutscala.chapter.four

object SingletonObject_Tutorial extends App {

  println("Step 1: How to declare a Singleton Object")
  object DonutShoppingCartCalculator {

    println("\nStep 2: How to define a global field")
    val discount: Double = 0.01

    println("\nStep 3: How to define utility function called calculateTotalCost")
    def calculateTotalCost(donuts: List[String]): Double = {
      // calculate the cost of donuts
      return 1
    }
  }

  println("\nStep 4: How to call global discount field from Step 2")
  println(s"Global discount = ${DonutShoppingCartCalculator.discount}")

  println("\nStep 5: How to call the utility function calculateTotalCost from Step 3")
  println(s"Call to calculateTotalCost function = ${DonutShoppingCartCalculator.calculateTotalCost(List())}")

}
