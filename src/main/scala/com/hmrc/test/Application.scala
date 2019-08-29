package com.hmrc.test

import com.hmrc.test.checkout.Checkout
import com.hmrc.test.products.{Apple, Orange}
import com.hmrc.test.promotions.{ApplePromotion, OrangePromotion}

/**
  * Main application
  */
object Application extends App {

  val inputProducts = Seq(Apple, Apple, Orange, Apple)

  val withOutDiscount = new Checkout
  println(" output with out discount for 3 apples and an orange is " + withOutDiscount.Total(inputProducts))

  val withDiscount = new Checkout(Seq(ApplePromotion, OrangePromotion))
  println(" output with discount for 3 apples and an orange is " + withDiscount.Total(inputProducts))

}
