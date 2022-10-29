import java.util.Date;

public class ProjectStage {
    private String value;
    private String docNum;
    private String fieldName;
    private char changeIndicator;
    private int textFlag;
    private int newValue;
    private int oldValue;
    private Date date;
    private String time;
    private String languageKey;

    public ProjectStage(String value, String docNum, String fieldName, char changeIndicator, int textFlag, int newValue,
            int oldValue, Date date, String time, String languageKey) {
        this.value = value;
        this.docNum = docNum;
        this.fieldName = fieldName;
        this.changeIndicator = changeIndicator;
        this.textFlag = textFlag;
        this.newValue = newValue;
        this.oldValue = oldValue;
        this.date = date;
        this.time = time;
        this.languageKey = languageKey;
    }

    public ProjectStage() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public char getChangeIndicator() {
        return changeIndicator;
    }

    public void setChangeIndicator(char changeIndicator) {
        this.changeIndicator = changeIndicator;
    }

    public int getTextFlag() {
        return textFlag;
    }

    public void setTextFlag(int textFlag) {
        this.textFlag = textFlag;
    }

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
    }

    public int getOldValue() {
        return oldValue;
    }

    public void setOldValue(int oldValue) {
        this.oldValue = oldValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLanguageKey() {
        return languageKey;
    }

    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    @Override
    public String toString() {
        return "Stage [value=" + value + ", docNum=" + docNum + ", fieldName=" + fieldName + ", changeIndicator="
                + changeIndicator + ", textFlag=" + textFlag + ", newValue=" + newValue + ", oldValue=" + oldValue
                + ", date=" + date + ", time=" + time + ", languageKey=" + languageKey + "]";
    }
}
