package Casestudy.repository;

import Casestudy.model.Villa;

import java.util.Map;

public interface IVillaRepository {
        public Map<String, Integer> displayService();
        void createVilla(Villa villa);
}
