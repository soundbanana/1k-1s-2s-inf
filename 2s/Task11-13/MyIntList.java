// "Практика от 15 фев. Дедлайн - 22 фев в 22:00
// 12. Реализовать класс MyArrayIntList, реализующий интерфейс MyIntList и хранящий (инкапсулирующий) элементы списка в массиве.
// 13. Реализовать класс MyLinkedIntList, реализующий интерфейс MyIntList и хранящий (инкапсулирующий) элементы списка в линейном односвязном списке."


public interface MyIntList {

    void add(int x);  //   Добавление элемента в список

    void add(int x, int i); // Добавление на позицию (если позиции нет, то исключение)

    int size(); // размер списка

    boolean isEmpty(); // проверка списка на пустоту

    void clear();  // очистить список

    boolean remove(int x); // удалить первое упоминание элемента x в списке (true - если удалилось, false - если не нашлось такого элемента),

    int removeAll(int x); // удалить все элементы списка, равные x (возвращает число, равное количеству произведенных удалений),

    int[] toArray();  // вернуть массив, хранящий элементы списка,

    void merge(MyIntList lst);  // выполнить слияние этого списка со списком lst

    boolean contains(int x);  // проверить наличие
}