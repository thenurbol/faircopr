package com.esme.spring.faircorp.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomDaoCustom {
    @Query("SELECT r FROM Room r WHERE r.name=:name")
    Room findByName(@Param("name") String name);
}
