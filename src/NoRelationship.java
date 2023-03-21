public class NoRelationship {
    public String name;
    public int age;
    public String industry;
    public String street;
    public String city;
    public String state;

    public NoRelationship(String name, int age, String industry, String street, String city, String state) {
        this.name = name;
        this.age = age;
        this.industry = industry;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public void Print() {
        System.out.printf("%s %d %s %s %s %s", name, age, industry, street, city, state);
    }
}
