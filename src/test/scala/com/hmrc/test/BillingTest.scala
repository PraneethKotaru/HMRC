package com.hmrc.test

import com.hmrc.test.billing.Billing
import com.hmrc.test.products.{Apple, Orange}
import com.hmrc.test.promotions.{ApplePromotion, OrangePromotion}
import org.scalatest.{FunSpec, Matchers}

class BillingTest  extends FunSpec with Matchers{

  val input = List(Apple, Orange, Apple, Orange, Orange, Orange, Apple)

  def ~=(x: Double, y: Double) = {
    if ((x - y).abs < 0.0001) true else false
  }

  it("Billing with no promotions should generate expected result" ){

    val billing = new Billing

    val expectedValue =  2.8
    val originalValue = billing.Total(input)

    assert(~=(expectedValue,  originalValue))

  }

  it("Billing with ApplePromotion should generate expected result" ){

    val billing = new Billing(List(ApplePromotion))

    val expectedValue =  2.2
    val originalValue = billing.Total(input)

    assert(~=(expectedValue,  originalValue))

  }

  it("Billing with OrangePromotion should generate expected result" ){

    val billing = new Billing(List(OrangePromotion))

    val expectedValue =  2.55
    val originalValue = billing.Total(input)

    assert(~=(expectedValue,  originalValue))

  }

  it("Billing with ApplePromotion and OrangePromotion should generate expected result" ){

    val billing = new Billing(List(ApplePromotion, OrangePromotion))

    val expectedValue =  1.95
    val originalValue = billing.Total(input)

    assert(~=(expectedValue,  originalValue))

  }

}

