package com.test.cassandrademo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType(value = "identifier")
@Getter
@Setter
public class Identifier {

    private String idKey;

    private String idType;

    private String value;

    public Identifier(String idKey, String idType, String value) {
        this.idKey = idKey;
        this.idType = idType;
        this.value = value;
    }
}
