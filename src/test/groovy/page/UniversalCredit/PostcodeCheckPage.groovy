package page.UniversalCredit

import page.BasePage

class PostcodeCheckPage extends BasePage {

    static url = "postcode-checker"

    static at = {
        waitFor { postcodeField.displayed }
    }

    static content = {
        postcodeField           { $("#id-postcode") }
    }

    SingleCoupleRegistrationPage submitPostcode(String postcode) {
        postcodeField << postcode
        submitButton.click()
        at SingleCoupleRegistrationPage
    }

}
