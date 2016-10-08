package page.UniversalCredit

import page.BasePage

class SingleCoupleRegistrationPage extends BasePage {

    static url = "register/orientation-registration"

    static at = {
        waitFor { registerSingleButton.displayed && registerCoupleButton.displayed }
    }

    static content = {
        registerSingleButton        { $("#register-single") }
        registerCoupleButton        { $("#register-couple") }
    }

    SingleCreateAccountPage registerAsSingle() {
        registerSingleButton.click()
        at SingleCreateAccountPage
    }

    CoupleCreateAccountPage registerAsCouple() {
        registerCoupleButton.click()
        at CoupleCreateAccountPage
    }
}
