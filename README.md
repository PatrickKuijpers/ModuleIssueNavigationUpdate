# Module Issue Navigation Update

This project is meant as an example for [this issue](https://issuetracker.google.com/issues/170870061) on the google IssueTracker.

How to reproduce:
- Checkout the develop branch to verify the project builds
- Checkout the [feature/updateAndroidxNavigation](https://github.com/PatrickKuijpers/ModuleIssueNavigationUpdate/tree/feature/updateAndroidxNavigation) branch to verify the build issue.
Note that only the `androidx.navigation` dependency was updated from 2.1.0 to 2.2.0.
- Optional: checkout the [bugfix/workaround](https://github.com/PatrickKuijpers/ModuleIssueNavigationUpdate/tree/bugfix/workaround) branch to make the project build again with a simple workaround.
This shows that a string reference to a different module cannot be found if used in the `defaultValue` attribute specifically, while a similar reference from `strings.xml` does work.
