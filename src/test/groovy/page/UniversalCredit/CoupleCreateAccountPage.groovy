package page.UniversalCredit

import page.BasePage

class CoupleCreateAccountPage extends BasePage {

    static url = "register/couple"

    static at = {
        waitFor { browser.currentUrl.contains(url) && usernameField.displayed }
    }

    static content = {
        usernameField               { $("#id-username") }
    }

}
