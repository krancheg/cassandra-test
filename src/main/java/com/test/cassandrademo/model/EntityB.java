package com.test.cassandrademo.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("EntityB")
public class EntityB {

    @Column
    @PrimaryKey
    private String name;

    @Column
    private String description;

    public EntityB() {}

    public EntityB(
            String name,
            String description) {
        this.name = name;
        this.description = description;
    }

}
