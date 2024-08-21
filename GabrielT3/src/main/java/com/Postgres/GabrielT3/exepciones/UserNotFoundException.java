package com.Postgres.GabrielT3.exepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Usuario No Encontrado")
public class UserNotFoundException extends RuntimeException{
}
