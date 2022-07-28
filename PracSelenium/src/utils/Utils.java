package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

public static void saveScreenShot(String fileName, WebDriver driver) {


TakesScreenshot screenshot = (TakesScreenshot) driver;
File tmpSS = screenshot.getScreenshotAs(OutputType.FILE);
File fileSS = new File("C:\\EclipseSS\\"+fileName+".jpg");
try {
fileSS.createNewFile();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {
FileUtils.copyFile(tmpSS, fileSS);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}