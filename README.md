# clj-parent
A clojure project that defines version numbers for common dependencies

Good candidates for things to include here:

* Any library that is used by more than one or two PL projects
* Any dependencies necessary to resolve transitive dependency conflicts between downstream PL projects

## Releases

To create a release of clj-parent, first determine the release version. Rule of thumb: the release should reflect the updated projects, so if a component is updated new a feature release, clj-parent should get a new feature release.

Create a pull request to
* If not a patch release, update the SNAPSHOT release version to the next `x.y.0-SNAPSHOT` version.
* Add a CHANGELOG entry.

Once merged and through testing, run https://cinext-jenkinsmaster-enterprise-prod-1.delivery.puppetlabs.net/view/clojure-libraries/view/all/job/enterprise_clj-parent_release-clj_master with default parameters.
