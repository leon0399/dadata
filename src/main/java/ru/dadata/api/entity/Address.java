package ru.dadata.api.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author leon0399
 */
public class Address extends AbstractEntity {
    //region Variables

    @SerializedName("result")
    private String result;

    @SerializedName("postal_code")
    private String postalCode;

    @SerializedName("country")
    private String country;

    @SerializedName("region_fias_id")
    private String regionFiasId;

    @SerializedName("region_kladr_id")
    private String regionKladrId;

    @SerializedName("region_with_type")
    private String regionWithType;

    @SerializedName("region_type")
    private String regionType;

    @SerializedName("region_type_full")
    private String regionTypeFull;

    @SerializedName("region")
    private String region;

    @SerializedName("area_fias_id")
    private String areaFiasId;

    @SerializedName("area_kladr_id")
    private String areaKladrId;

    @SerializedName("area_with_type")
    private String areaWithType;

    @SerializedName("area_type")
    private String areaType;

    @SerializedName("area_type_full")
    private String areaTypeFull;

    @SerializedName("area")
    private String area;

    @SerializedName("city_fias_id")
    private String cityFiasId;

    @SerializedName("city_kladr_id")
    private String cityKladrId;

    @SerializedName("city_with_type")
    private String cityWithType;

    @SerializedName("city_area")
    private String cityArea;

    @SerializedName("city_district")
    private String cityDistrict;

    @SerializedName("city_type")
    private String cityType;

    @SerializedName("city_type_full")
    private String cityTypeFull;

    @SerializedName("city")
    private String city;

    @SerializedName("settlement_fias_id")
    private String settlementFiasId;

    @SerializedName("settlement_kladr_id")
    private String settlementKladrId;

    @SerializedName("settlement_with_type")
    private String settlementWithType;

    @SerializedName("settlement_type")
    private String settlementType;

    @SerializedName("settlement_type_full")
    private String settlementTypeFull;

    @SerializedName("settlement")
    private String settlement;

    @SerializedName("street_fias_id")
    private String streetFiasId;

    @SerializedName("street_kladr_id")
    private String streetKladrId;

    @SerializedName("street_with_type")
    private String streetWithType;

    @SerializedName("street_type")
    private String streetType;

    @SerializedName("street_type_full")
    private String streetTypeFull;

    @SerializedName("street")
    private String street;

    @SerializedName("house_fias_id")
    private String houseFiasId;

    @SerializedName("house_kladr_id")
    private String houseKladrId;

    @SerializedName("house_type")
    private String houseType;

    @SerializedName("house_type_full")
    private String houseTypeFull;

    @SerializedName("house")
    private String house;

    @SerializedName("block_type")
    private String blockType;

    @SerializedName("block_type_full")
    private String blockTypeFull;

    @SerializedName("block")
    private String block;

    @SerializedName("flat_type")
    private String flatType;

    @SerializedName("flat_type_full")
    private String flatTypeFull;

    @SerializedName("flat")
    private String flat;

    @SerializedName("flat_area")
    private double flatArea;

    @SerializedName("square_meter_price")
    private double squareMeterPrice;

    @SerializedName("flat_price")
    private double flatPrice;

    @SerializedName("postal_box")
    private String postalBox;

    @SerializedName("fias_id")
    private String fiasId;

    @SerializedName("fias_level")
    private FiasLevel fiasLevel;

    @SerializedName("kladr_id")
    private String kladrId;

    @SerializedName("capital_marker")
    private CapitalMarker capitalMarker;

    @SerializedName("okato")
    private String okato;

    @SerializedName("oktmo")
    private String oktmo;

    @SerializedName("tax_office")
    private String taxOffice;

    @SerializedName("tax_office_legal")
    private String taxOfficeLegal;

    @SerializedName("timezone")
    private String timezone;

    @SerializedName("geo_lat")
    private double geoLat;

    @SerializedName("geo_lon")
    private double geoLon;

    @SerializedName("beltway_hit")
    private BeltwayHitLevel beltwayHit;

    @SerializedName("beltway_distance")
    private String beltwayDistance;

    @SerializedName("qc_geo")
    private QcGeoAccuracy qcGeo;

    @SerializedName("qc_complete")
    private QcCompleteLevel qcComplete;

    @SerializedName("qc_house")
    private QcHouse qcHouse;

    @SerializedName("unparsed_parts")
    private String unparsedParts;
    //endregion

    //region Getters

    /**
     * @return Исходный адрес одной строкой
     */
    @Override
    public String getSource() {
        return super.getSource();
    }

    /**
     * @return Стандартизованный адрес одной строкой
     */
    public String getResult() {
        return result;
    }

