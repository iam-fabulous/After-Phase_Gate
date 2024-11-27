package Country.ZonesTest;


import Country.Zones.Zone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZoneTest {
    Zone zone;
    @Test
    public void testThatNorthCentralZoneReturnState(){
        String given = "Niger";
        zone = Zone.getZoneName(given);
        String expected = String.valueOf(Zone.NORTHCENTRAL);
        assertEquals(zone.toString(), expected);
    }

    @Test
    public void testThatSouthEastZoneReturnState(){
        String given = "Abia";
        zone = Zone.getZoneName(given);
        String expected = String.valueOf(Zone.SOUTHEAST);
        assertEquals(zone.toString(), expected);
    }

    @Test
    public void testThatSouthWestZoneReturnState(){
        String given = "Ekiti";
        zone = Zone.getZoneName(given);
        String expected = String.valueOf(Zone.SOUTHWEST);
        assertEquals(zone.toString(), expected);
    }

    @Test
    public void testThatSouthSouthZoneReturnState(){
        String given = "Cross-River";
        zone = Zone.getZoneName(given);
        String Expected = String.valueOf(Zone.SOUTHSOUTH);
        assertEquals(zone.toString(), Expected);
    }

    @Test
    public void testThatNorthWestZoneReturnState(){
        String given = "Kaduna";
        zone = Zone.getZoneName(given);
        String expected = String.valueOf(Zone.NORTHWEST);
        assertEquals(zone.toString(), expected);
    }

    @Test
    public void testThatNorthEastZoneReturnState(){
        String given = "Bauchi";
        zone = Zone.getZoneName(given);
        String expected = String.valueOf(Zone.NORTHEAST);
        assertEquals(zone.toString(), expected);
    }
}
