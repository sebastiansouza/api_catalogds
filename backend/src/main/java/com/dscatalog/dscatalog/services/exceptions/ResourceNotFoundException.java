package com.dscatalog.dscatalog.services.exceptions;

import org.hibernate.persister.entity.mutation.EntityTableMapping;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
    
}
