package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
