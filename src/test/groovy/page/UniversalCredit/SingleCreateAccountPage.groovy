package page.UniversalCredit

import page.BasePage

class SingleCreateAccountPage extends BasePage {

    static url = "register/single"

    static at = {
        waitFor { browser.currentUrl.contains(url) && usernameField.displayed }
    }

    static content = {
        usernameField               { $("#id-username") }
    }

}
