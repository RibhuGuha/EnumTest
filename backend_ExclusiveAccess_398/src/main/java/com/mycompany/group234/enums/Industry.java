package com.mycompany.group234.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum Industry{
	    IT,
	    Hospital,
	    Education; 
    public int value(Industry industry) {
        return industry.ordinal();
    }
    public static Industry getIndustry(int ordinal) {
        for(Industry industry : Industry.values())
                if(industry.ordinal() == ordinal)
                        return industry;
        return null;
    }
}


