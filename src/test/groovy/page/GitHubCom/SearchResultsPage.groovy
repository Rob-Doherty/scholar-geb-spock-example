package page.GitHubCom

import module.SearchResultModule
import page.BasePage

class SearchResultsPage extends BasePage {

    static url = "search"

    static at = {
        waitFor {
            searchResults.size() != 0
        }
    }

    static content = {
        searchResults   { $("li.repo-list-item").moduleList(SearchResultModule) }
    }

    void selectResult(String value) {
        searchResults.find { it.repoName.text() == value }
                .repoName
                .click()
    }

}
