package spec

import page.GitHubCom.GitHubComPage
import page.GitHubCom.ScholarHomePage
import page.GitHubCom.SearchResultsPage

class ScholarDemoTestGitHub extends BaseSpec {


    def "Search for Scholar on GitHub"() {
        when:
        GitHubComPage gitHubComPage = to GitHubComPage
        gitHubComPage.searchFor("scholar")

        then:
        SearchResultsPage searchResultsPage = at SearchResultsPage

        when:
        searchResultsPage.selectResult("alexnaish/scholar")

        then:
        at ScholarHomePage
    }
}