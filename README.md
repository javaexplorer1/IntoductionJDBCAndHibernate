# IntoductionJDBCAndHibernate

In this project, we work in Java with a local database using the <strong>JDBC</strong> standard and the <strong>Hibernate</strong> framework: we establish a connection to the database, create a user table, add users to the database, get a list of users, remove users from the table and delete the table itself. Hibernate is configured in three different ways:

- passing an instance of java.util.Properties to Configuration.setProperties();
- placing a file named hibernate.properties in the root of the classpath;
- inclusion of <property> elements in the hibernate.cfg.xml file.
    
----

В этом проекте мы работаем в Java с локальной базой данных, используя стандарт JDBC и фреймворк Hibernate: устанавливаем соединение с базой данных, создаем таблицу пользователей,  добавляем пользователей в базу данных, получаем список пользователей, удаляем пользователей из таблицы и удаляем саму таблицу. Hibernate настраиваем тремя различными способами:

   - передачей экземпляра java.util.Properties в Configuration.setProperties();
   - размещение файла с именем hibernate.properties в корне classpath;
   - включение элементов <property> в файл hibernate.cfg.xml.
