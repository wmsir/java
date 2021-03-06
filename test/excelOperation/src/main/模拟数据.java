package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class 模拟数据 {
  public static void main(String[] args) {
    // 模拟xml数据
    ArrayList<String> a1 = new ArrayList<String>();
    a1.add("姓名");
    a1.add("年纪");
    a1.add("班级");
    a1.add("学号");
    ArrayList<String> a2 = new ArrayList<String>();
    a2.add("姓名2");
    a2.add("年纪2");
    a2.add("班级2");
    a2.add("学号2");
    HashMap<String, ArrayList<String>> h1 = new HashMap<String, ArrayList<String>>();
    h1.put("1", a1);
    h1.put("2", a2);

    // 模拟Excel数据
    ArrayList<String> b1 = new ArrayList<String>();
    b1.add("姓名");
    b1.add("年纪");
    b1.add("班级");
    b1.add("学号");
    ArrayList<String> b2 = new ArrayList<String>();
    ArrayList<String> b3 = new ArrayList<String>();
    b2.add("姓名");
    b2.add("年纪");
    b2.add("班级");
    b2.add("学号b2");

    b3.add("姓名");
    b3.add("年纪");
    b3.add("班级");
    b3.add("学号b2");

    HashMap<String, ArrayList<String>> h2 = new HashMap<String, ArrayList<String>>();
    h2.put("1", b1);
    h2.put("2", b2);
    h2.put("3", b3);

    compareContent(h1,h2);
  }
  
  
  public static void compareContent(HashMap<String, ArrayList<String>> h1,HashMap<String, ArrayList<String>> excel){
    Iterator<Entry<String, ArrayList<String>>> itExcel = excel.entrySet().iterator();
    while (itExcel.hasNext()) {
      Entry<String, ArrayList<String>> entry2 = itExcel.next();
      String tempKey = entry2.getKey();

      if (h1.get(tempKey) == null) {
        System.out.println(tempKey + " excel have ,xml have not ");
        continue;
      }
      if (entry2.getValue().equals(h1.get(tempKey))) {
        System.out.println("=== " + tempKey);
      } else {
        System.out.println(entry2.getValue() + " !== " + h1.get(tempKey));
      }
    }
  }
}
