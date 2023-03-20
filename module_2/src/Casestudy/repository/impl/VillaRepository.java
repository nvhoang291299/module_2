package Casestudy.repository.impl;

import Casestudy.common.ReadFileFacility;
import Casestudy.common.WriteFile;
import Casestudy.common.WriteFileFacility;
import Casestudy.model.Villa;
import Casestudy.repository.IVillaRepository;

import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private final String PATH = "src/Casestudy/data/villaData.csv";
    @Override
    public Map<String, Integer> displayService() {
        return ReadFileFacility.read(PATH);
    }

    @Override
    public void createVilla(Villa villa) {
        WriteFileFacility.write("src/Casestudy/data/villaData.csv", villa.toCSV());
    }
}
