package io.fdlessard.codebites.equals.implementations.lombok;

import com.fasterxml.jackson.annotation.JsonProperty;

abstract class AddressMixIn {

    @JsonProperty("nomDeRue") abstract String getStreetName();
    @JsonProperty("nomDeRue") abstract void setStreetName(String streetName);
}
