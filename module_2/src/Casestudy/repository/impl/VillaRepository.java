package Casestudy.repository.impl;

import Casestudy.common.WriteFile;
import Casestudy.model.Villa;
import Casestudy.service.IVillaRepository;

public class VillaRepository implements IVillaRepository {
    @Override
    public void createVilla(Villa villa) {
        WriteFile.write("src/Casestudy/data/facility.csv", villa.toCSV());
    }
}
