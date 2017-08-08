package com.epam.hotelbooking.service;

import com.epam.hotelbooking.entity.Apartment;
import com.epam.hotelbooking.entity.ApartmentClass;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class })
public class ApartmentServiceTest {

    @Autowired
    private ApartmentService apartmentService;

    private void showData(List<Apartment> apartments) {
        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
    }

    @Test
    public void findAllTest() {
        List<Apartment> apartments = apartmentService.findAll();
        showData(apartments);
    }

    @Test
    public void findAllFreeTest() {
        List<Apartment> apartments = apartmentService.findAllFree();
        showData(apartments);
    }

    @Test
    public void findFreeByClassTest() {
        List<Apartment> apartments = apartmentService.findFreeByClass("BDRM1");
        showData(apartments);
    }

    @Test
    public void findFreeByRoomQuantity() {
        List<Apartment> apartments = apartmentService.findFreeByRoomQuantity(4);
        showData(apartments);
    }

    @Test
    //@DatabaseSetup("classpath:setup.xml")
    //@ExpectedDatabase("classpath:expected.xml")
    public void saveTest() {

        ApartmentClass apartmentClass = new ApartmentClass();
        apartmentClass.setClassName("BDRM1");

        Apartment apartment = new Apartment();
        apartment.setId("999");
        apartment.setApartmentClass(apartmentClass);
        apartment.setStatus("free");

        apartmentService.save(apartment);

        List<Apartment> apartments = apartmentService.findAllFree();
        showData(apartments);
    }

    @Test
    public void getByIdTest() {
        Apartment apartment = apartmentService.findById("202");
        System.out.println(apartment);
    }

}