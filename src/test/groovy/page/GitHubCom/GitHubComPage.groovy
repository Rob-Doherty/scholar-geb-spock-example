package page.GitHubCom

import page.BasePage

class GitHubComPage extends BasePage {

    static url = ""

    static at = {
        waitFor { headerSearch.displayed }
    }

    static content = {
        headerSearch            { $("input.header-search-input") }
    }

    SearchResultsPage searchFor(String repo) {
        headerSearch.value(repo+"\n")
        return at(SearchResultsPage)
    }
}
