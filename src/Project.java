import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String nodeID;
    private String cpID;
    private int stage;
    private Date startDate;
    private Date endDate;
    private String customer;
    private String currency;
    private String createdOn;
    private String changedOn;
    private ArrayList<ProjectStage> stages;

    public Project(String nodeID, String cpID, int stage, Date startDate, Date endDate, String customer,
            String currency,
            String createdOn, String changedOn, ArrayList<ProjectStage> stages) {
        this.nodeID = nodeID;
        this.cpID = cpID;
        this.stage = stage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.currency = currency;
        this.createdOn = createdOn;
        this.changedOn = changedOn;
        this.stages = stages;
    }

    public Project() {
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        if (this.nodeID == null) {
            this.nodeID = nodeID;
        } else {
            throw new IllegalArgumentException("nodeID is already set");
        }
    }

    public String getCpID() {
        return cpID;
    }

    public void setCpID(String cpID) {
        this.cpID = cpID;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getChangedOn() {
        return changedOn;
    }

    public void setChangedOn(String changedOn) {
        this.changedOn = changedOn;
    }

    public ArrayList<ProjectStage> getStages() {
        return stages;
    }

    public void setStages(ArrayList<ProjectStage> stages) {
        this.stages = stages;
    }

    public void addStage(ProjectStage stage) {
        if (this.stages == null) {
            this.stages = new ArrayList<ProjectStage>();
        }
        this.stages.add(stage);
    }

    @Override
    public String toString() {
        return "Project [nodeID=" + nodeID + ", cpID=" + cpID + ", stage=" + stage + ", startDate=" + startDate
                + ", endDate=" + endDate + ", customer=" + customer + ", currency=" + currency + ", createdOn="
                + createdOn + ", changedOn=" + changedOn + ", stages=" + stages + "]";
    }

}
