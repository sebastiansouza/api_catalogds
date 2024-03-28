package com.dscatalog.dscatalog.services.exceptions;

import org.hibernate.persister.entity.mutation.EntityTableMapping;

public class EntityNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EntityNotFoundException(String msg) {
        super(msg);
    }
    
}
