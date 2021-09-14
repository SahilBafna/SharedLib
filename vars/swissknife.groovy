#!/usr/bin/groovy
def printName(repo) {
  git url: "${repo}"
  //echo 'hello ${repo}'
  //["git", "clone", "https://github.com/SahilBafna/Petclinic.git"].execute()
}
//return this

