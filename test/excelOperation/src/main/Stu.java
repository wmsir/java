package main;

public class Stu {
  private String name;
  private String age;
  private String classname;
  private String no;
  
  
  public Stu(String name, String age, String classname, String no) {
    super();
    this.name = name;
    this.age = age;
    this.classname = classname;
    this.no = no;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }
  public String getClassname() {
    return classname;
  }
  public void setClassname(String classname) {
    this.classname = classname;
  }
  public String getNo() {
    return no;
  }
  public void setNo(String no) {
    this.no = no;
  }
  
  
  
}