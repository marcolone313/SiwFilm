package it.uniroma3.siw.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	
    public List<Movie> findAllByYear(Integer year);
    public boolean existsByTitleAndYear(String title, Integer year);
    
    //Varie Operazioni CRUD
    /*public List<Movie> findAllByOrderByYearAsc();
    public List<Movie> findAllByYearGreaterThan(Integer year);
    public List<Movie> findAllByYearLessThan(Integer Year);
    public List<Movie> findAllByOrderByTitleDesc();*/
}
