def foreach(list, Closure c) {
  list.each { it ->
    c.call(it)
  }
}


def myList = ["a", "b"]
myList << "c" << "d"

foreach(myList) {
  println it
}
