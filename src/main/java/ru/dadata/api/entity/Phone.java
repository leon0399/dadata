package ru.dadata.api.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author leon0399
 */
public class Phone extends AbstractEntity {

    @SerializedName("type")
    private String type;

    @SerializedName("phone")
    private String phone;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("city_code")
    private String cityCode;

    @SerializedName("number")
    private String number;

    @SerializedName("extension")
    private String extension;

    @SerializedName("provider")
    private String provider;

    @SerializedName("region")
    private String region;

    @SerializedName("timezone")
    private String timezone;

    @SerializedName("qc_conflict")
    private int qcConflict;

    /**
     * @return Исходный телефон одной строкой
     */
    @Override
    public String getSource() {
        return super.getSource();
    }

    /**
     * @return Тип телефона
     */
    public String getType() {
        return type;
    }

    /**
     * @return Стандартизованный телефон одной строкой
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return Код страны
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @return Код города / DEF-код
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @return Локальный номер телефона
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return Добавочный номер
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @return Оператор связи
     */
    public String getProvider() {
        return provider;
    }

    /**
     * @return Регион
     */
    public String getRegion() {
        return region;
    }

    /**
     * @return Часовой пояс
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @return Признак конфликта телефона с адресом
     * @see <a href="https://dadata.ru/api/clean/#qc_conflict">Информация о возвращаемых кодах</a>
     */
    public int getQcConflict() {
        return qcConflict;
    }

    /**
     * @return Код проверки
     * @see <a href="https://dadata.ru/api/clean/#qc-phone">Информация о возвращаемых кодах</a>
     */
    @Override
    public int getQc() {
        return super.getQc();
    }

    @Override
    public String toString() {
        return "Phone[source=" + getSource() +
                ", type=" + getType() +
                ", phone=" + getPhone() +
                ", countryCode=" + getCountryCode() +
                ", cityCode=" + getCityCode() +
                ", number=" + getNumber() +
                ", extension=" + getExtension() +
                ", provider=" + getProvider() +
                ", region=" + getRegion() +
                ", timezone=" + getTimezone() +
                ", qcConflict=" + getQcConflict() +
                ", qc=" + getQc() +
                "]";
    }
}
