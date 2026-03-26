package Maps;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    HashMap<String, String> phoneMap = new HashMap<>();

    public void add(String name , String phone){
        phoneMap.put(name, phone);
        System.out.println(name + " has been added to phonebook");
    }

    public void search(String name){
        if(phoneMap.containsKey(name)){
            System.out.println("phone number for " + name + " is : " + phoneMap.get(name));
        }
        else{
            System.out.println("Phone number doesnot exist");
        }
    }

    public void remove(String name){
        if(phoneMap.containsKey(name)){
            phoneMap.remove(name);
            System.out.println("Contact removed successfully");
        }
        else{
            System.out.println("Contact doesnot exist");
        }
    }

    public void display(){
        for(Map.Entry<String, String> display : phoneMap.entrySet()){
            System.out.println(display.getKey() + " ---> " + display.getValue());
        }
    }
}
