package com.hmrc.test.checkout
import com.hmrc.test.promotions.Promotions
import com.hmrc.test.products.Product

class Checkout(promotions: Seq[Promotions] = Nil) {
  def Total(inputProducts: Seq[Product]): Double = {
    var result = 0.0d
    for (product <- inputProducts) {
      result += product.price
    }
    for (offer <- promotions) {
      result = result - offer.getDiscount(inputProducts)
    }

    result
  }

}

