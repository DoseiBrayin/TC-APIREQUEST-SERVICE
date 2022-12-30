package com.example.ApiRest.services;
import com.example.ApiRest.models.type_service;
import com.example.ApiRest.repsositories.type_service_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class type_service_service implements type_service_repository {
    @Autowired
    private  type_service_repository type_service_repository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends type_service> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends type_service> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<type_service> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public type_service getOne(String s) {
        return null;
    }

    @Override
    public type_service getById(String s) {
        return null;
    }

    @Override
    public type_service getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends type_service> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends type_service> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends type_service> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends type_service> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends type_service> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends type_service> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends type_service, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends type_service> S save(S entity) {
        return null;
    }

    @Override
    public <S extends type_service> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<type_service> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<type_service> findAll() {
        return null;
    }

    @Override
    public List<type_service> findAllById(Iterable<String> strings) {
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
    public void delete(type_service entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends type_service> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<type_service> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<type_service> findAll(Pageable pageable) {
        return null;
    }
}
