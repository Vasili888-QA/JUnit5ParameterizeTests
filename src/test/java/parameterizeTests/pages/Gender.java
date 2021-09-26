package parameterizeTests.pages;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String option;

    Gender(String option) {
        this.option = option;
    }

    String getGenderOption() {
        return option;
    }
}