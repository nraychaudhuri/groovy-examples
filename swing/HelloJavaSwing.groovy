import groovy.swing.SwingBuilder
import javax.swing.*

def swingBuilder = new SwingBuilder()
swingBuilder.frame(title:"Hello Groovy Swing", 
                   defaultCloseOperation:JFrame.EXIT_ON_CLOSE, 
                   size:[200,300],
                   show:true) {
  panel(){
    label("Hello Groovy Swing")    
  }
}