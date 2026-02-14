package com.projetowebservice.course.exceptions;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class ResourceNotFoundedException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundedException(Long msg){
        super("Resource not founded. Id " + id);
    }

}
