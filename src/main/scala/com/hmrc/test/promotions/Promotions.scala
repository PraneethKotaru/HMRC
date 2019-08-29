package com.hmrc.test.promotions

import com.hmrc.test.products.{Apple, Product, Orange}

sealed trait Promotions {

  def getDiscount(products : List[Product]): Double
}

object ApplePromotion extends Promotions {
  override def getDiscount(cart : List[Product]): Double = {
    cart.filter(_ == Apple).size / 2 * Apple.price
  }

}

object OrangePromotion extends Promotions {
  override def getDiscount(cart : List[Product]): Double ={
    cart.filter(_ == Orange).size / 3 * Orange.price
  }

}
