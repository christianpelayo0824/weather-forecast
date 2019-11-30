package com.project.service;

import com.project.repository.BaseRepository;

public abstract class GenericServiceImp<T, I> implements  GenericService{

    private BaseRepository baseRepository;

}
