package laba_2;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Марущак", "Назар", 19);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Серіалізований JSON: " + json);

        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десеріалізований об'єкт: " + deserializedPerson.getSurname() + " " + deserializedPerson.getName() + ", Вік: " + deserializedPerson.getAge());

        boolean isEqual = person.equals(deserializedPerson);
        System.out.println("Об'єкти рівні: " + isEqual);
    }
}
