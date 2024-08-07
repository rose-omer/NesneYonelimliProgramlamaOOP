package ObjectFundamentals13;

public enum Days {
    PAZARTESI("Monday"),
    SALI("Tuesday"),
    CARSAMBA("Wednesday"),
    PERSEMBE("Thursday"),
    CUMA("Friday"),
    CUMARTESI("Saturday"),
    PAZAR("Sunday");

    private String englishName;

    Days(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }
}
