package com.m2dl.nuitinfo2016.model.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by Paul.Faidherbe on 01/12/2016.
 */
@Entity
public class Hebergement extends Service {

    @Id
    private Long id;
    @Min(value = 0)
    private int placesAvailable;
}
