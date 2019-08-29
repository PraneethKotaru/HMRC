package com.hmrc.test

import com.hmrc.test.billing.Billing
import com.hmrc.test.products.{Apple, Orange}
import com.hmrc.test.promotions.{ApplePromotion, OrangePromotion}

/**
  * Main application
  */
object Application extends App {

  val products = List(Apple, Orange, Apple, Apple)

  val withOutDiscount = new Billing
  println(" output with out discount for 3 apples and an orange is " + withOutDiscount.Total(products))

  val withDiscount = new Billing(List(ApplePromotion, OrangePromotion))
  println(" output with discount for 3 apples and an orange is " + withDiscount.Total(products))

}
