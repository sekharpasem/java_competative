import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/*Solution to:
 ['Tokyo', 'London', 'Rome', 'Donlon', 'Kyoto', 'Paris']
 // YOUR ALGORITHM
 [
     [ 'Tokyo', 'Kyoto' ],
     [ 'London', 'Donlon' ],
     [ 'Rome' ],
     [ 'Paris' ]
 ]*/



class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String[] citys={"Tokyo","London","Rome","Donlon","Kyoto","Paris"};
    Map<String,List> cityMap = new HashMap<>();
    for(String city:citys){
      char[] chars = city.toLowerCase().toCharArray();
      Arrays.sort(chars);
      String sorted_str= new String(chars);
      if(cityMap.get(sorted_str)== null){
       List<String> list = new ArrayList<String>();
       list.add(city);
        cityMap.put(sorted_str,list );
      }else{
        cityMap.get(sorted_str).add(city);
      }
    }
    System.out.print(cityMap);
  }
}