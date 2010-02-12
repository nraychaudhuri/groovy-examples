def xml = """
<langs type="current">
  <language>Scala</language>
  <language>Groovy</language>
  <language>JavaScript</language>
  <language>Erlang</language>
</langs>
"""

def langs = new XmlParser().parseText(xml)
println "type = ${langs.attribute("type")}"
langs.language.each{
  println it.text()
}

//spread-dot operator
//println "----- " + langs.language*.text()

//another example
//def practices = ["tdd", "travel light", "retrospective"]
//println ">>> " + practices*.toUpperCase()