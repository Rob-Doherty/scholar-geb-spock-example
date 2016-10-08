package page

import geb.AtVerificationResult
import geb.Page
import utils.ScreenshotUtil

class BasePage extends Page {

    static content = {
        signInButton            { $("#signIn") }
        submitButton            { $("#id-submit-button") }
        backButton              { $("#id-back-button") }
    }

    public <T extends Page> T at(Class<T> pageType) {
        def atResult = browser.at(pageType)
        ScreenshotUtil.takeScreenShot(atResult)
        return atResult
    }

    public <T extends Page> T to(Class<T> pageType, Object[] args) {
        def toResult = browser.to(pageType)
        ScreenshotUtil.takeScreenShot(toResult)
        return toResult
    }

}
