package org.example;

public class Main {
    public static void main(String[] args) {
        DatabaseOperations db = new InMemoryDatabase();

        // Сохранение данных
        User user1 = new User(1, "John Doe");
        db.save(user1);

        // Поиск данных
        User foundUser = (User) db.findByKey(user1.hashCode());
        System.out.println(foundUser.getName()); // Выведет "John Doe"

        // Удаление данных
        db.delete(user1.hashCode());

        // Попытка найти удаленного пользователя
        User deletedUser = (User) db.findByKey(user1.hashCode());
        System.out.println(deletedUser); // Выведет null
    }
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}