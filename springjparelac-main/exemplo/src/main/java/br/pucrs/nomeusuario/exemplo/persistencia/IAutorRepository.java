package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;
import java.util.Optional;

public interface IAutorRepository {
    List<Autor> getAutors();
    Optional<Autor> getAutorCodigo(long codigo);
}

