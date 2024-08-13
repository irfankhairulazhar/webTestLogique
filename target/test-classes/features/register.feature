@main @register

  Feature: registration page
    Scenario: registration using valid data
      Given user direct to uc register page
      When user on register page input valid first name "testeee"
      And user input valid last name "testtts"
      And user input pob "Bekasi"
      And user select occupation "TNI"
      And user input company name "PT Test"
      And user input company address "Jakarta"
      And user input dob "01/01/2021"
      And user input id number "1234512345123563"
      And user input company number "08332736225"
      And user upload id
      And user input NPWP number "38.273.273.8-273."
      And user select vehicle type "Mobil"
      And user select find new vehicle "Kendaraan Penumpang"
      And user select province "Jakarta"
      And user select city "Jakarta Barat"
      And user select domicile "Bekasi"
      And user input phone number "0833297339"
      And user purpose to buy "Pribadi"
      And user input email "tessst@test7.com"
      And user input password "test1234"
      And user reinput password "test1234"
      And user click continue button
      And user input acc bank number "3333333"
      And user select bank name "DBS"
      And user input acc bank name "irfan"
      And user input source of fund "Gaji"
      And user input payment method "transfer"
      And user click button register
      Then user will get popup success "Data baru berhasil ditambahkan"
      Then user direct to login page "Selamat Datang"