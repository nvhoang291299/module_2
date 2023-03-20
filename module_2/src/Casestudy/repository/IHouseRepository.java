package Casestudy.repository;

import Casestudy.model.House;

import java.util.Map;

public interface IHouseRepository {
    public Map<String, Integer> displayService();
    void createHouse(House house);
}
