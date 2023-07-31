package diary.example.data.repositories.Mocks.RepositoriesMocls;

import diary.example.data.models.Entry;
import diary.example.data.repositories.EntryRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class EntryRepositoryMock implements EntryRepository {
    private int counter;
    @Override
    public <S extends Entry> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Entry> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Entry> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Entry> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Entry> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Entry> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Entry> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Entry> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Entry, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Entry> S save(S entity) {
        counter++;
        return null;
    }

    @Override
    public <S extends Entry> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Entry> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Entry> findAll() {
        return null;
    }

    @Override
    public List<Entry> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return counter;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Entry entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Entry> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Entry> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Entry> findAll(Pageable pageable) {
        return null;
    }
}
