#!/usr/bin/groovy
def printName(repo) {
  git url: "${repo}"
  //echo 'hello ${repo}'
}

