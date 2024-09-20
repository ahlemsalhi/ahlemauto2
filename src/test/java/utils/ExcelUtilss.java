package utils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtilss {
    public static List<String[]> readExcelData(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0); // lire la première feuille

        for (Row row : sheet) {
            String[] rowData = new String[row.getPhysicalNumberOfCells()];
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                if (row.getCell(i) != null) { // Vérifiez si la cellule n'est pas nulle
                    rowData[i] = row.getCell(i).toString();
                } else {
                    rowData[i] = ""; // Assigner une chaîne vide si la cellule est nulle
                }
            }
            data.add(rowData);
        }
        workbook.close();
        fileInputStream.close();
        return data;
    }

}
