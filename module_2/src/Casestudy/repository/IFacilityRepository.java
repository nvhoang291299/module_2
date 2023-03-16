package Casestudy.repository;

import java.util.Map;

public interface IFacilityRepository {
    void createFacility();

    Map<String, Integer> getAll();
}