    /**
     * @return Индекс
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @return Страна
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return Код ФИАС региона
     */
    public String getRegionFiasId() {
        return regionFiasId;
    }

    /**
     * @return Код КЛАДР региона
     */
    public String getRegionKladrId() {
        return regionKladrId;
    }

    /**
     * @return Регион с типом
     */
    public String getRegionWithType() {
        return regionWithType;
    }

    /**
     * @return Тип региона (сокращенный)
     */
    public String getRegionType() {
        return regionType;
    }

    /**
     * @return Тип региона
     */
    public String getRegionTypeFull() {
        return regionTypeFull;
    }

    /**
     * @return Регион
     */
    public String getRegion() {
        return region;
    }

    /**
     * @return Код ФИАС района в регионе
     */
    public String getAreaFiasId() {
        return areaFiasId;
    }

    /**
     * @return Код КЛАДР района в регионе
     */
    public String getAreaKladrId() {
        return areaKladrId;
    }

    /**
     * @return Район в регионе с типом
     */
    public String getAreaWithType() {
        return areaWithType;
    }

    /**
     * @return Тип района в регионе (сокращенный)
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * @return Тип района в регионе
     */
    public String getAreaTypeFull() {
        return areaTypeFull;
    }

    /**
     * @return Район в регионе
     */
    public String getArea() {
        return area;
    }

    /**
     * @return Код ФИАС города
     */
    public String getCityFiasId() {
        return cityFiasId;
    }

    /**
     * @return Код КЛАДР города
     */
    public String getCityKladrId() {
        return cityKladrId;
    }

    /**
     * @return Город с типом
     */
    public String getCityWithType() {
        return cityWithType;
    }

    /**
     * @return Административный округ (только для Москвы)
     */
    public String getCityArea() {
        return cityArea;
    }

    /**
     * @return Район города
     */
    public String getCityDistrict() {
        return cityDistrict;
    }

    /**
     * @return Тип города (сокращенный)
     */
    public String getCityType() {
        return cityType;
    }

    /**
     * @return Тип города
     */
    public String getCityTypeFull() {
        return cityTypeFull;
    }

    /**
     * @return Город
     */
    public String getCity() {
        return city;
    }

    /**
     * @return Код ФИАС нас. пункта
     */
    public String getSettlementFiasId() {
        return settlementFiasId;
    }

    /**
     * @return Код КЛАДР нас. пункта
     */
    public String getSettlementKladrId() {
        return settlementKladrId;
    }

    /**
     * @return Населенный пункт с типом
     */
    public String getSettlementWithType() {
        return settlementWithType;
    }

    /**
     * @return Тип населенного пункта (сокращенный)
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * @return Тип населенного пункта
     */
    public String getSettlementTypeFull() {
        return settlementTypeFull;
    }

    /**
     * @return Населенный пункт
     */
    public String getSettlement() {
        return settlement;
    }

    /**
     * @return Код ФИАС улицы
     */
    public String getStreetFiasId() {
        return streetFiasId;
    }

    /**
     * @return Код КЛАДР улицы
     */
    public String getStreetKladrId() {
        return streetKladrId;
    }

    /**
     * @return Улица с типом
     */
    public String getStreetWithType() {
        return streetWithType;
    }

    /**
     * @return Тип улицы (сокращенный)
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * @return Тип улицы
     */
    public String getStreetTypeFull() {
        return streetTypeFull;
    }

    /**
     * @return Улица
     */
    public String getStreet() {
        return street;
    }

    /**
     * @return Код ФИАС дома
     */
    public String getHouseFiasId() {
        return houseFiasId;
    }

    /**
     * @return Код КЛАДР дома
     */
    public String getHouseKladrId() {
        return houseKladrId;
    }

    /**
     * @return Тип дома (сокращенный)
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * @return Тип дома
     */
    public String getHouseTypeFull() {
        return houseTypeFull;
    }

    /**
     * @return Дом
     */
    public String getHouse() {
        return house;
    }

    /**
     * @return Тип корпуса/строения (сокращенный)
     */
    public String getBlockType() {
        return blockType;
    }

    /**
     * @return Тип корпуса/строения
     */
    public String getBlockTypeFull() {
        return blockTypeFull;
    }

    /**
     * @return Корпус/строение
     */
    public String getBlock() {
        return block;
    }

    /**
     * @return Тип квартиры (сокращенный)
     */
    public String getFlatType() {
        return flatType;
    }

    /**
     * @return Тип квартиры
     */
    public String getFlatTypeFull() {
        return flatTypeFull;
    }

