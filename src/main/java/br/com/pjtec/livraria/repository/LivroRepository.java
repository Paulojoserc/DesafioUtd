package br.com.pjtec.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pjtec.livraria.entity.Livro;
@Repository
public interface LivroRepository extends JpaRepository<Livro,Long>{

}
