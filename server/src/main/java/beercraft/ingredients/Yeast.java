package beercraft.ingredients;

import beercraft.util.BeerType;
import beercraft.util.DatabaseItem;
import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.*;

@DynamoDBTable(tableName = "Yeast")
public class Yeast implements DatabaseItem, Ingredient {
    private String partitionKey;
    private String sortKey;
    private String name;
    private String notes;
    private double defaultAmount;
    private double defaultTimeInMinutes;
    private BeerType type;
    private YeastForm form;
    private String manufacturer;
    private double minTemperature;
    private double maxTemperature;
    private double flocculation;
    private double attenuation;

    @DynamoDBHashKey(attributeName = "PK")
    public String getPartitionKey() { return partitionKey; }
    public void setPartitionKey(String partitionKey) { this.partitionKey = partitionKey; }

    @DynamoDBRangeKey(attributeName = "SK")
    public String getSortKey() { return sortKey; }
    public void setSortKey(String sortKey) { this.sortKey = sortKey; }

    @DynamoDBAttribute(attributeName = "Name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "Notes")
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @DynamoDBAttribute(attributeName = "DefaultAmount")
    public double getDefaultAmount() {
        return defaultAmount;
    }
    public void setDefaultAmount(double defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    @DynamoDBAttribute(attributeName = "DefaultTimeInMinutes")
    public double getDefaultTimeInMinutes() {
        return defaultTimeInMinutes;
    }
    public void setDefaultTimeInMinutes(double defaultTimeInMinutes) {
        this.defaultTimeInMinutes = defaultTimeInMinutes;
    }

    @DynamoDBTyped(DynamoDBAttributeType.S)
    public BeerType getType() {
        return type;
    }
    public void setType(BeerType type) {
        this.type = type;
    }

    @DynamoDBTyped(DynamoDBAttributeType.S)
    public YeastForm getForm() {
        return form;
    }
    public void setForm(YeastForm form) {
        this.form = form;
    }

    @DynamoDBAttribute(attributeName = "Manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @DynamoDBAttribute(attributeName = "MinTemperature")
    public double getMinTemperature() {
        return minTemperature;
    }
    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    @DynamoDBAttribute(attributeName = "MaxTemperature")
    public double getMaxTemperature() {
        return maxTemperature;
    }
    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @DynamoDBAttribute(attributeName = "Flocculation")
    public double getFlocculation() {
        return flocculation;
    }
    public void setFlocculation(double flocculation) {
        this.flocculation = flocculation;
    }

    @DynamoDBAttribute(attributeName = "Attenuation")
    public double getAttenuation() {
        return attenuation;
    }
    public void setAttenuation(double attenuation) {
        this.attenuation = attenuation;
    }
}
