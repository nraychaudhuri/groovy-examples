 def addr = "http://search.twitter.com/search.atom?q=nraychaudhuri"
 def feed = new XmlSlurper().parse(addr)
 feed.entry.each{
   println it.author.name
   println it.published
   println it.title
   println "-"*20
 }
 //the raw xml
//println addr.toURL().text
 
