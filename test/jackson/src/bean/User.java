package bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author wangmeng.
 *
 */
public class User {
  public int age;
  public String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public static HashMap<String,String> getMap(){
    HashMap<String,String> m = new HashMap<String,String>();
    String name ="";
    m.put(name, "wm");
    m.put(name, "");
    return m;
  }
  public static User getUser(){
    User u = new User();
    u.setName("name");
    return u;
  }
  @Override
  public String toString() {
    return "User [age=" + age + ", name=" + name + "]";
  }
  public static void main(String[] args) {
    HashMap<String,String> m = new HashMap<String,String>();
    m.put("name", "wm");
    m.put("age", "26");
    m.put("hobby", "xxoo");
    System.out.println(m.get(getUser().name));
  }

}
