class SearchTest extends GroovyTestCase{
  void testSearchByKeyword(){
    def results = Search.byKeyword("nraychaudhuri")
    results.each{
      assertTrue it.content.toLowerCase().contains("nraychaudhuri") ||
                 it.author.toLowerCase().contains("nraychaudhuri")
    }    
  }
}