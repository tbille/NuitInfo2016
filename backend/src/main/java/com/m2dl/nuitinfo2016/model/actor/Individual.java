package com.m2dl.nuitinfo2016.model.actor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Individual extends Actor {

    @Id
    private Long id;
}
