package ru.dadata.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dadata.api.entity.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author leon0399
 */
public final class DaData {
    private static final String API_VERSION = "v2";
    private static final String API_URL = "https://dadata.ru/api";

    private static final String REQUEST_METHOD_GET = "GET";
    private static final String REQUEST_METHOD_POST = "POST";

    private static final Logger LOGGER = LoggerFactory.getLogger(DaData.class);
    private final String authKey;
    private final String authSecret;
    private final Gson gson = new GsonBuilder().create();

    /**
     * @param key
     * @param secret
     */
    public DaData(String key, String secret) {
        authKey = key;
        authSecret = secret;
    }

    public double getBalance() {
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(fetchJson("profile/balance", REQUEST_METHOD_GET));
        return jsonElement.getAsJsonObject().get("balance").getAsDouble();
    }

    public Address cleanAddress(String source) {
        return cleanAddresses(source)[0];
    }

    public Address[] cleanAddresses(String... sources) {
        return populate(Address[].class, "clean/address", sources);
    }

    public Phone cleanPhone(String source) {
        return cleanPhones(source)[0];
    }

    public Phone[] cleanPhones(String... sources) {
        return populate(Phone[].class, "clean/phone", sources);
    }

    public Passport cleanPassport(String source) {
        return cleanPassports(source)[0];
    }

    public Passport[] cleanPassports(String... sources) {
        return populate(Passport[].class, "clean/passport", sources);
    }

    public Name cleanName(String source) {
        return cleanNames(source)[0];
    }

    public Name[] cleanNames(String... sources) {
        return populate(Name[].class, "clean/name", sources);
    }

    public Email cleanEmail(String source) {
        return cleanEmails(source)[0];
    }

    public Email[] cleanEmails(String... sources) {
        return populate(Email[].class, "clean/email", sources);
    }

    public Birthdate cleanBirthdate(String source) {
        return cleanBirthdates(source)[0];
    }

    public Birthdate[] cleanBirthdates(String... sources) {
        return populate(Birthdate[].class, "clean/birthdate", sources);
    }

    public Vehicle cleanVehicle(String source) {
        return cleanVehicles(source)[0];
    }

    public Vehicle[] cleanVehicles(String... sources) {
        return populate(Vehicle[].class, "clean/vehicle", sources);
    }

    private <T> T populate(Class<T> tClass, String method, String... sources) {
        return gson.fromJson(fetchJson(method, REQUEST_METHOD_POST, sources), tClass);
    }

    private String fetchJson(String method, String requestMethod, String... sources) {
        String toReturn = null;

        try {
            URL url = new URL(API_URL + "/" + API_VERSION + "/" + method);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod);
            connection.addRequestProperty("Content-Type", "application/json");
            connection.addRequestProperty("Authorization", "Token " + authKey);
            connection.addRequestProperty("X-Secret", authSecret);

            if (sources.length > 0) {
                connection.setDoOutput(true);
                OutputStream outputStream = connection.getOutputStream();
                outputStream.write(gson.toJson(sources).getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                outputStream.close();
            }

            InputStream inputStream = connection.getInputStream();

            toReturn = IOUtils.toString(inputStream, "UTF-8");
            inputStream.close();
        } catch (ProtocolException e) {
            LOGGER.error("Error fetching data", e);
        } catch (MalformedURLException e) {
            LOGGER.error("Error fetching data", e);
        } catch (IOException e) {
            LOGGER.error("Error fetching data", e);
        }

        return toReturn;
    }
}
