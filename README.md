# FinalProjectMisionTIC2022Java

## What you need to have to work with this simple CRUD

The only thing you need to work with this simple CRUD is to have the **SQLite-jdbc-3.8.7.jar**
Which can be downloaded [here](https://jar-download.com/artifacts/org.xerial/sqlite-jdbc/3.8.7/source-code)
then you need to add it to your project.

1. In the file explorer of your IDE,then find your project.
2. Right click on the folder called **Libraries**
3. Select **Add JAR/FOLDER**
4. Find in your computer the downloaded file.
5. That's it.

## Can I use it with my own Database?

Yes, you can, the only need you need to do, is go to this file and change the name of the database
**remember** the DB has to be from **SQLITE**.

> /src/persistence/DBConnection.java

Here you need to go to line 15 and change the name with your database, remember to have it outside src folder already
or it will throw you an exception because couldn't find the file.
  ```
  url = "YOURDATABASENAME.db";
  ```
## What should I expect?

A simple program that makes simple calculations, can add, update, delete and list everything that a database has, it can be easily modified
This is the GUI that I did.


![Screenshot from 2022-07-31 22-19-26](https://user-images.githubusercontent.com/48632338/182065541-c45474b8-3b13-4c9e-87be-29f10727fff9.png)


