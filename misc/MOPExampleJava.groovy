String.metaClass.toDate = { 
  new java.text.SimpleDateFormat("MM/dd/yyyy").parse(delegate)
}

String.metaClass.isEmpty = { 
  delegate.trim().length() == 0
}

println "02/12/2010".class.name
println "02/12/2010".toDate()

println "  ".isEmpty()
println "".isEmpty()