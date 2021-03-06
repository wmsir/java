package o2o.service;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import o2o.BaseTest;
import o2o.entity.Area;


public class AreaServiceTest extends BaseTest {
  
  @Autowired(required=true)
  private AreaService areaService;
  
  @Test
  public void testgetAreaList(){
    List<Area> arerList = areaService.getAreaList();
    assertEquals("北京",arerList.get(0).getAreaName());
  }
}
