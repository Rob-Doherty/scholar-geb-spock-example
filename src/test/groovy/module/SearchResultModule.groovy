package module

import geb.Module

class SearchResultModule extends Module{

    static content = {
        repoName            { $("h3.repo-list-name a") }
        reporDescription    { $("p.repo-list-description") }
        lastUpdated         { $("h3.repo-list-name") }
        name                { $("h3.repo-list-name") }
    }

}