    /**
     * @return Квартира
     */
    public String getFlat() {
        return flat;
    }

    /**
     * @return Площадь квартиры
     */
    public double getFlatArea() {
        return flatArea;
    }

    /**
     * @return Рыночная стоимость м²
     */
    public double getSquareMeterPrice() {
        return squareMeterPrice;
    }

    /**
     * @return Рыночная стоимость квартиры
     */
    public double getFlatPrice() {
        return flatPrice;
    }

    /**
     * @return Абонентский ящик
     */
    public String getPostalBox() {
        return postalBox;
    }

    /**
     * @return Код ФИАС
     */
    public String getFiasId() {
        return fiasId;
    }

    /**
     * Уровень детализации, до которого адрес найден в ФИАС
     *
     * @return @see {@link FiasLevel}
     */
    public FiasLevel getFiasLevel() {
        return fiasLevel;
    }

    /**
     * Код КЛАДР
     *
     * @return
     */
    public String getKladrId() {
        return kladrId;
    }

    /**
     * Является ли город центром
     *
     * @return @see {@link CapitalMarker}
     */
    public CapitalMarker getCapitalMarker() {
        return capitalMarker;
    }

    /**
     * @return Код ОКАТО
     */
    public String getOkato() {
        return okato;
    }

    /**
     * @return Код ОКТМО
     */
    public String getOktmo() {
        return oktmo;
    }

    /**
     * @return Код ИФНС для физических лиц
     */
    public String getTaxOffice() {
        return taxOffice;
    }

    /**
     * @return Код ИФНС для организаций (не заполняется)
     */
    public String getTaxOfficeLegal() {
        return taxOfficeLegal;
    }

    /**
     * @return Часовой пояс
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @return Координаты: широта
     */
    public double getGeoLat() {
        return geoLat;
    }

    /**
     * @return Координаты: долгота
     */
    public double getGeoLon() {
        return geoLon;
    }

    /**
     * Внутри кольцевой?
     *
     * @return @see {@link BeltwayHitLevel}
     */
    public BeltwayHitLevel getBeltwayHit() {
        return beltwayHit;
    }

    /**
     * Расстояние от кольцевой в км
     *
     * @return Расстояние от кольцевой в км если {@link #beltwayHit } = {@link BeltwayHitLevel#OUT_MKAD} или  {@link BeltwayHitLevel#OUT_KAD}, иначе null
     */
    public String getBeltwayDistance() {
        return beltwayDistance;
    }

    /**
     * Код точности координат
     *
     * @return @see {@link QcGeoAccuracy}
     * @see <a href="https://dadata.ru/api/clean/#qc_geo">Код точности координат</a>
     */
    public QcGeoAccuracy getQcGeo() {
        return qcGeo;
    }

    /**
     * Код пригодности к рассылке
     *
     * @return @see {@link QcCompleteLevel}
     * @see <a href="https://dadata.ru/api/clean/#qc_complete">Код пригодности к рассылке</a>
     */
    public QcCompleteLevel getQcComplete() {
        return qcComplete;
    }

    /**
     * Признак наличия дома в ФИАС
     *
     * @return @see {@link QcHouse}
     * @see <a href="https://dadata.ru/api/clean/#qc_house">Признак наличия дома в ФИАС</a>
     */
    public QcHouse getQcHouse() {
        return qcHouse;
    }

    public String getUnparsedParts() {
        return unparsedParts;
    }

    /**
     * Код проверки адреса
     *
     * @return
     * @see <a href="https://dadata.ru/api/clean/#qc>Код проверки адреса</a>
     */
    @Override
    public int getQc() {
        return super.getQc();
    }

    //endregion

    //region Enumerates

    // public enum FiasId {
    //     /**
    //      * Если дом найден в ФИАС по точному совпадению
    //      */
    //     @SerializedName("HOUSE.HOUSEGUID")
    //     HOUSE_HOUSEGUID,
    //
    //     /**
    //      * Если дом найден в ФИАС как часть интервала
    //      */
    //     @SerializedName("HOUSEINT.INTGUID")
    //     HOUSEINT_INTGUID,
    //
    //     /**
    //      * В противном случае
    //      */
    //     @SerializedName("ADDROBJ.AOGUID")
    //     ADDROBJ_AOGUID
    // }

    public enum FiasLevel {
        /**
         * Страна
         */
        @SerializedName("0")
        COUNTRY,

        /**
         * Регион
         */
        @SerializedName("1")
        REGION,

        /**
         * Район
         */
        @SerializedName("3")
        AREA,

        /**
         * Город
         */
        @SerializedName("4")
        CITY,

