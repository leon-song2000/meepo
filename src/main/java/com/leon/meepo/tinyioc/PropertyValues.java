package com.leon.meepo.tinyioc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songlin01 on 17/7/21.
 */
public class PropertyValues {

    List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }

    public void setPropertyValueList(List<PropertyValue> propertyValueList) {
        this.propertyValueList = propertyValueList;
    }

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }
}
