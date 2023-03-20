package Casestudy.repository.impl;

import Casestudy.common.ReadFile;
import Casestudy.common.ReadFileFacility;
import Casestudy.common.WriteFile;
import Casestudy.common.WriteFileFacility;
import Casestudy.model.House;
import Casestudy.repository.IFacilityRepository;
import Casestudy.repository.IHouseRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class HouseRepository implements IHouseRepository {
    private final String PATH = "src/Casestudy/data/houseData.csv";
    @Override
    public Map<String, Integer> displayService() {
        return ReadFileFacility.read(PATH);
    }

    @Override
    public void createHouse(House house) {
            WriteFileFacility.write("src/Casestudy/data/houseData.csv", house.toCSV());
    }
}
