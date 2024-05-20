package Model;

public class Employee {
    private Integer id;
    private  String first_name;
    private  String last_name;
    private String email;
    private String title;

    public Employee(Integer id, String first_name, String last_name,
                    String email, String title) {
        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.title=title;
    }

    public Integer getId() {
        return id;
    }
    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
