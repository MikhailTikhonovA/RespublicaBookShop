package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PrivateData {

    private static String getPrivateProperty(String key) {
        FileInputStream fis = null;
        Properties property = new Properties();
        String data = "";
        try {
            fis = new FileInputStream("src/test/resources/test_data.properties");
            property.load(fis);
            data = property.getProperty(key);
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static String getValidPassword() {
        return getPrivateProperty("valid_password");
    }

    public static String getValidEmail() {
        return getPrivateProperty("valid_email");
    }


    public static String getInvalidPassword() {
        return getPrivateProperty("invalid_password");
    }

    public static String getInvalidEmail() {
        return getPrivateProperty("invalid_email");
    }

}
