package week3.HA3;

public class JavaConnection implements DatabaseConnection{

public void connect(int a) {
System.out.println("Im implemented from interface DatabaseConnection :"+a);
}
public void disconnect() {
System.out.println("Im implemented from interface DatabaseConnection");
}
public void executeUpdate() {
System.out.println("Im implemented from interface DatabaseConnection");
}
public static void main(String[] args) {

JavaConnection obj = new JavaConnection();

obj.connect(15);
obj.disconnect();
obj.executeUpdate();

}
}
