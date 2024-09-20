package StepDefinitions;
import de.redsix.pdfcompare.PdfComparator;
import java.io.IOException;
public class testcompare {
    public static void main(String[] args) throws Exception {


        String file1 ="C:\\Users\\asalhi\\Downloads\\doc1.pdf";
        String file2="C:\\Users\\asalhi\\Downloads\\doc2.pdf";
        String Resultfile="C:\\Users\\asalhi\\Downloads\\Result\\resultat";
        String ignorefile= "C:\\Users\\asalhi\\IdeaProjects\\First_project\\ignore.conf";
        new PdfComparator(file1, file2).compare().writeTo(Resultfile);
        System.out.println("Process complete");
        boolean isEquals = new PdfComparator(file1, file2).compare().writeTo(Resultfile);
        new PdfComparator(file1, file2).withIgnore(ignorefile).compare();
     //   if (!isEquals) {
        //    System.out.println("Differences found!");
       // }

        System.out.println("pdfs are similar: "+isEquals );
    }

}
