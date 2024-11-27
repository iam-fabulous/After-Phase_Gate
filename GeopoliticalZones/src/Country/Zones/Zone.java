package Country.Zones;

import java.util.Arrays;

public enum Zone {
    NORTHCENTRAL("Nassarawa", "Niger", "Benue", "FCT", "Kogi", "Plateau"),
    NORTHWEST("Sokoto", "Katsina", "Kano", "Kaduna", "Kebbi", "Jigawa", "Zamfara"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    SOUTHSOUTH("Edo", "Delta", "Akwa-Ibom", "Bayelsa", "Cross-River", "Rivers"),
    SOUTHWEST("Oyo", "Ogun", "Ekiti", "Lagos", "Osun", "Ondo"),
    SOUTHEAST("Abia", "Ebonyi", "Anambara", "Imo", "Enugu"),;

    private final String [] state;

    Zone(String... state) {
        this.state = state;
    }

    public String [] getState() {
        return state;
    }

    public Zone getZone(String state) {
        return Zone.values()[ordinal()];
    }
    public String[] toString(String state) {
        return Zone.valueOf(state.toLowerCase()).getState();
    }

    public static Zone getZoneName(String state) {
        Zone geoZone = null;
        for (Zone zone : Zone.values()) {
            if (Arrays.asList(zone.getState()).contains(state)) {
                geoZone = zone;
                break;
            }
        }
        return geoZone;
    }




}
