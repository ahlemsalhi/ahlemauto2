package utils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Excelutils {
    public static void main(String[] args) {
        getRowCount(0,0);
        getcelldata(1,1);
        getcelldatanumber(1,0);
    }
    public static void getRowCount(int RowNumb,int ColNumb) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\asalhi\\IdeaProjects\\First_project\\Excelfile\\data.xlsx");
            XSSFSheet sheet = workbook.getSheet("sheet1");
    int numberofrow =  sheet.getPhysicalNumberOfRows();//avoir le nombre des colonnes
            System.out.println("le nombre de colonne est : " + numberofrow);
        } catch (FileNotFoundException e) {
            System.err.println("Le fichier Excel spécifié est introuvable : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier Excel : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Une erreur inattendue s'est produite : " + e.getMessage());
        }
    }

    public static void getcelldata(int RowNumb,int ColNumb) {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\asalhi\\IdeaProjects\\First_project\\Excelfile\\data.xlsx");
            XSSFSheet sheet = workbook.getSheet("sheet1");
         String  cellData=  sheet.getRow(0).getCell(0).getStringCellValue();
         System.out.println(cellData);
    }
        catch (FileNotFoundException e) {
            System.err.println("Le fichier Excel spécifié est introuvable : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier Excel : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Une erreur inattendue s'est produite : " + e.getMessage());
        }

    }

    ///

    public static void getcelldatanumber(int RowNumb,int ColNumb) {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\asalhi\\IdeaProjects\\First_project\\Excelfile\\data.xlsx");
            XSSFSheet sheet = workbook.getSheet("sheet1");
            Double cellDatanumber=  sheet.getRow(RowNumb).getCell(ColNumb).getNumericCellValue();
            System.out.println(cellDatanumber);
        }
        catch (FileNotFoundException e) {
            System.err.println("Le fichier Excel spécifié est introuvable : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier Excel : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Une erreur inattendue s'est produite : " + e.getMessage());
        }

    }


}
