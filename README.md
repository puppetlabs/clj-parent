# clj-parent
A clojure project that defines version numbers for common dependencies

Good candidates for things to include here:

* Any library that is used by more than one or two PL projects
* Any dependencies necessary to resolve transitive dependency conflicts between downstream PL projects

## Contributing

All updates should be made via pull request (PR).

Updates should include a CHANGELOG entry and commit message with a brief explanation of what is being updated and why.

#### Approving PRs
In order to give meaningful approval to a PR, you must either run your component's test suite against the changes or confirm that your component does not use the dependencies being updated.
**Please still approve the PR even if you aren't using the dependencies in question.**

#### Merging PRs
In order to merge a PR, you must get approval from each team specified in the CODEOWNERS file.

This includes getting approval from a teammate of the PR author, just to double-check things (you may assume the author ran the appropriate tests for their component, no need to run again).

## Releases

clj-parent is released as needed.

Puppet employees are expected to release as part of integrating the changes into component projects.
If you are an external contributor, you may request a release, or just wait until your changes are released along with a future update.

To create a release of clj-parent, first determine the release version.
The release should reflect the updated projects. For example, if a component is updated to a new feature (Y) release, clj-parent should get a new feature (Y) release.

If releasing a new X or Y version, open a PR to update the
[SNAPSHOT release version](https://github.com/puppetlabs/clj-parent/blob/main/project.clj#L10)
to the next `x.y.0-SNAPSHOT` version.

Once merged, run [the release pipeline](https://cinext-jenkinsmaster-enterprise-prod-1.delivery.puppetlabs.net/job/enterprise_clj-parent_release-clj_main/)
with default parameters, which will handle the relevant updates to the
project.clj version for the release.
