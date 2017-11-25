package univ.trash;

public class Information {
    private String numberOfGroup;
    private String pib;
    private String dateOfBirthday;

    public Information(String numberOfGroup, String pib, String dateOfBirthday) {
        this.numberOfGroup = numberOfGroup;
        this.pib = pib;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(String numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
}
