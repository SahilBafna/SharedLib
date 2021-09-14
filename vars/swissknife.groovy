#!/usr/bin/groovy
def printName(repo) {
  git "${repo}"
  //echo 'hello ${repo}'
}
return this

