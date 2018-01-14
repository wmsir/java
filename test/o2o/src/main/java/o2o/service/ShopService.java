package o2o.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;
import o2o.dto.ShopExecution;
import o2o.entity.Shop;

public interface ShopService {

  
  public ShopExecution addShop(Shop shop,CommonsMultipartFile shopImg);
}
