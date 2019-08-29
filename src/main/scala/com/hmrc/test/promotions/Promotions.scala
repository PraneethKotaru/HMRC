package com.hmrc.test.promotions

import com.hmrc.test.products.{Apple, Product, Orange}

sealed trait Promotions {

  def getDiscount(products : Seq[Product]): Double
}

object ApplePromotion extends Promotions {
  override def getDiscount(cart : Seq[Product]): Double = {
    println("Apple " +cart.filter(_ == Apple).size / 2 * Apple.price)
    cart.filter(_ == Apple).size / 2 * Apple.price
  }

}

object OrangePromotion extends Promotions {
  override def getDiscount(cart : Seq[Product]): Double ={
    println("orange " +cart.filter(_ == Orange).size / 3 * Orange.price)
    cart.filter(_ == Orange).size / 3 * Orange.price
  }

}
