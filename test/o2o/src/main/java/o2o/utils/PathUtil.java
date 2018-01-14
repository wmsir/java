package o2o.utils;

public class PathUtil {
  private static String seprator = System.getProperty("file.seprator");
  public static String getImageBasePath(){
    String os = System.getProperty("os.name");
    String basePath = "";
    
    if(os.toLowerCase().startsWith("win")){
      basePath = "E:/temp/images";
    }
    else{
      basePath = "/tmp/images";
    }
    basePath.replace("/", seprator);
    return basePath;
  }
  
  
  public static String getShopImagePath(long shopId){
    String imagePath = "upload/item/shop"+shopId+"/";
    return imagePath.replace("/", seprator);
  }
}