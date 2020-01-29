package com.allaboutscala.chapter.one.tutorial_05

object HelloWorldMain {

  def main(args: Array[String]): Unit = {

    println("Hello from the main side!")

    println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
    val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
    val sweeteningIngredients = for {
      ingredient <- donutIngredients
      if (ingredient == "sugar" || ingredient == "syrup")
    } yield ingredient
    println(s"Sweetening ingredients = $sweeteningIngredients")

  }

}
