package Casestudy.repository.impl;

import Casestudy.common.WriteFile;
import Casestudy.common.WriteFileFacility;
import Casestudy.model.Villa;
import Casestudy.repository.IVillaRepository;

public class VillaRepository implements IVillaRepository {
    @Override
    public void createVilla(Villa villa) {
        WriteFileFacility.write("src/Casestudy/data/facility.csv", villa.toCSV());
    }
}
