package com.mycompany.group234.converter;

import com.mycompany.group234.enums.Industry;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class IndustryConverter implements AttributeConverter<Industry, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Industry industry) {
        return industry != null ? industry.ordinal() : null;
    }

    @Override
    public Industry convertToEntityAttribute(Integer dbData) {
		return Industry.getIndustry(dbData);
    }
}
