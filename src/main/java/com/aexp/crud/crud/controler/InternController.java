package com.aexp.crud.crud.controler;

import org.springframework.web.bind.annotation.RestController;
import com.aexp.crud.crud.model.AmexIntern;
import com.aexp.crud.crud.service.AmexService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class InternController {

    @Autowired private AmexService repo;

    @GetMapping(value="/")
    public String defaultState() {
        return "Hey!, Welcome to Spring Crud Application by Pranav" + "\r\n" + "checkout /getInterns to get list of all available interns";
    }

    @GetMapping(value="getInterns")
    public List<AmexIntern> getIntern() {
        return repo.fetchInternList();
    }

    @PostMapping(value="addIntern")
    public AmexIntern addIntern(@RequestBody AmexIntern AmexIntern){
        return repo.saveIntern(AmexIntern);
    }

    @PostMapping(value="updateIntern/{id}")
    public AmexIntern updateIntern(@RequestBody AmexIntern AmexIntern, @PathVariable("id") Long Id){
        repo.updateIntern(AmexIntern,Id);
        return AmexIntern;
    }
    
    @PostMapping(value="deleteIntern/{id}")
    public String deleteIntern(@PathVariable("id") Long Id){
        repo.deleteInternById(Id);
        return "deleted " + Id;
    }
}