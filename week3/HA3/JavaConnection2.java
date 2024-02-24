package week3.HA3;

public class JavaConnection2 extends MySqlConnection{

public static void main(String[] args) {
JavaConnection2 obj = new JavaConnection2();

obj.connect(15);
obj.disconnect();
obj.executeUpdate();
obj.executeQuery("Fifteenth");

	}

}
