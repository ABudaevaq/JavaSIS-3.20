## JavaSIS #3.20. Занятие №4

## Задание

### 1. Реализовать методы в классе `CSVAdapter`;

Описать интерфейс и имплементацию для работы с CSV-файлами любых сущностей.

    IOAdapter<Author> authorAdapter =
    new CSVAdapterImpl<>(Author.class,authorFileReader,authorFileWriter);
    ...
    IOAdapter<Book> bookAdapter =
    new CSVAdapterImpl<>(Book.class,bookFileReader,bookFileWriter);

В примере используются **Book** и **Author**. Вы также можете придумать 
и свои типы.

    int rowIndex = authorCsvAdapter.append(authorNew);
    Author authorNewOpened = authorCsvAdapter.read(rowIndex);

_Обратите внимание на конструкцию методов._

### 2. Дописать тесты в классе `CSVAdapterTest`.
Проверить запись и чтение файлов при помощи полученного адаптера.

    Author author = authorCsvAdapter.read(0);
    assertEquals("Лев Николаевич Толстой",author.getName());
    assertEquals("Ясная Поляна",author.getBirthPlace());

    Author authorNew = new Author("Некоторый Автор", "Некоторый Город");
    int rowIndex = authorCsvAdapter.append(authorNew);
    Author authorNewOpened = authorCsvAdapter.read(rowIndex);
    assertEquals("Некоторый Автор",author.getName());
    assertEquals("Некоторый Город",author.getBirthPlace());

* Проверить чтение из определенной строки
* Проверить запись. Новая строка в файле должна соответствовать 
поданной в метод записи сущности

### _Задания под звездочкой_
* Придумать и описать дополнительные сущности;
* Написать Обертку ( `Декоратор` ) для интерфейса `IOAdapter`, 
который будет логировать ( например, просто выводить на экран ) 
любые действия над внутренним объектом `IOAdapter`.

Всем желаем удачного выполнения всех заданий !
