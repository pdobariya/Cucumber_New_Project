@serch
  Feature: nop commerce

    Scenario: User able to serch product from serch box
      Given User on home page
      When User enter "<product>" name in serch box
      Then user able to serch the product


@checkOut
Scenario: User should able to buy a product successfully
  Given User should be on book page
  When  User click on add to cart button of first book And shoping Cart
  And  User click on I agree with Terms of service And checkOut button
  And click on checkOut as guest
  And Fill The all details of billing address and click on countinue
  And click on continue
  And select the credit card and click on countinue
  And fill the all credit card details and click on countinue
  And click On confirm
  Then User can see This msg 'Your order has been successfully processed!'





