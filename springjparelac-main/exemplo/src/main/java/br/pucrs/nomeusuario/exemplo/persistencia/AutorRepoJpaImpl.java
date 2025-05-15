package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class AutorRepoJpaImpl implements IAutorRepository {
    private IAutorJpaItfRep repository;

    @Autowired
    public AutorRepoJpaImpl(IAutorJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Autor> getAutors() {
        List<Autor> autor = repository.findAll();
        return autor;
        
    }

    @Override
    public Optional<Autor> getAutorCodigo(long codigo) {
        Optional<Autor> autor = repository.findById(codigo);
        return autor;
    }

}