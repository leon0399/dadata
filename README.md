DaData Java API
===============

Java library for [DaData.Ru](https://dadata.ru/) REST API

[API documentation](https://dadata.ru/api/clean/)

## Installation
``` xml
<dependency>
    <groupId>ru.leon0399</groupId>
    <artifactId>dadata</artifactId>
    <version>0.8.0</version>
</dependency>
```

## Usage
``` java
DaData dadata = DaData daData = new DaData(">YOUR API KEY<", ">YOUR SECRET KEY<");
```

### Clean
``` java
Address address = daData.cleanAddress("мск сухонска 11/-89");
Phone phone = daData.cleanPhone("тел 7165219 доб139");
Passport passport = daData.cleanPassport("4509 235857");
Name name = daData.cleanName("Срегей владимерович иванов");
Email email = daData.cleanEmail("serega@yandex/ru");
Birthdate birthdate = daData.cleanBirthdate("24/3/12");
Vehicle vehicle = daData.cleanVehicle("форд фокус");
```

### Require balance
``` java
daData.getBalance();
```