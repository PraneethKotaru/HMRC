package com.hmrc.test.products

sealed trait Product {
  def price: Double
}

final object Apple extends Product {
  val price = 0.6
}

final object Orange extends Product {
  val price = 0.25
}
