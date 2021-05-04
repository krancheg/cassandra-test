package com.test.cassandrademo.model;

import com.datastax.driver.core.DataType;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.*;

@Data
@Table("EntityA")
public class EntityA {

    @Column
    @PrimaryKey
    private String name;

    @Column
    private String description;

    @Frozen
    @Column
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "identifier")
    private Identifier entityIdentifier;

    protected EntityA() {}

    public EntityA(String name, String description, @Frozen Identifier entityIdentifier) {
        this.name = name;
        this.description = description;
        this.entityIdentifier = entityIdentifier;
    }
}
