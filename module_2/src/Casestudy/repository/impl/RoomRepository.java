package Casestudy.repository.impl;

import Casestudy.common.ReadFile;
import Casestudy.common.ReadFileFacility;
import Casestudy.common.WriteFileFacility;
import Casestudy.model.Room;
import Casestudy.model.Villa;
import Casestudy.repository.IRoomRepository;

import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private final String PATH = "src/Casestudy/data/roomData.csv";
    @Override
    public Map<String, Integer> displayService() {
        return ReadFileFacility.read(PATH);
    }

    @Override
    public void createRoom(Room room) {
        WriteFileFacility.write("src/Casestudy/data/roomData.csv", room.toCSV());
    }
}
