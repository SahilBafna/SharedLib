#!/usr/bin/groovy
def printName(repo) {
  //git clone "${repo}"
  //echo 'hello ${repo}'
  ["git", "clone", "https://github.com/SahilBafna/Petclinic.git"].execute()
}
//return this

