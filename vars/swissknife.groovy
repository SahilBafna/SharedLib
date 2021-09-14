#!/usr/bin/groovy
def printName(repo) {
  git url: "${repo}"
  //git branch: 'main', url: '${repo}'

  //["git", "clone", "https://github.com/SahilBafna/Petclinic.git"].execute()
}
//return this

