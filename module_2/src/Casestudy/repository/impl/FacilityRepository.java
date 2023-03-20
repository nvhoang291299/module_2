package Casestudy.repository.impl;


import Casestudy.common.ReadFileFacility;
import Casestudy.model.House;
import Casestudy.model.Room;
import Casestudy.model.Villa;
import Casestudy.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

//public class FacilityRepository implements IFacilityRepository {
//    @Override
//    public Map<String, Integer> getAll() {
//        for (String str: map.keySet()) {
//            String[] temp = str.split(",");
//            if (temp.length > 7){
//                Villa villa = new Villa(temp[0], Float.parseFloat(temp[1]), Double.parseDouble(temp[2]), Integer.parseInt(temp[3]),
//                        temp[4], temp[5], Float.parseFloat(temp[6]), Byte.parseByte(temp[7]), temp[8]);
//                Map<Villa, Integer> facilitys = new LinkedHashMap<>();
//                facilitys.put(villa, 1);
//            } else if (temp.length == 8) {
//                House house = new House(temp[0], Float.parseFloat(temp[1]), Double.parseDouble(temp[2]), Integer.parseInt(temp[3]),
//                        temp[4], temp[5], Byte.parseByte(temp[6]), Integer.parseInt(temp[7]));
//                Map<House, Integer> facilitys = new LinkedHashMap<>();
//                facilitys.put(house, 1);
//            } else if (temp.length == 7) {
//                Room room = new Room(temp[0], Float.parseFloat(temp[1]), Double.parseDouble(temp[2]), Integer.parseInt(temp[3]),
//                        temp[4], temp[5], Integer.parseInt(temp[6]));
//                Map<Room, Integer> facilitys = new LinkedHashMap<>();
//                facilitys.put(room, 1);
//            }
//        }
//        return map;
//    }
//}
