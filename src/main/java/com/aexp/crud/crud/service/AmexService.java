package com.aexp.crud.crud.service;

import com.aexp.crud.crud.model.AmexIntern;
import java.util.List;

public interface AmexService {
    // Create operation
    AmexIntern saveIntern(AmexIntern AmexIntern);

	// Read operation
	List<AmexIntern> fetchInternList();

	// Update operation
	AmexIntern updateIntern(AmexIntern AmexIntern, Long Id);

	// Delete operation
	void deleteInternById(Long Id);
}