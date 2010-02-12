def sw = new StringWriter()
def xml = new groovy.xml.MarkupBuilder(sw)
xml.langs(type:"current"){
  language("Java", version:"1.5")
  language("Groovy")
  language("JavaScript")
}

println sw

//how language method looks like
def lang(attributes, tagValue) {
  println("tagValue $tagValue")
  attributes.each { k, v -> println("$k=$v") }
}

lang("nilanjan", profession:"programmer", version:"2.0")
//lang("nilanjan")
//lang("a", "b", "c")
