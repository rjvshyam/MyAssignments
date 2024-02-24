package week3.HA3;

public abstract class MySqlConnection implements DatabaseConnection{
	
public void connect(int a) {
System.out.println("Im implemented from interface DatabaseConnection :"+a);
}
public void disconnect() {
System.out.println("Im implemented from interface DatabaseConnection");
}
public void executeUpdate() {
System.out.println("Im implemented from interface DatabaseConnection");
}
public void executeQuery(String text) {
System.out.println("Im implemented from abstract MySqlConnection :"+text);
}

}
