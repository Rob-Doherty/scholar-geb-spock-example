package spec

import page.UniversalCredit.PostcodeCheckPage
import page.UniversalCredit.SingleCoupleRegistrationPage

class ScholarDemoTestUC extends BaseSpec {


    def "Search for Scholar on GitHub"() {
        when:
        PostcodeCheckPage postcodeCheckPage = to PostcodeCheckPage
        SingleCoupleRegistrationPage register = postcodeCheckPage.submitPostcode("SM5 2RT")
        register.registerAsSingle()

        then:
        true
    }
}