import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {
    static Sheet getProjectsRows() {
        String baseDirectory = System.getProperty("user.dir");
        String excelFilePath = baseDirectory + "/excelFiles" + "\\Projects.xls";
        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook wb = WorkbookFactory.create(inputStream);
            Sheet xSheet = wb.getSheetAt(0);
            xSheet.removeRow(xSheet.getRow(0));
            return xSheet;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    static Sheet getStagesRows() {
        String baseDirectory = System.getProperty("user.dir");
        String excelFilePath = baseDirectory + "/excelFiles" + "\\Stages.xls";
        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook wb = WorkbookFactory.create(inputStream);
            Sheet xSheet = wb.getSheetAt(0);
            xSheet.removeRow(xSheet.getRow(0));
            return xSheet;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    static Sheet getDetailsRows() {
        String baseDirectory = System.getProperty("user.dir");
        String excelFilePath = baseDirectory + "/excelFiles" + "\\Stages_Detailed.xls";
        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook wb = WorkbookFactory.create(inputStream);
            Sheet xSheet = wb.getSheetAt(0);
            xSheet.removeRow(xSheet.getRow(0));
            return xSheet;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}