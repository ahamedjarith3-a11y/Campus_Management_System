# Campus_Management_System
# run command for Linux

javac -d out $(find src -name "*.java")
java -cp out com.campus.app.Main


## run command for Windows

javac -d out src\com\campus\model\Student.java
javac -d out src\com\campus\sevice\StudentService.java
javac -d out src\com\campus\app\Main.java
