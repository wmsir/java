package o2o.dao;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import o2o.BaseTest;
import o2o.entity.Area;
import o2o.entity.Shop;
import o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest{

  
  @Autowired
  private ShopDao shopDao;
  
  
  @Test
  public void testinsertShop(){
    Shop shop = new Shop();
    shop.setOwnerId(1L);
    Area area = new Area();
    area.setAreaId(3);
    ShopCategory sc = new ShopCategory();
    sc.setShopCategoryId(11L);
    shop.setShopName("mytest1");
    shop.setShopDesc("mytest1");
    shop.setShopAddr("testaddr1");
    shop.setPhone("13810524526");
    shop.setShopImg("test1");
    shop.setLongitude(1D);
    shop.setLatitude(1D);
    shop.setCreateTime(new Date());
    shop.setLastEditTime(new Date());
    shop.setEnableStatus(0);
    shop.setAdvice("审核中");
    shop.setArea(area);
    shop.setShopCategory(sc);
    int effectedNum = shopDao.insertShop(shop);
    assertEquals(1, effectedNum);
    
    
  }
  
}
