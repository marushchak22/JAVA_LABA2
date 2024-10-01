package laba_2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Марущак", "Назар", 19);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String json = objectMapper.writeValueAsString(person);
            System.out.println("Серіалізований JSON: " + json);

            Person deserializedPerson = objectMapper.readValue(json, Person.class);
            System.out.println("Десеріалізований об'єкт: " + deserializedPerson.surname() + " " + deserializedPerson.name() + ", Вік: " + deserializedPerson.age());

            boolean isEqual = person.equals(deserializedPerson);
            System.out.println("Об'єкти рівні: " + isEqual);
            
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}