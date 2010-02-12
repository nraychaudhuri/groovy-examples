class Search{
  static final String addr = "http://search.twitter.com/search.atom?q="
  
  static Object[] byKeyword(String query){
    def results = []
    def feed = new XmlSlurper().parse(addr + query)
    feed.entry.each{entry->
      def tweet = new Tweet()
      tweet.author = entry.author.name
      tweet.published = entry.published
      tweet.content = entry.title
      results << tweet
    }
    return results as Object[]    
  }
}