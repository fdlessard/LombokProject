package io.fdlessard.codebites.equals.implementations.manual;

import io.fdlessard.codebites.equals.implementations.lombok.Address;

public class ExtendedAddress extends Address {

    private String county;




    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtendedAddress)) return false;
        if (!super.equals(o)) return false;

        ExtendedAddress that = (ExtendedAddress) o;

        return county != null ? county.equals(that.county) : that.county == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (county != null ? county.hashCode() : 0);
        return result;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExtendedAddress{");
        sb.append("county='").append(county).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
