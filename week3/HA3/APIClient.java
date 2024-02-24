package week3.HA3;

public class APIClient {

public void sendRequest(String endpoint) {
System.out.println(endpoint);
}
public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
System.out.println(endpoint+" "+requestBody+" "+requestStatus);
}		
public static void main(String[] args) {

APIClient obj = new APIClient();
obj.sendRequest("https://www.testleaf.com");
obj.sendRequest("https://www.testleaf.com", "name, dob", true);
	
}
}
