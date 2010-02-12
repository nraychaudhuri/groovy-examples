import groovy.swing.SwingBuilder
import javax.swing.*
import java.awt.*

class Gwitter{   
    
  static void main(String[] args){
    def gwitter = new Gwitter()
    new Builder().build()
  }
  
  //new in groovy 1.7
  static class Builder {
    def searchField
    def resultsList
    def build() {
      def swingBuilder = new SwingBuilder()  

       def customMenuBar = {
         swingBuilder.menuBar{
           menu(text: "File", mnemonic: 'F') {
             menuItem(text: "Exit", mnemonic: 'X', actionPerformed: {dispose() })
           }
         }  
       }    

       def searchPanel = {
         swingBuilder.panel(constraints: BorderLayout.NORTH){
           searchField = textField(columns:15)
           button(text:"Search", actionPerformed:{ 
             doOutside{ 
               resultsList.listData = Search.byKeyword(searchField.text) 
             }
           } )
         }
       }

       def resultsPanel = {
         swingBuilder.scrollPane(constraints: BorderLayout.CENTER){
           resultsList = 
             list(fixedCellWidth: 380, fixedCellHeight: 75, cellRenderer:new StripeRenderer())
         }
       }    

       swingBuilder.frame(title:"Gwitter", 
                          defaultCloseOperation:JFrame.EXIT_ON_CLOSE, 
                          size:[400,500],
                          show:true) {
         customMenuBar()                         
         searchPanel()
         resultsPanel()
       }      
    }
    
  }
}