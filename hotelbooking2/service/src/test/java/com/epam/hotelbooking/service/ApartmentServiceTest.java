package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.repository.ApartmentRepository;
import com.epam.hotelbooking.service.impl.ApartmentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ApartmentServiceTest {

    @Mock
    private ApartmentRepository apartmentRepository;

    @InjectMocks
    private ApartmentServiceImpl apartmentService;

    @Test
    public void findAllTest() {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new Apartment());
        apartments.add(new Apartment());
        apartments.add(new Apartment());

        when(apartmentRepository.findAll()).thenReturn(apartments);

        List<Apartment> result = apartmentService.findAll();
        assertEquals(3, result.size());
    }

    @Test
    public void findByIdTest() {
        Apartment apartment = new Apartment();
        apartment.setId("201");

        when(apartmentRepository.findById("201")).thenReturn(apartment);

        Apartment result = apartmentService.findById("201");
        assertEquals(apartment.getId(), result.getId());
    }

    @Test
    public void remove() {
        apartmentService.remove("");
        verify(apartmentRepository, times(1)).remove("");
    }

}