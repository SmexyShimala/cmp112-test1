public class House {
  public Attr(String name) {
    this.name = name;
  }

  public Attr(String name, String place, String description) {
    this.name = name;
    this.place = place;
    this.desciption = description;
  }
  
  public String getName() {
    return name;
  }
  
  public String getPlace() {
    return place;
  }
  
  public String getDescription() {
    return description
  }
  
  public String toString() {
    return name + "'" + place + "'" + description "";
  }
}  
}
