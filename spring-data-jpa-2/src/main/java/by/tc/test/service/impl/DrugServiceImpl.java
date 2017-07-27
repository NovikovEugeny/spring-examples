package by.tc.test.service.impl;

import by.tc.test.entity.Drug;
import by.tc.test.repository.DrugRepository;
import by.tc.test.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugRepository drugRepository;

    @Override
    public Drug findDrugById(int id) {
        return drugRepository.findDrugById(id);
    }

}