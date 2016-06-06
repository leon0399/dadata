package ru.dadata.api.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author leon0399
 */
public class Name extends AbstractEntity {

    @SerializedName("result")
    private String result;

    @SerializedName("result_genitive")
    private String resultGenitive;

    @SerializedName("result_dative")
    private String resultDative;

    @SerializedName("result_ablative")
    private String resultAblative;

    @SerializedName("surname")
    private String surname;

    @SerializedName("name")
    private String name;

    @SerializedName("patronymic")
    private String patronymic;

    @SerializedName("gender")
    private Gender gender;

    /**
     * @return Исходное ФИО одной строкой
     */
    @Override
    public String getSource() {
        return super.getSource();
    }

    /**
     * @return Стандартизованное ФИО одной строкой
     */
    public String getResult() {
        return result;
    }

    /**
     * @return ФИО в родительном падеже (кого?)
     */
    public String getResultGenitive() {
        return resultGenitive;
    }

    /**
     * @return ФИО в дательном падеже (кому?)
     */
    public String getResultDative() {
        return resultDative;
    }

    /**
     * @return ФИО в творительном падеже (кем?)
     */
    public String getResultAblative() {
        return resultAblative;
    }

    /**
     * @return Фамилия
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @return Имя
     */
    public String getName() {
        return name;
    }

    /**
     * @return Отчество
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Пол
     *
     * @return М если сужской, Ж если женский, иначе НД
     */
    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Name[source=" + getSource() +
                ", result=" + getResult() +
                ", resultGenitive=" + getResultGenitive() +
                ", resultDative=" + getResultDative() +
                ", resultAblative=" + getResultAblative() +
                ", surname=" + getSurname() +
                ", name=" + getName() +
                ", patronymic=" + getPatronymic() +
                ", gender=" + getGender() +
                ", qc=" + getQc() +
                "]";
    }

    public enum Gender {
        @SerializedName("М")
        MALE,

        @SerializedName("Ж")
        FEMALE,

        @SerializedName("НД")
        UNKNOWN
    }
}
