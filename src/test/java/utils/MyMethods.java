package utils;

import pages.Locators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class MyMethods implements Locators {

    public int randomSayi(int sayi) {

        // return  (int) (Math.random()*(sayi-1));

        Random index = new Random();

        return index.nextInt(sayi - 1);
    }

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
