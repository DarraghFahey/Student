package ie.gmit;

public class Student {
    private String name, email;

    public Student() {
        this.name = "Darragh Fahey";
        this.email = "G00352047@gmit.ie";
    }

    public Student(String n, String e) {
        if(n == null)
            throw new IllegalArgumentException("No Name entered");
        if(e == null)
            throw new IllegalArgumentException("No Email entered");
        else {
            this.name = n;
            this.email = e;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
