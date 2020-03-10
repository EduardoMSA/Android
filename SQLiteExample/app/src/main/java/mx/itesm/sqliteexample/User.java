package mx.itesm.sqliteexample;


//This Java class represents a Template for TABLE USERS. Defined in Helper

public class User
{
    Integer id;
    String name;
    String lastName;
    String dob;
    String role;
    Integer semester;
    String nickname;
    String password;

    public User(Integer id, String name, String last, String dob, String role, Integer semester, String nickname, String password)
    {
      this.id = id;
      this.name = name;
      this.lastName = last;
      this.dob = dob;
      this.role = role;
      this.semester = semester;
      this.nickname = nickname;
      this.password = password;
    }

    public User(String name, String last, String dob, String role, Integer semester, String nickname, String password) {
        this.name= name;
        this.lastName = last;
        this.dob = dob;
        this.role = role;
        this.semester = semester;
        this.nickname = nickname;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
