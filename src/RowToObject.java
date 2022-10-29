import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;

public class RowToObject {
    private static DataFormatter formatter = new DataFormatter();

    static Project rowToProject(Row row) {
        Project project = new Project();
        for (Cell cell : row) {
            CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
            String text = formatter.formatCellValue(cell);
            switch (cellRef.formatAsString().charAt(0)) {
                case 'A':
                    project.setNodeID(text);
                    break;
                case 'B':
                    project.setCpID(text);
                    break;
                case 'C':
                    project.setStage(Integer.parseInt(text));
                    break;
                case 'D':
                    try {
                        project.setStartDate(new SimpleDateFormat("MM/dd/yy").parse(text));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case 'E':
                    try {
                        project.setEndDate(new SimpleDateFormat("MM/dd/yy").parse(text));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case 'F':
                    project.setCustomer(text);
                    break;
                case 'G':
                    project.setCurrency(text);
                    break;
                case 'H':
                    project.setCreatedOn(text);
                    break;
                case 'I':
                    project.setChangedOn(text);
                    break;
                default:
                    break;
            }
        }
        return project;
    }

    static ProjectStage rowToStage(Row rowOfStage, Row rowOfDetails) {
        ProjectStage stage = new ProjectStage();
        for (Cell cellOfStage : rowOfStage) {
            Cell cellOfDetails = rowOfDetails.getCell(cellOfStage.getColumnIndex());
            CellReference cellRefStage = new CellReference(rowOfStage.getRowNum(), cellOfStage.getColumnIndex());
            // CellReference cellRefDetails = new CellReference(rowOfStage.getRowNum(),
            // cellOfStage.getColumnIndex());
            String text = formatter.formatCellValue(cellOfStage);
            String text2 = formatter.formatCellValue(cellOfDetails);
            switch (cellRefStage.formatAsString().charAt(0)) {
                case 'A':
                    stage.setValue(text);
                    break;
                case 'B':
                    stage.setDocNum(text);
                    break;
                case 'C':
                    stage.setFieldName(text);
                    try {
                        stage.setDate(new SimpleDateFormat("MM/dd/yy").parse(text2));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case 'D':
                    stage.setChangeIndicator(text.charAt(0));
                    stage.setTime(text2);
                    break;
                case 'E':
                    stage.setTextFlag(0);
                    stage.setLanguageKey(text2);

                    break;
                case 'F':
                    stage.setNewValue(0);
                    break;
                case 'G':
                    stage.setOldValue(0);
                    break;
                default:
                    break;
            }
        }
        return stage;
    }
}
