package jackson.arraynode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import bean.User;

import org.junit.Test;

public class ArrayNodeTest {

	@Test
	public void test1() {
//		1.创建一个ObjectMapper对象 om
	  int x =10;
		ObjectMapper om = new ObjectMapper();
		Map<String, String> hashMap = new HashMap<String, String>(16);
		hashMap.put("name", "wm");
		hashMap.put("sex", "1");
		hashMap.put("login", "wwwxxx");
		hashMap.put("password", "123abc");
		try {
//			2.通过readTree()方法将字符串转为JsonNode
			JsonNode one = om.readTree("{\"1\":111}");
			JsonNode two = om.readTree(om.writeValueAsString(hashMap));
			ArrayNode arrayNode = om.createArrayNode();
			arrayNode.add(one);
			arrayNode.add(two);
			System.out.println(arrayNode);
			System.out.println(arrayNode.get("1"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 将arraynode添加到JsonNode里面
	 */
	@Test
	public void test2() {
		ObjectMapper om = new ObjectMapper();
		Map<String, String> hashMap = new HashMap<String, String>(16);
		hashMap.put("name", "wm");
		hashMap.put("sex", "man");
		try {
//			2.通过readTree()方法将字符串转为JsonNode
			JsonNode me = om.readTree(om.writeValueAsString(hashMap));
			JsonNode ta = om.readTree(om.writeValueAsString(hashMap));
			ArrayNode arrayNode = om.createArrayNode();
			arrayNode.add(me);
			arrayNode.add(ta);
			Map<String, String> info = new HashMap<String, String>(16);
			info.put("info", arrayNode.toString());
			JsonNode root = om.readTree(om.writeValueAsString(info));
			System.out.println("root == "+root);
			System.out.println("info == "+root.get("info"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  将javabean转为json
	 * @throws IOException 
	 */
	@Test
	public void test3() throws IOException {
		ObjectMapper om = new ObjectMapper();
		User user = new User();
		user.setName("wm");
		user.setAge(26);
		JsonNode root = om.readTree(om.writeValueAsString(user));
		System.out.println(root);
		System.out.println(om.writerWithDefaultPrettyPrinter().writeValueAsString(user));
	}
	/**
	 *  将json转为javabean
	 * @throws IOException 
	 */
	@Test
	public void test4() throws IOException {
		ObjectMapper om = new ObjectMapper();
		String user = "{\"age\":26,\"name\":\"wm\"}";
		User root = om.readValue(user, User.class);
		System.out.println(root);
	}
}
