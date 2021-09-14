#!/usr/bin/groovy
def checkOutFrom(repo) {
  git url: "${repo}"
}
return this
