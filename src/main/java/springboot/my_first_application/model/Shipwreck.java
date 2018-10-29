package springboot.my_first_application.model;

import lombok.Data;

@Data
public class Shipwreck {
  Long id;
  String name;
  String description;
  String condition;
  Integer depth;
  Double latitude;
  Double longitude;
  Integer yearDiscovered;
  public Shipwreck() { }
  public Shipwreck(Long id, String name, String description, String condition, Integer depth, Double latitude, Double longitude, Integer yearDiscovered) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.condition = condition;
    this.depth = depth;
    this.latitude = latitude;
    this.longitude = longitude;
    this.yearDiscovered = yearDiscovered;
  }
}