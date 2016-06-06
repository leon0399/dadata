package ru.dadata.api.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author leon0399
 */
public class Email extends AbstractEntity {

    @SerializedName("email")
    private String email;

    /**
     * @return Стандартизованный email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return Код проверки
     * @see <a href="https://dadata.ru/api/clean/#qc-email">Информация о возвращаемых кодах</a>
     */
    @Override
    public int getQc() {
        return super.getQc();
    }

    @Override
    public String toString() {
        return "Email[source=" + getSource() +
                ", email=" + getEmail() +
                ", qc=" + getQc() +
                "]";
    }
}
