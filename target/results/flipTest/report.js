$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/register.feature");
formatter.feature({
  "name": "registration page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@main"
    },
    {
      "name": "@register"
    }
  ]
});
formatter.scenario({
  "name": "registration using valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main"
    },
    {
      "name": "@register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user direct to uc register page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.registerSteps.user_direct_to_uc_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on register page input valid first name \"testeee\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.registerSteps.user_on_register_page_input_valid_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input valid last name \"testtts\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_valid_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input pob \"Bekasi\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_pob(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select occupation \"TNI\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_select_occupation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input company name \"PT Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_company_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input company address \"Jakarta\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_company_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input dob \"01/01/2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_dob(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input id number \"1234512345123563\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_id_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input company number \"08332736225\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_company_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user upload id",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_upload_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input NPWP number \"38.273.273.8-273.\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_NPWP_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select vehicle type \"Mobil\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_select_vehicle_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select find new vehicle \"Kendaraan Penumpang\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_select_find_new_vehicle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select province \"Jakarta\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_select_province(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select city \"Jakarta Barat\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_select_city(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select domicile \"Bekasi\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_select_domicile(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input phone number \"0833297339\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user purpose to buy \"Pribadi\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_purpose_to_buy(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input email \"tessst@test7.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input password \"test1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user reinput password \"test1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_reinput_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input acc bank number \"3333333\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_acc_bank_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select bank name \"DBS\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_select_bank_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input acc bank name \"irfan\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_acc_bank_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input source of fund \"Gaji\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_source_of_fund(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input payment method \"transfer\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_input_payment_method(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button register",
  "keyword": "And "
});
formatter.match({
  "location": "steps.registerSteps.user_click_button_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get popup success \"Data baru berhasil ditambahkan\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.registerSteps.user_will_get_popup_success(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user direct to login page \"Selamat Datang\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.registerSteps.user_direct_to_login_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/ucAction.feature");
formatter.feature({
  "name": "uc action lading page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@main"
    },
    {
      "name": "@ucAction"
    }
  ]
});
formatter.scenario({
  "name": "scrolling",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main"
    },
    {
      "name": "@ucAction"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user access uc action landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.ucActionSteps.user_access_uc_action_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on uc page close popup campaign",
  "keyword": "When "
});
formatter.match({
  "location": "steps.ucActionSteps.user_on_uc_page_close_popup_campaign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scroll to bottom",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ucActionSteps.user_scroll_to_bottom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "display coppyright wording \"Copyright © 2022 UC auction - All rights reserved\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ucActionSteps.display_coppyright_wording(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});