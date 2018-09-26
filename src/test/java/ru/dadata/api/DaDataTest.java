package ru.dadata.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.dadata.api.entity.*;

/**
 * @author leon0399
 */
public class DaDataTest extends Assert {
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Ваш API-ключ
     *
     * @see <a href="https://dadata.ru/profile/#info">Профиль</a>
     */
    private static final String API_KEY = "[REDACTED]";

    /**
     * Секретный ключ для стандартизации
     *
     * @see <a href="https://dadata.ru/profile/#info">Профиль</a>
     */
    private static final String API_SECRET = "[REDACTED]";

    private DaData daData = new DaData(API_KEY, API_SECRET);

    public DaDataTest() {
        String apiKey = System.getenv("API_KEY");
        String apiSecret = System.getenv("API_SECRET");
        daData = new DaData(apiKey, apiSecret);
    }

    @Before
    public void tearUp() {
        LOGGER.info("Ваш баланс: {}р.", daData.getBalance());
    }

    @Test
    public void cleanAddress() {
        final Address address = daData.cleanAddress("мск сухонска 11/-89");

        assertEquals("г Москва, ул Сухонская, д 11, кв 89", address.getResult());
        assertEquals("127642", address.getPostalCode());
        assertEquals("Россия", address.getCountry());
        assertEquals("0c5b2444-70a0-4932-980c-b4dc0d3f02b5", address.getRegionFiasId());
        assertEquals("7700000000000", address.getRegionKladrId());
        assertEquals("г Москва", address.getRegionWithType());
        assertEquals("г", address.getRegionType());
        assertEquals("город", address.getRegionTypeFull());
        assertEquals("Москва", address.getRegion());
        assertEquals(null, address.getAreaFiasId());
        assertEquals(null, address.getAreaKladrId());
        assertEquals(null, address.getAreaWithType());
        assertEquals(null, address.getAreaType());
        assertEquals(null, address.getAreaTypeFull());
        assertEquals(null, address.getArea());
        assertEquals(null, address.getCityFiasId());
        assertEquals(null, address.getCityKladrId());
        assertEquals(null, address.getCityWithType());
        assertEquals(null, address.getCityType());
        assertEquals(null, address.getCityTypeFull());
        assertEquals(null, address.getCity());
        assertEquals("Северо-восточный", address.getCityArea());
        assertEquals("Северное Медведково", address.getCityDistrict());
        assertEquals(null, address.getSettlementFiasId());
        assertEquals(null, address.getSettlementKladrId());
        assertEquals(null, address.getSettlementWithType());
        assertEquals(null, address.getSettlementType());
        assertEquals(null, address.getSettlementTypeFull());
        assertEquals(null, address.getSettlement());
        assertEquals("95dbf7fb-0dd4-4a04-8100-4f6c847564b5", address.getStreetFiasId());
        assertEquals("77000000000283600", address.getStreetKladrId());
        assertEquals("ул Сухонская", address.getStreetWithType());
        assertEquals("ул", address.getStreetType());
        assertEquals("улица", address.getStreetTypeFull());
        assertEquals("Сухонская", address.getStreet());
        assertEquals("5ee84ac0-eb9a-4b42-b814-2f5f7c27c255", address.getHouseFiasId());
        assertEquals("7700000000028360004", address.getHouseKladrId());
        assertEquals("д", address.getHouseType());
        assertEquals("дом", address.getHouseTypeFull());
        assertEquals("11", address.getHouse());
        assertEquals(null, address.getBlockType());
        assertEquals(null, address.getBlockTypeFull());
        assertEquals(null, address.getBlock());
        assertEquals("кв", address.getFlatType());
        assertEquals("квартира", address.getFlatTypeFull());
        assertEquals("89", address.getFlat());
        assertEquals(34.6, address.getFlatArea(), 0);
        assertEquals(198113, address.getSquareMeterPrice(), 0);
        assertEquals(6854710, address.getFlatPrice(), 0);
        assertEquals(null, address.getPostalBox());
        assertEquals("5ee84ac0-eb9a-4b42-b814-2f5f7c27c255", address.getFiasId());
        assertEquals(Address.FiasLevel.HOUSE, address.getFiasLevel());
        assertEquals("7700000000028360004", address.getKladrId());
        assertEquals(Address.CapitalMarker.OTHER, address.getCapitalMarker());
        assertEquals("45280583000", address.getOkato());
        assertEquals("45362000", address.getOktmo());
        assertEquals("7715", address.getTaxOffice());
        assertEquals("7715", address.getTaxOfficeLegal());
        assertEquals("UTC+3", address.getTimezone());
        assertEquals(55.878506, address.getGeoLat(), 0.0005);
        assertEquals(37.6535443, address.getGeoLon(), 0.0005);
        assertEquals(Address.BeltwayHitLevel.IN_MKAD, address.getBeltwayHit());
        assertEquals(null, address.getBeltwayDistance());
        assertEquals(Address.QcGeoAccuracy.ACCURATE, address.getQcGeo());
        assertEquals(Address.QcCompleteLevel.SUITABLE, address.getQcComplete());
        assertEquals(Address.QcHouse.EXACT_MATCH, address.getQcHouse());
    }

    @Test
    public void cleanPhone() throws Exception {
        final Phone phone = daData.cleanPhone("тел 7165219 доб139");

        assertEquals("Стационарный", phone.getType());
        assertEquals("+7 495 716-52-19 доб. 139", phone.getPhone());
        assertEquals("7", phone.getCountryCode());
        assertEquals("495", phone.getCityCode());
        assertEquals("7165219", phone.getNumber());
        assertEquals("139", phone.getExtension());
        assertEquals("ОАО \"МГТС\"", phone.getProvider());
        assertEquals("Москва", phone.getRegion());
        assertEquals("UTC+3", phone.getTimezone());
    }

    @Test
    public void cleanPassport() throws Exception {
        final Passport passport = daData.cleanPassport("4509 235857");

        assertEquals("45 09", passport.getSeries());
        assertEquals("235857", passport.getNumber());
    }

    @Test
    public void cleanName() throws Exception {
        final Name name = daData.cleanName("Срегей владимерович иванов");

        assertEquals("Иванов Сергей Владимирович", name.getResult());
        assertEquals("Иванова Сергея Владимировича", name.getResultGenitive());
        assertEquals("Иванову Сергею Владимировичу", name.getResultDative());
        assertEquals("Ивановым Сергеем Владимировичем", name.getResultAblative());
        assertEquals("Иванов", name.getSurname());
        assertEquals("Сергей", name.getName());
        assertEquals("Владимирович", name.getPatronymic());
        assertEquals(Name.Gender.MALE, name.getGender());
    }

    @Test
    public void cleanEmail() throws Exception {
        final Email email = daData.cleanEmail("serega@yandex/ru");

        assertEquals("serega@yandex.ru", email.getEmail());
    }

    @Test
    public void cleanBirthdate() throws Exception {
        final Birthdate birthdate = daData.cleanBirthdate("24/3/12");

        assertEquals("24.03.2012", birthdate.getBirthdate());
    }

    @Test
    public void cleanVehicle() throws Exception {
        final Vehicle vehicle = daData.cleanVehicle("форд фокус");

        assertEquals("FORD FOCUS", vehicle.getResult());
        assertEquals("FORD", vehicle.getBrand());
        assertEquals("FOCUS", vehicle.getModel());
        assertEquals("FOCUS", vehicle.getModel());
    }

}