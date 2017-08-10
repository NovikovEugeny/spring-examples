package com.epam.hotelbooking.repository;

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

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class })
public class ApartmentRepositoryTest {

    @Autowired
    private ApartmentRepository apartmentRepository;

    private void showData(List<Apartment> apartments) {
        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
    }

    @Test
    public void findAllTest() {
        List<Apartment> apartments = apartmentRepository.findAll();
        showData(apartments);
    }

    @Test
    public void findAllFreeTest() {
        List<Apartment> apartments = apartmentRepository.findAllFree();
        showData(apartments);
    }

    @Test
    public void findFreeByClassTest() {
        List<Apartment> apartments = apartmentRepository.findFreeByClass("BDRM1");
        showData(apartments);
    }

    @Test
    public void findFreeByRoomQuantity() {
        List<Apartment> apartments = apartmentRepository.findFreeByRoomQuantity(4);
        showData(apartments);
    }

    @Test
    //@DatabaseSetup("classpath:xmldb/setup.xml")
    //@ExpectedDatabase("classpath:xmldb/expected.xml")
    public void saveTest() {

        int quantityBefore = apartmentRepository.findAll().size();

        ApartmentClass apartmentClass = new ApartmentClass();
        apartmentClass.setClassName("BDRM1");

        Apartment apartment = new Apartment();
        apartment.setId("999");
        apartment.setApartmentClass(apartmentClass);
        apartment.setStatus("free");

        apartmentRepository.save(apartment);

        int quantityAfter = apartmentRepository.findAll().size();

        assertEquals(quantityBefore + 1, quantityAfter);
    }

    @Test
    public void getByIdTest() {
        Apartment apartment = apartmentRepository.findById("202");
        System.out.println(apartment);
    }

    @Test
    public void removeTest() {
        int quantityBefore = apartmentRepository.findAll().size();
        apartmentRepository.remove("201");
        int quantityAfter = apartmentRepository.findAll().size();
        assertEquals(quantityBefore - 1, quantityAfter);
    }

}