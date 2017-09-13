package jackson.ArrayNode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class ArrayNodeTest {

	@Test
	public void test1() {
//		1.创建一个ObjectMapper对象 om
		ObjectMapper om = new ObjectMapper();
		Map<String, String> hashMap = new HashMap<String, String>();
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
}
