@main @ucAction
  Feature: uc action lading page
    Scenario: scrolling
      Given user access uc action landing page
      When user on uc page close popup campaign
      And user scroll to bottom
      Then display coppyright wording "Copyright © 2022 UC auction - All rights reserved"
#      Then display office address "Kec Bekasi Utara, Kota Bekasi, Jawa Barat 17142"