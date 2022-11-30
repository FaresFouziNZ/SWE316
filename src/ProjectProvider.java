import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ProjectProvider {
    static ArrayList<Project> getAllProjects() {
        ArrayList<Project> projects = new ArrayList<Project>();
        Sheet xSheet = ExcelReader.getProjectsRows();

        // xSheet.removeRow(xSheet.getRow(0));
        for (Row row : xSheet) {
            projects.add(RowToObject.rowToProject(row));
        }
        ArrayList<ProjectStage> stages = new ArrayList<ProjectStage>();
        xSheet = ExcelReader.getStagesRows();
        System.out.println(xSheet.getLastRowNum());
        // xSheet.removeRow(xSheet.getRow(0));
        Sheet xSheet2 = ExcelReader.getDetailsRows();
        // xSheet2.removeRow(xSheet2.getRow(0));

        for (int i = 1; i < xSheet.getLastRowNum(); i++) {
            Row row = xSheet.getRow(i);
            Row row2 = xSheet2.getRow(i);
            stages.add(RowToObject.rowToStage(row, row2));
        }
        projects = merge(projects, stages);
        return projects;
    }

    private static ArrayList<Project> merge(ArrayList<Project> projects, ArrayList<ProjectStage> stages) {
        System.out.println("Merging...");
        for (Project project : projects) {
            for (ProjectStage stage : stages) {
                if (project.getNodeID().equals(stage.getValue())) {
                    project.addStage(stage);
                }
            }
        }
        return projects;
    }
}
