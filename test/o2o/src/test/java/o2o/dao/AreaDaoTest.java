package o2o.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import o2o.BaseTest;
import o2o.entity.Area;

public class AreaDaoTest extends BaseTest {

  @Autowired
  private AreaDao areaDao;
  
  
  @Test
  public void testQueryArea(){
    List<Area> rel = areaDao.queryArea();
    assertEquals(2,rel.size());
  }
}
