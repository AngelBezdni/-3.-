package org.example;

public interface DatabaseOperations {
    void save(Object data);          // Сохранение данных
    void delete(Object key);         // Удаление данных по ключу
    Object findByKey(Object key);    // Получение данных по ключу
}