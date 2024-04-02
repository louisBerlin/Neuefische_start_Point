package org.example.neuefische_start_point;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    Map<String,Message> messages = new HashMap<>();

    @GetMapping("/hello")
    public String printHelloWorld () {

        return "Hello, World!";
    }



  //  Step 3: Use path variables to customize the name in the message.
  //  Example: '/api/hello/John' returns 'Hello, John!'.


    @GetMapping("/hello/{name}")
    public String printHelloWorldWithname (@PathVariable String name) {

        return "Hello, World! "+ name;
    }


    // BONUS
    // Step 1: Create a new class 'Message' with the fields 'name', 'message', and 'id' of type String.
    // Step 2: The controller should now have a list of Message objects.
    // Step 3: Implement an additional controller method that handles a POST request to '/api/messages'. This method should accept an id, a name, and a message in the request body and store them in the list.


    @PostMapping("/messages")
    public void addMessage (@RequestBody Message m) {

        messages.put(m.id,m);

        System.out.println(messages.toString());
    }


    //  Step 4: Implement an additional controller method that handles a GET request to '/api/messages'. This method should return the list of messages.


    @GetMapping("/messages")
    public List<Message> getMessage () {



        return messages.values().stream().toList();
    }



   // Step 5: Implement an additional controller method that handles a DELETE request to '/api/messages/id'. This method should delete the message with the corresponding id from the list. (use a path variable)
   @DeleteMapping("/messages/{id}")
   public String removeItem(@PathVariable String id) {
       // Code zum Löschen eines Elements mit der ID
       messages.remove(id);
       return "Item with ID " + id + " removed successfully.";
   }





}
