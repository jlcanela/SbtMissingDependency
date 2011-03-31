package mypackage

//icepdf
import org.icepdf.core.pobjects.Page
import org.icepdf.core.exceptions.PDFException
import org.icepdf.core.util.GraphicsRenderingHints
import org.icepdf.core.pobjects.graphics.text._

  
trait ICEPdfMissingDependency {
  
  val overwritePreviewImage = false
   
    private def pagesout: List[Int] = {
      val document = new org.icepdf.core.pobjects.Document()
 
      val pages = for(p <- 0 until document.getNumberOfPages) yield {
        val pageText = document.getPageText(p);
        if (pageText != null && pageText.getPageLines() != null) {
          val lines = pageText.getPageLines().asInstanceOf[java.util.List[LineText]]        
        }
      1    
      }

      pages.toList
    }
  
}