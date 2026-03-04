package T20_TryCatch.AufgabeMaksim;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Order {
    private final List<Belt> belts = new ArrayList<>();

    public void addBelts(int count, int length) throws IOException {
        for (int i = 0; i < count; i++) {
            belts.add(new Belt(length));
        }
    }

    public int getTotalLengthCm() {
        return belts.stream().mapToInt(Belt::getLength).sum();
    }

    public double getPricePerMeter() {
        int totalLength = getTotalLengthCm();
        if (totalLength < 10_000) return 0.10;
        if (totalLength < 20_000) return 0.08;
        if (totalLength < 40_000) return 0.07;
        return 0.06;
    }

    public double getTotalPrice() {
        double totalMeters = getTotalLengthCm() / 100.0; // cm → meters
        return totalMeters * getPricePerMeter();
    }
}