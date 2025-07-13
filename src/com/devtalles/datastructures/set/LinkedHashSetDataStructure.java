package com.devtalles.datastructures.set;

import com.devtalles.datastructures.shared.User;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDataStructure {
    public static void execute() {
        /*
          Un HashSet no tiene un order.
          LinkedHashSet: Es un double linked list que SI respeta el order de inserción.
          Tanto el HashSet y el LinkedHashSet implementan los mismos métodos.
         */
        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(300);
        numbers.add(4500);
        numbers.add(200);

        System.out.println(numbers);

         /*
          Utilizando una clase personalizada.
          Un HashSet NO tiene un orden, pero cuando trabajamos con un
          LikedHashSet, SI lo tiene.
         */
        Set<User> users = new LinkedHashSet<>();
        User user1 = new User("123", "Maria");
        User user2 = new User("456", "Ana");
        User user3 = null; // Podemos agregar nulos a un set
        User user4 = new User("456", "John"); // Este no lo va a agregar porque tiene mismo hasCode y mismo valor
        User user5 = new User("678", "Daniel");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        System.out.println(users);

        System.out.println(users.contains(new User("123", "Maria")));
        System.out.println(users.contains(user5));
    }
}
