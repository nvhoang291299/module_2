package Casestudy.repository.impl;

import Casestudy.common.WriteFile;
import Casestudy.common.WriteFileFacility;
import Casestudy.model.House;
import Casestudy.model.Villa;
import Casestudy.repository.IHouseRepository;

public class HouseRepository implements IHouseRepository {
    @Override
    public void createHouse(House house) {
            WriteFileFacility.write("src/Casestudy/data/facility.csv", house.toCSV());
    }
}