        /**
         * Населенный пункт
         */
        @SerializedName("6")
        SETTLEMENT,

        /**
         * Улица
         */
        @SerializedName("7")
        STREET,

        /**
         * Дом
         */
        @SerializedName("8")
        HOUSE,

        /**
         * Иностранный или пустой
         */
        @SerializedName("-1")
        FOREIGN_OR_EMPTY
    }

    public enum CapitalMarker {
        /**
         * Центр района (Московская обл, Одинцовский р-н, г Одинцово)
         */
        @SerializedName("1")
        AREA_CENTER,

        /**
         * Центр региона (Новосибирская обл, г Новосибирск)
         */
        @SerializedName("2")
        REGION_CENTER,

        /**
         * Центр района и региона (Костромская обл, Костромской р-н, г Кострома)
         */
        @SerializedName("3")
        AREA_OR_REGION_CENTER,

        /**
         * Ни то, ни другое (Московская обл, г Балашиха)
         */
        @SerializedName("0")
        OTHER
    }

    public enum BeltwayHitLevel {
        /**
         * Внутри МКАД (Москва)
         */
        @SerializedName("IN_MKAD")
        IN_MKAD,

        /**
         * За МКАД (Москва или Московская область)
         */
        @SerializedName("OUT_MKAD")
        OUT_MKAD,

        /**
         * Внутри КАД (Санкт-Петербург)
         */
        @SerializedName("IN_KAD")
        IN_KAD,

        /**
         * За КАД (Санкт-Петербург или Ленинградская область)
         */
        @SerializedName("OUT_KAD")
        OUT_KAD,

        /**
         * В остальных случаях
         */
        @SerializedName("")
        EMPTY
    }

    public enum QcGeoAccuracy {
        @SerializedName("0")
        ACCURATE,

        @SerializedName("1")
        NEAREST_HOME,

        @SerializedName("2")
        STREET,

        @SerializedName("3")
        SETTLEMENT,

        @SerializedName("4")
        CITY,

        @SerializedName("5")
        UNDEFINED
    }

    public enum QcCompleteLevel {
        @SerializedName("0")
        SUITABLE(DeliveryReadinessLevel.YES),

        @SerializedName("10")
        NO_FIAS(DeliveryReadinessLevel.MAYBE),

        @SerializedName("5")
        NO_FLAT(DeliveryReadinessLevel.MAYBE),

        @SerializedName("8")
        UNTIL_POST_OFFICE(DeliveryReadinessLevel.MAYBE),

        @SerializedName("9")
        DADATA_CHECK_ACCURACY(DeliveryReadinessLevel.MAYBE),

        @SerializedName("1")
        NO_REGION(DeliveryReadinessLevel.NO),

        @SerializedName("2")
        NO_CITY(DeliveryReadinessLevel.NO),

        @SerializedName("3")
        NO_STREET(DeliveryReadinessLevel.NO),

        @SerializedName("4")
        NO_HOUSE(DeliveryReadinessLevel.NO),

        @SerializedName("6")
        INCOMPLETE_ADDRESS(DeliveryReadinessLevel.NO),

        @SerializedName("7")
        FOREIGN_ADDRESS(DeliveryReadinessLevel.NO);

        private final DeliveryReadinessLevel deliveryReadinessLevelLevel;

        QcCompleteLevel(DeliveryReadinessLevel level) {
            this.deliveryReadinessLevelLevel = level;
        }

        public DeliveryReadinessLevel getDeliveryReadinessLevelLevel() {
            return deliveryReadinessLevelLevel;
        }
    }

    public enum DeliveryReadinessLevel {
        YES,
        MAYBE,
        NO
    }

    public enum QcHouse {
        @SerializedName("2")
        EXACT_MATCH(DeliveryLikelihoodLevel.HIGHT),

        @SerializedName("3")
        FIAS_SIMILAR_HOUSE(DeliveryLikelihoodLevel.MEDIUM),

        @SerializedName("4")
        DIAPASON(DeliveryLikelihoodLevel.MEDIUM),

        @SerializedName("10")
        NO_FIAS(DeliveryLikelihoodLevel.LOW);

        private final DeliveryLikelihoodLevel deliveryLikelihoodLevel;

        QcHouse(DeliveryLikelihoodLevel deliveryLikelihoodLevel) {
            this.deliveryLikelihoodLevel = deliveryLikelihoodLevel;
        }

        public DeliveryLikelihoodLevel getDeliveryLikelihoodLevel() {
            return deliveryLikelihoodLevel;
        }
    }

    public enum DeliveryLikelihoodLevel {
        HIGHT,
        MEDIUM,
        LOW
    }
    //endregion
}

