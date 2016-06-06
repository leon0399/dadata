package ru.dadata.api.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author leon0399
 */
public abstract class AbstractEntity {
    @SerializedName("source")
    private String source;

    @SerializedName("qc")
    private int qc;

    public String getSource() {
        return source;
    }

    public int getQc() {
        return qc;
    }
}
