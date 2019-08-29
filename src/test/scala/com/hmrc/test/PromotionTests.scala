package com.hmrc.test.promotions

import org.scalatest.{FunSpec, Matchers}
import com.hmrc.test.products._


class PromotionTests extends FunSpec with Matchers{

  val input = List(Apple, Orange, Apple, Orange, Orange, Orange, Apple)


  it("ApplePromotion should generate expected result" ){

    val expectedValue =  0.6

    val originalValue = ApplePromotion.getDiscount(input)

    assert(expectedValue == originalValue)

  }

  it("OrangePromotion should generate expected result" ){

    val expectedValue =  0.25

    val originalValue = OrangePromotion.getDiscount(input)

    assert(expectedValue == originalValue)

  }
}