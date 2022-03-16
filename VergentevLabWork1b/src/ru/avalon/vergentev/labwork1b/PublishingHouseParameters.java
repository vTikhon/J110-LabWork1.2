package ru.avalon.vergentev.labwork1b;

public class PublishingHouseParameters<PublishingHouseName> {

    private PublishingHouseName houseName;
    private String cityName;



    //Constructors block
    public PublishingHouseParameters() {
    }

    public PublishingHouseParameters(PublishingHouseName houseName) {
        setHouseName(houseName);
    }

    public PublishingHouseParameters(PublishingHouseName houseName, String cityName) {
        setHouseName(houseName);
        setCityName(cityName);
    }


    //Methods block
    public void print() {
    }

    public static void printAll(BookParameters [] books) {
        books[0].print();
        books[1].print();
        books[2].print();
        books[3].print();
        books[4].print();
    }

//    public static void printCity () {
//        PublishingHouseParameters [] house = new PublishingHouseParameters[4];
//        house[0].getCityName();
//        house[1].getCityName();
//        house[2].getCityName();
//        house[3].getCityName();
//    }







    //Getters and Setters block
    public PublishingHouseName getHouseName() {
        return houseName;
    }

    public void setHouseName(PublishingHouseName houseName) {
        if (houseName == null)
            throw new IllegalArgumentException("Publishing house must have the name");
        this.houseName = houseName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        if (cityName == null)
            throw new IllegalArgumentException("City where the book was published must have the name");
        this.cityName = cityName;
    }


}
