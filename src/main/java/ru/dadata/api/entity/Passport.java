package ru.dadata.api.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author leon0399
 */
public class Passport extends AbstractEntity {

    @SerializedName("series")
    private String series;

    @SerializedName("number")
    private String number;

    /**
     * @return Исходная серия и номер одной строкой
     */
    @Override
    public String getSource() {
        return super.getSource();
    }

    /**
     * @return Серия
     */
    public String getSeries() {
        return series;
    }

    /**
     * @return Номер
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return Код проверки
     * @see <a href="https://dadata.ru/api/clean/#qc-passport">Информация о возвращаемых кодах</a>
     */
    @Override
    public int getQc() {
        return super.getQc();
    }

    @Override
    public String toString() {
        return "Passport[source=" + getSource() +
                ", series=" + getSeries() +
                ", number=" + getNumber() +
                ", qc=" + getQc() +
                "]";
    }
}
