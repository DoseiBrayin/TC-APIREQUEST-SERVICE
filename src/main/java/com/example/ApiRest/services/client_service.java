package com.example.ApiRest.services;
import com.example.ApiRest.models.client;
import com.example.ApiRest.repsositories.client_repository;
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
public class client_service implements client_repository {
    @Autowired
    private client_repository client_repository;



    @Override
    public void flush() {
    }

    @Override
    public <S extends client> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends client> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<client> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public client getOne(String s) {
        return null;
    }

    @Override
    public client getById(String s) {
        return null;
    }

    @Override
    public client getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends client> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends client> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends client> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends client> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends client> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends client> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends client, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends client> S save(S entity) {
        return null;
    }

    @Override
    public <S extends client> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<client> findById(String s) {
        return client_repository.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<client> findAll() {
        return client_repository.findAll();
    }

    @Override
    public List<client> findAllById(Iterable<String> strings) {
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
    public void delete(client entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends client> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<client> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<client> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<client> findClient(String client) {
        return client_repository.findClient(client);
    }
}
