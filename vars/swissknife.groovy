#!/usr/bin/groovy
def printName(repo) {
  //git clone "${repo}"
  //echo 'hello ${repo}'
  ["git", "clone", "${repo}"].execute()
}
return this

