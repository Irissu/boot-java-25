package com.example.catalogo_microservicios.domains.entities.dtos;

import org.springframework.beans.factory.annotation.Value;

public interface ActorShort {
    int getActorId();
    //@Value("#{target.firstName + '' + target.lastName}")
    String getNombre();
}
