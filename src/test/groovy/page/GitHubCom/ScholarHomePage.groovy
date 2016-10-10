package page.GitHubCom

import page.BasePage

class ScholarHomePage extends BasePage {

    static url = "alexnaish/scholar"

    static at = {
        waitFor {
            heading.text() == "alexnaish/scholar"
        }
    }

    static content = {
        heading   { $("h1.public") }
    }

}
