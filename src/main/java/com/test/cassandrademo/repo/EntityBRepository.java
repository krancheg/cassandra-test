package com.test.cassandrademo.repo;

import com.test.cassandrademo.model.EntityA;
import com.test.cassandrademo.model.EntityB;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EntityBRepository extends CassandraRepository<EntityB,String> {
}

