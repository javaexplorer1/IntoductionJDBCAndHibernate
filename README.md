# IntoductionJDBCAndHibernate

In this project works in Java with a local database using the JDBC standard and the Hibernate framework. A connection to the database is established, a user table is created, users are added to the database, a list of users is obtained, users are deleted from the table, and the table itself is deleted. Hibernate is configured in three different ways:
    - passing an instance of java.util.Properties to Configuration.setProperties();
    - placing a file named hibernate.properties in the root of the classpath;
    - inclusion of <property> elements in the hibernate.cfg.xml file.
-----

В этом проекте производится работа в Жава с локальной базой данных с использованием стандарта JDBC и фреймворка Hibernate. Устанавлиается подключение к базе данных, создание таблицы пользователей, добавление пользователей в базу данных, получение списка пользователей, удаление пользователей из таблицы и удаление самой таблицы. Конфигурирование Hibernate осуществляется тремя разными способами:
   - передачей экземпляра java.util.Properties в Configuration.setProperties();
   - размещение файла с именем hibernate.properties в корне classpath;
   - включение элементов <property> в файл hibernate.cfg.xml.
