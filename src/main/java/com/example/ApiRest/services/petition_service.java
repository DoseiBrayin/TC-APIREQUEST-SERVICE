package com.example.ApiRest.services;
import com.example.ApiRest.models.petition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import com.example.ApiRest.repsositories.petition_repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class petition_service implements petition_repository{
    @Autowired
    private petition_repository petition_repository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends petition> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends petition> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<petition> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public petition getOne(String s) {
        return null;
    }

    @Override
    public petition getById(String s) {
        return null;
    }

    @Override
    public petition getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends petition> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends petition> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends petition> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends petition> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends petition> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends petition> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends petition, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends petition> S save(S entity) {
        return petition_repository.save(entity);
    }

    @Override
    public <S extends petition> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<petition> findById(String s) {
        return petition_repository.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<petition> findAll() {
        return petition_repository.findAll();
    }

    @Override
    public List<petition> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return petition_repository.count();
    }

    @Override
    public void deleteById(String s) {
        petition_repository.deleteById(s);
    }

    @Override
    public void delete(petition entity) {
        petition_repository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends petition> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<petition> findAll(Sort sort) {
        return petition_repository.findAll(sort);
    }

    @Override
    public Page<petition> findAll(Pageable pageable) {
        return null;
    }
}
