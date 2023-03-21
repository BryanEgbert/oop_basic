public class Person {
    private String name;
    private Integer age;
    private String address;
    private Address addressDetails;
    private Employer employer;

    public Person(String name, Integer age, String address, Address addressDetails) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.addressDetails = addressDetails;
        this.employer = new Employer(this.name, this.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Address getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(Address addressDetails) {
        this.addressDetails = addressDetails;
    }

    public Employer getEmployer() {
        return employer;
    }
    
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void Print() {
        System.out.printf("this is %s\nlive in %s\n", name, address);
    }
}
