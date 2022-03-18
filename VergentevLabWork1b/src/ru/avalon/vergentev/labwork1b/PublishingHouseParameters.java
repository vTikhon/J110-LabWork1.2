package ru.avalon.vergentev.labwork1b;

public class PublishingHouseParameters {
    private String houseName;
    private String cityName;


    //Constructors block
    public PublishingHouseParameters() {
    }

    public PublishingHouseParameters(String houseName) {
        setHouseName(houseName);
    }

    public PublishingHouseParameters(String houseName, String cityName) {
        this(houseName);
        setCityName(cityName);
    }


    //Methods block


    //Getters and Setters block
    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
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
