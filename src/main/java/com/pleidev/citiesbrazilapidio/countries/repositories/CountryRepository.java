package com.pleidev.citiesbrazilapidio.countries.repositories;

import com.pleidev.citiesbrazilapidio.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public class CountryRepository extends JpaRepository<Country, Long> {
    
}
