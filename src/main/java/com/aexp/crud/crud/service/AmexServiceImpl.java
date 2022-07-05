package com.aexp.crud.crud.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aexp.crud.crud.model.AmexIntern;
import com.aexp.crud.crud.repository.AmexRepo;

@Service
public class AmexServiceImpl implements AmexService {
    @Autowired
	private AmexRepo repo;

    @Override
    public AmexIntern saveIntern(AmexIntern AmexIntern) {
        return repo.save(AmexIntern);
    }

    @Override
    public List<AmexIntern> fetchInternList() {
        return (List<AmexIntern>) repo.findAll();
    }

    @Override
    public AmexIntern updateIntern(AmexIntern AmexIntern, Long Id) {
        AmexIntern internDB = repo.findById(Id).get();

        if (Objects.nonNull(AmexIntern.getName()) && !"".equalsIgnoreCase(AmexIntern.getName())) {
            internDB.setName(AmexIntern.getName());
        }

        if (Objects.nonNull(AmexIntern.getEmail()) && !"".equalsIgnoreCase(AmexIntern.getEmail())) {
            internDB.setEmail(AmexIntern.getEmail());
        }

        return repo.save(internDB);
    }

    @Override
    public void deleteInternById(Long Id) {
        repo.deleteById(Id);
    }
}

