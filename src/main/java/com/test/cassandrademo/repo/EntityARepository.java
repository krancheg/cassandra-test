package com.test.cassandrademo.repo;

import com.test.cassandrademo.model.EntityA;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EntityARepository extends CassandraRepository<EntityA,String> {
}
