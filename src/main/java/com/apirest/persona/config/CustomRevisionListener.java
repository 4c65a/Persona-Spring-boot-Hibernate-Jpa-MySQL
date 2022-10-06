package com.apirest.persona.config;

import org.hibernate.Hibernate;
import org.hibernate.envers.RevisionListener;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "custom_revision_listener")
public class CustomRevisionListener implements RevisionListener {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void newRevision(Object revisionEntity) {

    }

}