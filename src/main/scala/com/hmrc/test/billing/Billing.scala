package com.hmrc.test.billing
import com.hmrc.test.promotions.Promotions
import com.hmrc.test.products.Product

class Billing(promotions: List[Promotions] = Nil) {
  def Total(inputProducts: List[Product]): Double = {
    var result = 0.0
    for (product <- inputProducts) {
      result += product.price
    }
    for (offer <- promotions) {
      result = result - offer.getDiscount(inputProducts)
    }

    result
  }

}

