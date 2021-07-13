package utils;

import pages.Locators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyMethods implements Locators {

    public boolean verifyLink(String url) {

        try {
            URL urlSite = new URL(url);  // java.net  import
            HttpURLConnection urlConnection = (HttpURLConnection) urlSite.openConnection();
            urlConnection.setConnectTimeout(3000);
            urlConnection.connect();
            if (urlConnection.getResponseCode() >= 200 && urlConnection.getResponseCode() < 400)
                return true;
            else return false;


        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}
