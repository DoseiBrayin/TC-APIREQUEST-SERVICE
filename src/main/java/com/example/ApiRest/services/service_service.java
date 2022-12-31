package com.example.ApiRest.services;
import com.example.ApiRest.models.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import com.example.ApiRest.repsositories.service_repositiry;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class service_service implements service_repositiry {
    @Autowired
    private  service_repositiry service_repositiry;

    @Override
    public void flush() {

    }

    @Override
    public <S extends service> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends service> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<service> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public service getOne(String s) {
        return null;
    }

    @Override
    public service getById(String s) {
        return null;
    }

    @Override
    public service getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends service> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends service> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends service> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends service> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends service> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends service> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends service, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends service> S save(S entity) {
        return service_repositiry.save(entity);
    }

    @Override
    public <S extends service> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<service> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<service> findAll() {
        return service_repositiry.findAll();
    }

    @Override
    public List<service> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(service entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends service> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<service> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<service> findAll(Pageable pageable) {
        return null;
    }
}
