package spec

import geb.Page
import geb.spock.GebSpec
import utils.ScreenshotUtil

class BaseSpec extends GebSpec {

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
