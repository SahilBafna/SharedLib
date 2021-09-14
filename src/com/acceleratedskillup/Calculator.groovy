package com.acceleratedskillup;

def checkOutFrom(repo) {
  git url: "${repo}"
}
return this
