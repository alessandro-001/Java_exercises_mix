package Hashcode;

import java.util.Map;
import java.util.HashMap;

class Main {

  void mapStudents(){

    // Maps student numbers to names
    Map<Long, String> map = new HashMap<>();
    map.put(23423424l, " Mary Smith");
    map.put(33243234l, " Sarah Johnson");
    map.put(321321l," John Smith");
    map.put(3244230l, " Sarah Johnson");
    map.put(23423425l, " Joey Ferguson");

    System.out.println(map);
  }
  
  public static void main(String[] args) {
    Main main = new Main();
    main.mapStudents();
  }
}
